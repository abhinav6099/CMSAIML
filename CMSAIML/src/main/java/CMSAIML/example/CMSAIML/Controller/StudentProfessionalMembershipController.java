package CMSAIML.example.CMSAIML.Controller;

import CMSAIML.example.CMSAIML.Entity.StudentProfessionalMembership;
import CMSAIML.example.CMSAIML.Service.StudentProfessionalMembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/memberships")
public class StudentProfessionalMembershipController {

    @Autowired
    private StudentProfessionalMembershipService service;

    @GetMapping
    public List<StudentProfessionalMembership> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public StudentProfessionalMembership getById(@PathVariable int id) {
        return service.getById(id);
    }

    @PostMapping
    public StudentProfessionalMembership add(@RequestBody StudentProfessionalMembership membership) {
        return service.add(membership);
    }

    @PutMapping("/{id}")
    public StudentProfessionalMembership update(@PathVariable int id, @RequestBody StudentProfessionalMembership updated) {
        return service.update(id, updated);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        return service.deleteById(id) ? "Deleted Successfully" : "Not Found";
    }
}
