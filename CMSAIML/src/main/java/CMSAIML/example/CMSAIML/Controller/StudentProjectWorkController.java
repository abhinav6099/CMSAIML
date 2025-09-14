package CMSAIML.example.CMSAIML.Controller;

import CMSAIML.example.CMSAIML.Entity.StudentProjectWork;
import CMSAIML.example.CMSAIML.Service.StudentProjectWorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/projectwork")
public class StudentProjectWorkController {

    @Autowired
    private StudentProjectWorkService service;

    @GetMapping
    public List<StudentProjectWork> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public StudentProjectWork getById(@PathVariable int id) {
        return service.getById(id);
    }

    @PostMapping
    public StudentProjectWork add(@RequestBody StudentProjectWork project) {
        return service.add(project);
    }

    @PutMapping("/{id}")
    public StudentProjectWork update(@PathVariable int id, @RequestBody StudentProjectWork updated) {
        return service.update(id, updated);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        return service.deleteById(id) ? "Deleted Successfully" : "Not Found";
    }
}
