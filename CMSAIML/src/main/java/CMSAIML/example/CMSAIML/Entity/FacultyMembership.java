package CMSAIML.example.CMSAIML.Entity;

import java.time.LocalDate;

public class FacultyMembership {

    private String facultyId;
    private String facultyName;
    private String organizationName;     // IEEE, ISTE, ACM, etc.
    private String membershipType;       // Life, Annual, Student, Professional
    private String membershipId;
    private LocalDate dateOfJoining;
    private String currentStatus;        // Active or Expired

    public FacultyMembership() {}

    public FacultyMembership(String facultyId, String facultyName, String organizationName,
                                         String membershipType, String membershipId,
                                         LocalDate dateOfJoining, String currentStatus) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.organizationName = organizationName;
        this.membershipType = membershipType;
        this.membershipId = membershipId;
        this.dateOfJoining = dateOfJoining;
        this.currentStatus = currentStatus;
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

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public String getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }
}
