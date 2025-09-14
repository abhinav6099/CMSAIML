package CMSAIML.example.CMSAIML.Service;

import CMSAIML.example.CMSAIML.Entity.StudentExtraCurricular;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentExtraCurricularService {

    private final List<StudentExtraCurricular> data = new ArrayList<>();
    private int nextId = 1;

    public List<StudentExtraCurricular> getAll() {
        return data;
    }

    public StudentExtraCurricular getById(int id) {
        return data.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }

    public StudentExtraCurricular add(StudentExtraCurricular student) {
        student.setId(nextId++);
        data.add(student);
        return student;
    }

    public boolean deleteById(int id) {
        return data.removeIf(e -> e.getId() == id);
    }

    public StudentExtraCurricular update(int id, StudentExtraCurricular updated) {
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
