package CMSAIML.example.CMSAIML.Controller;
import CMSAIML.example.CMSAIML.Entity.StudentTechnicalNonTechnicalCompetitions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/student-competitions")
@CrossOrigin
public class StudentTechnicalNonTechnicalCompetitionsController {


    private StudentTechnicalNonTechnicalCompetitions competitionService;

    // ➕ Add a new competition entry
    @PostMapping
    public StudentTechnicalNonTechnicalCompetitions addCompetition(@RequestBody StudentTechnicalNonTechnicalCompetitions competition) {
        return competitionService.saveCompetition(competition);
    }

    // 📄 Get all competitions
    @GetMapping
    public List<StudentTechnicalNonTechnicalCompetitions> getAllCompetitions() {
        return competitionService.getAllCompetitions();
    }

    // 🔍 Get a specific competition by ID
    @GetMapping("/{id}")
    public StudentTechnicalNonTechnicalCompetitions getCompetitionById(@PathVariable Long id) {
        return competitionService.getCompetitionById(id);
    }

    // ❌ Delete a competition by ID
    @DeleteMapping("/{id}")
    public String deleteCompetition(@PathVariable Long id) {
        competitionService.deleteCompetition(id);
        return STR."Competition with ID \{id} has been deleted.";
    }
}
