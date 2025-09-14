package CMSAIML.example.CMSAIML.Entity;

public class FacultyBookChapter {

    private String facultyId;
    private String facultyName;
    private String title;
    private String publisher;
    private String isbn;
    private int yearOfPublication;
    private String coAuthors; // comma-separated names

    public FacultyBookChapter() {}

    public FacultyBookChapter(String facultyId, String facultyName, String title,
                              String publisher, String isbn, int yearOfPublication,
                              String coAuthors) {
        this.facultyId = facultyId;
        this.facultyName = facultyName;
        this.title = title;
        this.publisher = publisher;
        this.isbn = isbn;
        this.yearOfPublication = yearOfPublication;
        this.coAuthors = coAuthors;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getCoAuthors() {
        return coAuthors;
    }

    public void setCoAuthors(String coAuthors) {
        this.coAuthors = coAuthors;
    }
}
