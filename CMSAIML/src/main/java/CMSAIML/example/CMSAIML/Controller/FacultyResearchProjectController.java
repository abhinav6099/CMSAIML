package CMSAIML.example.CMSAIML.Controller;


import CMSAIML.example.CMSAIML.Entity.FacultyResearchProjectGuided;
import CMSAIML.example.CMSAIML.Service.FacultyResearchProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculty-research-projects")
public class FacultyResearchProjectController {

    @Autowired
    private FacultyResearchProjectService projectService;

    @PostMapping("/add")
    public String addProject(@RequestBody FacultyResearchProjectGuided project) {
        projectService.addProject(project);
        return "Research project added successfully.";
    }

    @GetMapping("/all")
    public List<FacultyResearchProjectGuided> getAllProjects() {
        return projectService.getAllProjects();
    }

    @GetMapping("/get/{projectTitle}")
    public FacultyResearchProjectGuided getProject(@PathVariable String projectTitle) {
        FacultyResearchProjectGuided project = projectService.getByProjectTitle(projectTitle);
        if (project != null) return project;
        throw new RuntimeException("Project not found.");
    }

    @DeleteMapping("/delete/{projectTitle}")
    public String deleteProject(@PathVariable String projectTitle) {
        boolean removed = projectService.deleteByProjectTitle(projectTitle);
        return removed ? "Project deleted successfully." : "Project not found.";
    }
}
