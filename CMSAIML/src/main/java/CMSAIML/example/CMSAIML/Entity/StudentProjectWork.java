package CMSAIML.example.CMSAIML.Entity;

public class StudentProjectWork {

    private int id;
    private String projectTitle;
    private String teamMembers;
    private String guideName;
    private String semester;
    private String industryMentor;
    private String projectOutcome;

    public StudentProjectWork() {}

    public StudentProjectWork(int id, String projectTitle, String teamMembers, String guideName,
                              String semester, String industryMentor, String projectOutcome) {
        this.id = id;
        this.projectTitle = projectTitle;
        this.teamMembers = teamMembers;
        this.guideName = guideName;
        this.semester = semester;
        this.industryMentor = industryMentor;
        this.projectOutcome = projectOutcome;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectTitle() {
        return projectTitle;
    }

    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }

    public String getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(String teamMembers) {
        this.teamMembers = teamMembers;
    }

    public String getGuideName() {
        return guideName;
    }

    public void setGuideName(String guideName) {
        this.guideName = guideName;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getIndustryMentor() {
        return industryMentor;
    }

    public void setIndustryMentor(String industryMentor) {
        this.industryMentor = industryMentor;
    }

    public String getProjectOutcome() {
        return projectOutcome;
    }

    public void setProjectOutcome(String projectOutcome) {
        this.projectOutcome = projectOutcome;
    }
}
