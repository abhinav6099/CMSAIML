package CMSAIML.example.CMSAIML.Service;


import CMSAIML.example.CMSAIML.Entity.FacultyResearchProjectGuided;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FacultyResearchProjectService {

    private final List<FacultyResearchProjectGuided> projects = new ArrayList<>();

    public void addProject(FacultyResearchProjectGuided project) {
        projects.add(project);
    }

    public List<FacultyResearchProjectGuided> getAllProjects() {
        return projects;
    }

    public FacultyResearchProjectGuided getByProjectTitle(String projectTitle) {
        return projects.stream()
                .filter(p -> p.getProjectTitle().equalsIgnoreCase(projectTitle))
                .findFirst()
                .orElse(null);
    }

    public boolean deleteByProjectTitle(String projectTitle) {
        return projects.removeIf(p -> p.getProjectTitle().equalsIgnoreCase(projectTitle));
    }
}
