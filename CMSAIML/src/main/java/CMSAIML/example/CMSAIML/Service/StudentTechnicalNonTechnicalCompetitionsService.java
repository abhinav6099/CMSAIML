package CMSAIML.example.CMSAIML.Service;

import CMSAIML.example.CMSAIML.Entity.StudentTechnicalNonTechnicalCompetitions;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentTechnicalNonTechnicalCompetitionsService {

    private final Map<Long, StudentTechnicalNonTechnicalCompetitions> dataStore = new HashMap<>();

    public StudentTechnicalNonTechnicalCompetitions saveCompetition(StudentTechnicalNonTechnicalCompetitions competition) {
        dataStore.put(competition.getId(), competition);
        return competition;
    }

    public List<StudentTechnicalNonTechnicalCompetitions> getAllCompetitions() {
        return new ArrayList<>(dataStore.values());
    }

    public StudentTechnicalNonTechnicalCompetitions getCompetitionById(Long id) {
        return dataStore.get(id);
    }

    public void deleteCompetition(Long id) {
        dataStore.remove(id);
    }
}
