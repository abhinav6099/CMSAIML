package CMSAIML.example.CMSAIML.Entity;

public class NewAdmin {
        private String fullName;
        private String gender;
        private String dateOfBirth;
        private int age;
        private String bloodGroup;
        private String nationality;
        private String maritalStatus;
        private String contactNumber;
        private String alternateContactNumber;
        private String emailOfficial;
        private String emailPersonal;
        private String residentialAddress;
        private String emergencyContact;
        private String panNumber;
        private String aadhaarNumber;
        private String bankAccountDetails;

        public Admin(String fullName, String gender, String dateOfBirth, int age, String bloodGroup, String nationality,
                     String maritalStatus, String contactNumber, String alternateContactNumber,
                     String emailOfficial, String emailPersonal, String residentialAddress,
                     String emergencyContact, String panNumber, String aadhaarNumber,
                     String bankAccountDetails) {
                this.fullName = fullName;
                this.gender = gender;
                this.dateOfBirth = dateOfBirth;
                this.age = age;
                this.bloodGroup = bloodGroup;
                this.nationality = nationality;
                this.maritalStatus = maritalStatus;
                this.contactNumber = contactNumber;
                this.alternateContactNumber = alternateContactNumber;
                this.emailOfficial = emailOfficial;
                this.emailPersonal = emailPersonal;
                this.residentialAddress = residentialAddress;
                this.emergencyContact = emergencyContact;
                this.panNumber = panNumber;
                this.aadhaarNumber = aadhaarNumber;
                this.bankAccountDetails = bankAccountDetails;
        }

        // Add getters and setters
}


