package CMSAIML.example.CMSAIML.Entity;

import java.time.LocalDate;

public class FacultyInvitedTalk {

    private String facultyId;
    private String facultyName;
    private String talkTitle;
    private String eventName;
    private String organizingBody;
    private LocalDate date;
    private String engagementType; // Keynote / Panelist / Speaker
    private String certificatePath; // Path to supporting document

    public FacultyInvitedTalk() {}

    public FacultyInvitedTalk(String facultyId, String facultyName, String talkTitle, String eventName,
                              String organizingBody, LocalDate date, String engagementType,
                              String certificatePath) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.talkTitle = talkTitle;
        this.eventName = eventName;
        this.organizingBody = organizingBody;
        this.date = date;
        this.engagementType = engagementType;
        this.certificatePath = certificatePath;
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

    public String getTalkTitle() {
        return talkTitle;
    }

    public void setTalkTitle(String talkTitle) {
        this.talkTitle = talkTitle;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getOrganizingBody() {
        return organizingBody;
    }

    public void setOrganizingBody(String organizingBody) {
        this.organizingBody = organizingBody;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getEngagementType() {
        return engagementType;
    }

    public void setEngagementType(String engagementType) {
        this.engagementType = engagementType;
    }

    public String getCertificatePath() {
        return certificatePath;
    }

    public void setCertificatePath(String certificatePath) {
        this.certificatePath = certificatePath;
    }
}
