package CMSAIML.example.CMSAIML.Entity;

public class StudentStartup {

    private int id;
    private String startupName;
    private String domain;
    private String incubationSupport;
    private String currentStatus; // Idea / Prototype / Registered
    private String websiteOrLink;

    public StudentStartup() {}

    public StudentStartup(int id, String startupName, String domain, String incubationSupport,
                          String currentStatus, String websiteOrLink) {
        this.id = id;
        this.startupName = startupName;
        this.domain = domain;
        this.incubationSupport = incubationSupport;
        this.currentStatus = currentStatus;
        this.websiteOrLink = websiteOrLink;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStartupName() {
        return startupName;
    }

    public void setStartupName(String startupName) {
        this.startupName = startupName;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getIncubationSupport() {
        return incubationSupport;
    }

    public void setIncubationSupport(String incubationSupport) {
        this.incubationSupport = incubationSupport;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    public String getWebsiteOrLink() {
        return websiteOrLink;
    }

    public void setWebsiteOrLink(String websiteOrLink) {
        this.websiteOrLink = websiteOrLink;
    }
}
