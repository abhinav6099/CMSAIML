package CMSAIML.example.CMSAIML.Controller;

import CMSAIML.example.CMSAIML.Entity.StudentExtraCurricular;
import CMSAIML.example.CMSAIML.Service.StudentExtraCurricularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/extracurricular")
public class StudentExtraCurricularController {

    @Autowired
    private StudentExtraCurricularService service;

    @GetMapping
    public List<StudentExtraCurricular> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public StudentExtraCurricular getById(@PathVariable int id) {
        return service.getById(id);
    }

    @PostMapping
    public StudentExtraCurricular add(@RequestBody StudentExtraCurricular student) {
        return service.add(student);
    }

    @PutMapping("/{id}")
    public StudentExtraCurricular update(@PathVariable int id, @RequestBody StudentExtraCurricular updated) {
        return service.update(id, updated);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        return service.deleteById(id) ? "Deleted Successfully" : "Not Found";
    }
}
