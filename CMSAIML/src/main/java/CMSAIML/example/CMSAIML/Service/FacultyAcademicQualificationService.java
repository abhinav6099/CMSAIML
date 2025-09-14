package CMSAIML.example.CMSAIML.Service;



import CMSAIML.example.CMSAIML.Entity.FacultyAcademicQualification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FacultyAcademicQualificationService {

    private final List<FacultyAcademicQualification> qualifications = new ArrayList<>();

    public void addQualification(FacultyAcademicQualification qualification) {
        qualifications.add(qualification);
    }

    public List<FacultyAcademicQualification> getAllQualifications() {
        return qualifications;
    }

    public FacultyAcademicQualification getByFacultyId(String facultyId) {
        return qualifications.stream()
                .filter(q -> q.getFacultyId().equalsIgnoreCase(facultyId))
                .findFirst()
                .orElse(null);
    }

    public boolean deleteByFacultyId(String facultyId) {
        return qualifications.removeIf(q -> q.getFacultyId().equalsIgnoreCase(facultyId));
    }
}
