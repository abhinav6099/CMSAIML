package CMSAIML.example.CMSAIML.Entity;

import java.util.List;

public class FacultyResearchProjectGuided {

    private String facultyId;
    private String facultyName;
    private String projectTitle;
    private String level; // UG / PG / PhD
    private List<String> studentNames;
    private String outcome; // Publication / Patent / Prototype / etc.

    public FacultyResearchProjectGuided() {}

    public FacultyResearchProjectGuided(String facultyId, String facultyName, String projectTitle,
                                        String level, List<String> studentNames, String outcome) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.projectTitle = projectTitle;
        this.level = level;
        this.studentNames = studentNames;
        this.outcome = outcome;
    }

    // Getters and Setters

    public String getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public List<String> getStudentNames() {
        return studentNames;
    }

    public void setStudentNames(List<String> studentNames) {
        this.studentNames = studentNames;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }
}
