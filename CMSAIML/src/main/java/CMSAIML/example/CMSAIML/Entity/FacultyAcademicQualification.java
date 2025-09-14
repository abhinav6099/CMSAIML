package CMSAIML.example.CMSAIML.Entity;

public class FacultyAcademicQualification {

    private String facultyId;
    private String facultyName;
    private String highestDegree;
    private String universityOrInstitute;
    private String specialization;
    private int yearOfCompletion;
    private String certificatePath; // Path to uploaded document

    public FacultyAcademicQualification() {}

    public FacultyAcademicQualification(String facultyId, String facultyName, String highestDegree,
                                        String universityOrInstitute, String specialization,
                                        int yearOfCompletion, String certificatePath) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.highestDegree = highestDegree;
        this.universityOrInstitute = universityOrInstitute;
        this.specialization = specialization;
        this.yearOfCompletion = yearOfCompletion;
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

    public String getHighestDegree() {
        return highestDegree;
    }

    public void setHighestDegree(String highestDegree) {
        this.highestDegree = highestDegree;
    }

    public String getUniversityOrInstitute() {
        return universityOrInstitute;
    }

    public void setUniversityOrInstitute(String universityOrInstitute) {
        this.universityOrInstitute = universityOrInstitute;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getYearOfCompletion() {
        return yearOfCompletion;
    }

    public void setYearOfCompletion(int yearOfCompletion) {
        this.yearOfCompletion = yearOfCompletion;
    }

    public String getCertificatePath() {
        return certificatePath;
    }

    public void setCertificatePath(String certificatePath) {
        this.certificatePath = certificatePath;
    }
}
