package CMSAIML.example.CMSAIML.Controller;


import CMSAIML.example.CMSAIML.Entity.FacultyCertificationEarned;
import CMSAIML.example.CMSAIML.Service.FacultyCertificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculty-certifications")
public class FacultyCertificationController {

    @Autowired
    private FacultyCertificationService certificationService;

    @PostMapping("/add")
    public String addCertification(@RequestBody FacultyCertificationEarned certification) {
        certificationService.addCertification(certification);
        return "Certification added successfully.";
    }

    @GetMapping("/all")
    public List<FacultyCertificationEarned> getAllCertifications() {
        return certificationService.getAllCertifications();
    }

    @GetMapping("/get/{certificationName}")
    public FacultyCertificationEarned getCertification(@PathVariable String certificationName) {
        FacultyCertificationEarned cert = certificationService.getByCertificationName(certificationName);
        if (cert != null) return cert;
        throw new RuntimeException("Certification not found.");
    }

    @DeleteMapping("/delete/{certificationName}")
    public String deleteCertification(@PathVariable String certificationName) {
        boolean removed = certificationService.deleteByCertificationName(certificationName);
        return removed ? "Certification deleted successfully." : "Certification not found.";
    }
}
