package CMSAIML.example.CMSAIML.Entity;

import java.time.LocalDate;

public class FacultyPhdSupervision {

    private String facultyId;
    private String facultyName;
    private String phdScholarName;
    private String universityAffiliation;
    private String status; // Ongoing / Completed
    private String researchTopic;
    private LocalDate registrationOrCompletionDate;

    public FacultyPhdSupervision() {}

    public FacultyPhdSupervision(String facultyId, String facultyName, String phdScholarName,
                                 String universityAffiliation, String status,
                                 String researchTopic, LocalDate registrationOrCompletionDate) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.phdScholarName = phdScholarName;
        this.universityAffiliation = universityAffiliation;
        this.status = status;
        this.researchTopic = researchTopic;
        this.registrationOrCompletionDate = registrationOrCompletionDate;
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

    public String getPhdScholarName() {
        return phdScholarName;
    }

    public void setPhdScholarName(String phdScholarName) {
        this.phdScholarName = phdScholarName;
    }

    public String getUniversityAffiliation() {
        return universityAffiliation;
    }

    public void setUniversityAffiliation(String universityAffiliation) {
        this.universityAffiliation = universityAffiliation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResearchTopic() {
        return researchTopic;
    }

    public void setResearchTopic(String researchTopic) {
        this.researchTopic = researchTopic;
    }

    public LocalDate getRegistrationOrCompletionDate() {
        return registrationOrCompletionDate;
    }

    public void setRegistrationOrCompletionDate(LocalDate registrationOrCompletionDate) {
        this.registrationOrCompletionDate = registrationOrCompletionDate;
    }
}
