package CMSAIML.example.CMSAIML.Entity;
import CMSAIML.example.CMSAIML.Entity.StudentTechnicalNonTechnicalCompetitions;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "student_competitions")
public class StudentTechnicalNonTechnicalCompetitions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String studentName;
    private String enrollmentNumber;
    private String branch;
    private String batch;
    private String year;
    private String competitionName;
    private String date;
    private String teamName;
    private int teamSize;
    private String mentorName;
    private String level;
    private String organizer;
    private String venue;
    private String problemStatement;
    private String technologyUsed;
    private String prizeMoney;
    private String sponsoringAgency;
    private String positionSecured;
    private String projectGithubLink;

    @Column(length = 2000)
    private String projectDescription;

    private String certificatePdf;
    private String eventMode;
    private String achievement;

    public StudentTechnicalNonTechnicalCompetitions saveCompetition(StudentTechnicalNonTechnicalCompetitions competition) {
        return null;
    }

    public List<StudentTechnicalNonTechnicalCompetitions> getAllCompetitions() {
        return null;
    }

    public StudentTechnicalNonTechnicalCompetitions getCompetitionById(Long id) {
        return null;
    }

    public void deleteCompetition(Long id) {

    }
}

