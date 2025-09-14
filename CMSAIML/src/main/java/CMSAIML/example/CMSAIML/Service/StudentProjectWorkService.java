package CMSAIML.example.CMSAIML.Service;

import CMSAIML.example.CMSAIML.Entity.StudentProjectWork;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentProjectWorkService {

    private final List<StudentProjectWork> data = new ArrayList<>();
    private int nextId = 1;

    public List<StudentProjectWork> getAll() {
        return data;
    }

    public StudentProjectWork getById(int id) {
        return data.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public StudentProjectWork add(StudentProjectWork project) {
        project.setId(nextId++);
        data.add(project);
        return project;
    }

    public boolean deleteById(int id) {
        return data.removeIf(p -> p.getId() == id);
    }

    public StudentProjectWork update(int id, StudentProjectWork updated) {
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
