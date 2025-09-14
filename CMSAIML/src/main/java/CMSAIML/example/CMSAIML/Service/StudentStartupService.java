package CMSAIML.example.CMSAIML.Service;

import CMSAIML.example.CMSAIML.Entity.StudentStartup;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentStartupService {

    private final List<StudentStartup> data = new ArrayList<>();
    private int nextId = 1;

    public List<StudentStartup> getAll() {
        return data;
    }

    public StudentStartup getById(int id) {
        return data.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }

    public StudentStartup add(StudentStartup startup) {
        startup.setId(nextId++);
        data.add(startup);
        return startup;
    }

    public boolean deleteById(int id) {
        return data.removeIf(s -> s.getId() == id);
    }

    public StudentStartup update(int id, StudentStartup updated) {
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
