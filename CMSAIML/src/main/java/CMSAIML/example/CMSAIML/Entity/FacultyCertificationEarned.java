package CMSAIML.example.CMSAIML.Entity;

public class FacultyCertificationEarned {

    private String facultyId;
    private String facultyName;
    private String certificationName;
    private String issuingBody;
    private String certificationLevel; // e.g., Beginner, Advanced
    private String validityPeriod;      // e.g., "2 years", "Valid till 2026"
    private String fieldOrDomain;
    private String certificatePath;     // File path or URL

    public FacultyCertificationEarned() {}

    public FacultyCertificationEarned(String facultyId, String facultyName, String certificationName,
                                      String issuingBody, String certificationLevel, String validityPeriod,
                                      String fieldOrDomain, String certificatePath) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.certificationName = certificationName;
        this.issuingBody = issuingBody;
        this.certificationLevel = certificationLevel;
        this.validityPeriod = validityPeriod;
        this.fieldOrDomain = fieldOrDomain;
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

    public String getCertificationName() {
        return certificationName;
    }

    public void setCertificationName(String certificationName) {
        this.certificationName = certificationName;
    }

    public String getIssuingBody() {
        return issuingBody;
    }

    public void setIssuingBody(String issuingBody) {
        this.issuingBody = issuingBody;
    }

    public String getCertificationLevel() {
        return certificationLevel;
    }

    public void setCertificationLevel(String certificationLevel) {
        this.certificationLevel = certificationLevel;
    }

    public String getValidityPeriod() {
        return validityPeriod;
    }

    public void setValidityPeriod(String validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    public String getFieldOrDomain() {
        return fieldOrDomain;
    }

    public void setFieldOrDomain(String fieldOrDomain) {
        this.fieldOrDomain = fieldOrDomain;
    }

    public String getCertificatePath() {
        return certificatePath;
    }

    public void setCertificatePath(String certificatePath) {
        this.certificatePath = certificatePath;
    }
}
