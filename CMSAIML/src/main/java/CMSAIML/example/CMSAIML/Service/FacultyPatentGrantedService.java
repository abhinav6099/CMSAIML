package CMSAIML.example.CMSAIML.Service;


import CMSAIML.example.CMSAIML.Entity.FacultyPatentGranted;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FacultyPatentGrantedService {

    private final List<FacultyPatentGranted> facultyPatents = new ArrayList<>();

    public void addPatent(FacultyPatentGranted patent) {
        facultyPatents.add(patent);
    }

    public List<FacultyPatentGranted> getAllPatents() {
        return facultyPatents;
    }

    public FacultyPatentGranted getPatentByGrantNumber(String grantNumber) {
        return facultyPatents.stream()
                .filter(p -> p.getGrantNumber().equalsIgnoreCase(grantNumber))
                .findFirst()
                .orElse(null);
    }

    public boolean deletePatent(String grantNumber) {
        return facultyPatents.removeIf(p -> p.getGrantNumber().equalsIgnoreCase(grantNumber));
    }
}
