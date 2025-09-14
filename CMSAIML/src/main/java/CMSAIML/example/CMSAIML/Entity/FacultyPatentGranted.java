package CMSAIML.example.CMSAIML.Entity;

import java.time.LocalDate;

public class FacultyPatentGranted {

    private String facultyId;
    private String facultyName;
    private String patentTitle;
    private String inventors;
    private String grantNumber;
    private LocalDate dateOfGrant;
    private String countryOfGrant;
    private String applicationNumber;
    private String patentCertificatePath;

    public FacultyPatentGranted() {}

    public FacultyPatentGranted(String facultyId, String facultyName, String patentTitle, String inventors,
                                String grantNumber, LocalDate dateOfGrant, String countryOfGrant,
                                String applicationNumber, String patentCertificatePath) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.patentTitle = patentTitle;
        this.inventors = inventors;
        this.grantNumber = grantNumber;
        this.dateOfGrant = dateOfGrant;
        this.countryOfGrant = countryOfGrant;
        this.applicationNumber = applicationNumber;
        this.patentCertificatePath = patentCertificatePath;
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

    public String getPatentTitle() {
        return patentTitle;
    }

    public void setPatentTitle(String patentTitle) {
        this.patentTitle = patentTitle;
    }

    public String getInventors() {
        return inventors;
    }

    public void setInventors(String inventors) {
        this.inventors = inventors;
    }

    public String getGrantNumber() {
        return grantNumber;
    }

    public void setGrantNumber(String grantNumber) {
        this.grantNumber = grantNumber;
    }

    public LocalDate getDateOfGrant() {
        return dateOfGrant;
    }

    public void setDateOfGrant(LocalDate dateOfGrant) {
        this.dateOfGrant = dateOfGrant;
    }

    public String getCountryOfGrant() {
        return countryOfGrant;
    }

    public void setCountryOfGrant(String countryOfGrant) {
        this.countryOfGrant = countryOfGrant;
    }

    public String getApplicationNumber() {
        return applicationNumber;
    }

    public void setApplicationNumber(String applicationNumber) {
        this.applicationNumber = applicationNumber;
    }

    public String getPatentCertificatePath() {
        return patentCertificatePath;
    }

    public void setPatentCertificatePath(String patentCertificatePath) {
        this.patentCertificatePath = patentCertificatePath;
    }
}
