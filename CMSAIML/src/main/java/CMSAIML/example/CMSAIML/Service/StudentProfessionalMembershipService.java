package CMSAIML.example.CMSAIML.Service;

import CMSAIML.example.CMSAIML.Entity.StudentProfessionalMembership;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentProfessionalMembershipService {

    private final List<StudentProfessionalMembership> data = new ArrayList<>();
    private int nextId = 1;

    public List<StudentProfessionalMembership> getAll() {
        return data;
    }

    public StudentProfessionalMembership getById(int id) {
        return data.stream().filter(m -> m.getId() == id).findFirst().orElse(null);
    }

    public StudentProfessionalMembership add(StudentProfessionalMembership membership) {
        membership.setId(nextId++);
        data.add(membership);
        return membership;
    }

    public boolean deleteById(int id) {
        return data.removeIf(m -> m.getId() == id);
    }

    public StudentProfessionalMembership update(int id, StudentProfessionalMembership updated) {
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
