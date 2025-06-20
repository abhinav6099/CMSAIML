package CMSAIML.example.CMSAIML.Service;

import CMSAIML.example.CMSAIML.Entity.Admin;
import CMSAIML.example.CMSAIML.Entity.Student;
import CMSAIML.example.CMSAIML.Entity.Faculty;
import CMSAIML.example.CMSAIML.repository.AdminRepository;
import CMSAIML.example.CMSAIML.repository.StudentRepository;
import CMSAIML.example.CMSAIML.repository.FacultyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDate;


import java.util.List;
import java.util.Optional;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;

@Service
@RequiredArgsConstructor
public class AdminService {

    private final AdminRepository adminRepository;
    private final StudentRepository studentRepository;
    private final FacultyRepository facultyRepository;



    // -------------------- Admin Authentication --------------------
    public Optional<Admin> authenticateAdmin(String username, String password) {
        return adminRepository.findByUsernameAndPassword(username, password);
    }

    public boolean isAdmin(String username) {
        return adminRepository.findByUsername(username)
                .map(admin -> admin.getUsername().equals("admin"))
                .orElse(false);
    }

    // -------------------- Student Methods --------------------
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public void saveStudentsFromExcel(MultipartFile file) throws Exception {
        try (InputStream is = file.getInputStream(); Workbook workbook = new XSSFWorkbook(is)) {
            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                if (row.getRowNum() == 0) continue; // Skip header

                Student student = new Student();
                student.setId(Long.parseLong(getCellValueAsString(row.getCell(0))));
                student.setBranch(getCellValueAsString(row.getCell(1)));
                student.setCgpa(Double.parseDouble(getCellValueAsString(row.getCell(2))));
                student.setCourse(getCellValueAsString(row.getCell(3)));
                student.setDateOfBirth(LocalDate.parse(getCellValueAsString(row.getCell(4)))); // use DateUtil if needed
                student.setEmail(getCellValueAsString(row.getCell(5)));
                student.setGender(getCellValueAsString(row.getCell(6)));
                student.setName(getCellValueAsString(row.getCell(7)));
                student.setStatus(getCellValueAsString(row.getCell(8)));
                student.setYear(Integer.parseInt(getCellValueAsString(row.getCell(9))));
                student.setYearOfAdmission(Integer.parseInt(getCellValueAsString(row.getCell(10))));
                student.setYearOfGraduation(Integer.parseInt(getCellValueAsString(row.getCell(11))));

                // Save only if name and course are present (optional but safer)
                if (student.getName() != null && student.getCourse() != null) {
                    studentRepository.save(student);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException("Failed to process Excel file: " + e.getMessage(), e);
        }
    }

    private String getCellValueAsString(Cell cell) {
        if (cell == null) return null;

        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue().trim();
            case NUMERIC:
                if (DateUtil.isCellDateFormatted(cell)) {
                    return cell.getLocalDateTimeCellValue().toLocalDate().toString(); // LocalDate
                } else {
                    // Avoid "1.0" as a string — cast to int if appropriate
                    double val = cell.getNumericCellValue();
                    if (val == Math.floor(val)) {
                        return String.valueOf((int) val); // Convert 1.0 to "1"
                    } else {
                        return String.valueOf(val); // Leave 1.5 as "1.5"
                    }
                }
            case BOOLEAN:
                return Boolean.toString(cell.getBooleanCellValue());
            case FORMULA:
                return cell.getCellFormula();
            case BLANK:
            case _NONE:
            case ERROR:
            default:
                return null;
        }
    }



    public Student updateStudent(Long id, Student student) {
        student.setId(id);
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    // -------------------- Faculty Methods --------------------
    public List<Faculty> getAllFaculty() {
        return facultyRepository.findAll();
    }

    public Faculty getFacultyById(Long id) {
        return facultyRepository.findById(id).orElse(null);
    }


    public Faculty addFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public Faculty updateFaculty(Long id, Faculty faculty) {
        faculty.setId(id);
        return facultyRepository.save(faculty);
    }

    public void deleteFaculty(Long id) {
        facultyRepository.deleteById(id);
    }
    public void saveFacultyFromExcel(MultipartFile file) throws IOException, IOException {
        InputStream inputStream = file.getInputStream();
        Workbook workbook = new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheetAt(0);

        for (Row row : sheet) {
            if (row.getRowNum() == 0) continue; // Skip header row

            Faculty faculty = new Faculty();
            faculty.setName(row.getCell(0).getStringCellValue());
            faculty.setEmail(row.getCell(1).getStringCellValue());
            faculty.setDepartment(row.getCell(2).getStringCellValue());
            faculty.setMobile_no(row.getCell(3).getStringCellValue());
            faculty.setTeaching_experience((int) row.getCell(4).getNumericCellValue());
            faculty.setIndustrial_experience((int) row.getCell(5).getNumericCellValue());
            faculty.setDesignation(row.getCell(6).getStringCellValue());

            addFaculty(faculty); // Reuse existing method to save
        }

        workbook.close();

    }


}