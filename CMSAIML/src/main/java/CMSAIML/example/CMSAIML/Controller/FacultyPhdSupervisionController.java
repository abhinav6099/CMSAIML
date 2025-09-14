package CMSAIML.example.CMSAIML.Controller;


import CMSAIML.example.CMSAIML.Entity.FacultyPhdSupervision;
import CMSAIML.example.CMSAIML.Service.FacultyPhdSupervisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculty-phd-supervision")
public class FacultyPhdSupervisionController {

    @Autowired
    private FacultyPhdSupervisionService supervisionService;

    @PostMapping("/add")
    public String addSupervision(@RequestBody FacultyPhdSupervision supervision) {
        supervisionService.addSupervision(supervision);
        return "Ph.D. supervision record added.";
    }

    @GetMapping("/all")
    public List<FacultyPhdSupervision> getAllSupervisions() {
        return supervisionService.getAllSupervisions();
    }

    @GetMapping("/get/{scholarName}")
    public FacultyPhdSupervision getSupervision(@PathVariable String scholarName) {
        FacultyPhdSupervision record = supervisionService.getByScholarName(scholarName);
        if (record != null) return record;
        throw new RuntimeException("Scholar not found.");
    }

    @DeleteMapping("/delete/{scholarName}")
    public String deleteSupervision(@PathVariable String scholarName) {
        boolean removed = supervisionService.deleteByScholarName(scholarName);
        return removed ? "Supervision deleted." : "Scholar not found.";
    }
}
