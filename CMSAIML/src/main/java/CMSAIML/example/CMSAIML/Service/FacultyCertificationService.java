package CMSAIML.example.CMSAIML.Service;



import CMSAIML.example.CMSAIML.Entity.FacultyCertificationEarned;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FacultyCertificationService {

    private final List<FacultyCertificationEarned> certifications = new ArrayList<>();

    public void addCertification(FacultyCertificationEarned certification) {
        certifications.add(certification);
    }

    public List<FacultyCertificationEarned> getAllCertifications() {
        return certifications;
    }

    public FacultyCertificationEarned getByCertificationName(String certificationName) {
        return certifications.stream()
                .filter(c -> c.getCertificationName().equalsIgnoreCase(certificationName))
                .findFirst()
                .orElse(null);
    }

    public boolean deleteByCertificationName(String certificationName) {
        return certifications.removeIf(c -> c.getCertificationName().equalsIgnoreCase(certificationName));
    }
}
