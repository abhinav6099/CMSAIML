package CMSAIML.example.CMSAIML.Controller;


import CMSAIML.example.CMSAIML.Entity.FacultyAcademicQualification;
import CMSAIML.example.CMSAIML.Service.FacultyAcademicQualificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculty-qualifications")
public class FacultyAcademicQualificationController {

    @Autowired
    private FacultyAcademicQualificationService qualificationService;

    @PostMapping("/add")
    public String addQualification(@RequestBody FacultyAcademicQualification qualification) {
        qualificationService.addQualification(qualification);
        return "Qualification added successfully.";
    }

    @GetMapping("/all")
    public List<FacultyAcademicQualification> getAllQualifications() {
        return qualificationService.getAllQualifications();
    }

    @GetMapping("/get/{facultyId}")
    public FacultyAcademicQualification getQualification(@PathVariable String facultyId) {
        FacultyAcademicQualification q = qualificationService.getByFacultyId(facultyId);
        if (q != null) return q;
        throw new RuntimeException("Qualification not found.");
    }

    @DeleteMapping("/delete/{facultyId}")
    public String deleteQualification(@PathVariable String facultyId) {
        boolean removed = qualificationService.deleteByFacultyId(facultyId);
        return removed ? "Qualification deleted successfully." : "Qualification not found.";
    }
}
