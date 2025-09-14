package CMSAIML.example.CMSAIML.Entity;

public class StudentProfessionalMembership {

    private int id;
    private String organizationName;
    private String membershipId;
    private String dateOfJoining;
    private String membershipStatus;

    public StudentProfessionalMembership() {}

    public StudentProfessionalMembership(int id, String organizationName, String membershipId,
                                         String dateOfJoining, String membershipStatus) {
        this.id = id;
        this.organizationName = organizationName;
        this.membershipId = membershipId;
        this.dateOfJoining = dateOfJoining;
        this.membershipStatus = membershipStatus;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public String getMembershipStatus() {
        return membershipStatus;
    }

    public void setMembershipStatus(String membershipStatus) {
        this.membershipStatus = membershipStatus;
    }
}
