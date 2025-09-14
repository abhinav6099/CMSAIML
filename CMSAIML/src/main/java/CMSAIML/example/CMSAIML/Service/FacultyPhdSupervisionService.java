package CMSAIML.example.CMSAIML.Service;
import CMSAIML.example.CMSAIML.Entity.FacultyPhdSupervision;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FacultyPhdSupervisionService {

    private final List<FacultyPhdSupervision> supervisionList = new ArrayList<>();

    public void addSupervision(FacultyPhdSupervision supervision) {
        supervisionList.add(supervision);
    }

    public List<FacultyPhdSupervision> getAllSupervisions() {
        return supervisionList;
    }

    public FacultyPhdSupervision getByScholarName(String scholarName) {
        return supervisionList.stream()
                .filter(s -> s.getPhdScholarName().equalsIgnoreCase(scholarName))
                .findFirst()
                .orElse(null);
    }

    public boolean deleteByScholarName(String scholarName) {
        return supervisionList.removeIf(s -> s.getPhdScholarName().equalsIgnoreCase(scholarName));
    }
}
