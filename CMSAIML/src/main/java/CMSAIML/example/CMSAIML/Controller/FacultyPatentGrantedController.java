package CMSAIML.example.CMSAIML.Controller;


import CMSAIML.example.CMSAIML.Entity.FacultyPatentGranted;
import CMSAIML.example.CMSAIML.Service.FacultyPatentGrantedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculty-patents")
public class FacultyPatentGrantedController {

    @Autowired
    private FacultyPatentGrantedService patentService;

    @PostMapping("/add")
    public String addPatent(@RequestBody FacultyPatentGranted patent) {
        patentService.addPatent(patent);
        return "Faculty patent added successfully.";
    }

    @GetMapping("/all")
    public List<FacultyPatentGranted> getAllPatents() {
        return patentService.getAllPatents();
    }

    @GetMapping("/get/{grantNumber}")
    public FacultyPatentGranted getPatent(@PathVariable String grantNumber) {
        FacultyPatentGranted patent = patentService.getPatentByGrantNumber(grantNumber);
        if (patent != null) return patent;
        throw new RuntimeException("Patent not found.");
    }

    @DeleteMapping("/delete/{grantNumber}")
    public String deletePatent(@PathVariable String grantNumber) {
        boolean removed = patentService.deletePatent(grantNumber);
        return removed ? "Patent deleted successfully." : "Patent not found.";
    }
}
