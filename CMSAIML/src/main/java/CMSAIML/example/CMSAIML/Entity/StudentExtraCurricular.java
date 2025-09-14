package CMSAIML.example.CMSAIML.Entity;

public class StudentExtraCurricular {

    private int id;
    private String studentName;
    private String enrollmentNumber;
    private String branch;
    private String batch;
    private String year;
    private String eventName;
    private String eventDate;
    private String eventLevel;
    private String eventLocation;
    private String position;
    private String certificatePdf;
    private String organizer;

    public StudentExtraCurricular() {}

    public StudentExtraCurricular(int id, String studentName, String enrollmentNumber, String branch, String batch,
                                  String year, String eventName, String eventDate, String eventLevel,
                                  String eventLocation, String position, String certificatePdf, String organizer) {
        this.id = id;
        this.studentName = studentName;
        this.enrollmentNumber = enrollmentNumber;
        this.branch = branch;
        this.batch = batch;
        this.year = year;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventLevel = eventLevel;
        this.eventLocation = eventLocation;
        this.position = position;
        this.certificatePdf = certificatePdf;
        this.organizer = organizer;
    }


    public int getId() {
        return 0;
    }

    public void setId(int i) {
    }
}
