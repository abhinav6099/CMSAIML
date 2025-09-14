package CMSAIML.example.CMSAIML.Entity;

public class StudentHigherStudies {

    private int id;
    private String courseName;
    private String scholarship;
    private String instituteName;
    private String city;
    private String country;
    private String durationOfProgram;
    private String admissionYear;

    public StudentHigherStudies() {}

    public StudentHigherStudies(int id, String courseName, String scholarship, String instituteName,
                                String city, String country, String durationOfProgram, String admissionYear) {
        this.id = id;
        this.courseName = courseName;
        this.scholarship = scholarship;
        this.instituteName = instituteName;
        this.city = city;
        this.country = country;
        this.durationOfProgram = durationOfProgram;
        this.admissionYear = admissionYear;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getScholarship() {
        return scholarship;
    }

    public void setScholarship(String scholarship) {
        this.scholarship = scholarship;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDurationOfProgram() {
        return durationOfProgram;
    }

    public void setDurationOfProgram(String durationOfProgram) {
        this.durationOfProgram = durationOfProgram;
    }

    public String getAdmissionYear() {
        return admissionYear;
    }

    public void setAdmissionYear(String admissionYear) {
        this.admissionYear = admissionYear;
    }
}
