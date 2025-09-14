package CMSAIML.example.CMSAIML.Service;

import CMSAIML.example.CMSAIML.Entity.StudentHigherStudies;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentHigherStudiesService {

    private final List<StudentHigherStudies> data = new ArrayList<>();
    private int nextId = 1;

    public List<StudentHigherStudies> getAll() {
        return data;
    }

    public StudentHigherStudies getById(int id) {
        return data.stream().filter(h -> h.getId() == id).findFirst().orElse(null);
    }

    public StudentHigherStudies add(StudentHigherStudies studies) {
        studies.setId(nextId++);
        data.add(studies);
        return studies;
    }

    public boolean deleteById(int id) {
        return data.removeIf(h -> h.getId() == id);
    }

    public StudentHigherStudies update(int id, StudentHigherStudies updated) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getId() == id) {
                updated.setId(id);
                data.set(i, updated);
                return updated;
            }
        }
        return null;
    }
}
