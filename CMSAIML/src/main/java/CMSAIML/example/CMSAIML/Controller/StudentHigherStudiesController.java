package CMSAIML.example.CMSAIML.Controller;

import CMSAIML.example.CMSAIML.Entity.StudentHigherStudies;
import CMSAIML.example.CMSAIML.Service.StudentHigherStudiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/higherstudies")
public class StudentHigherStudiesController {

    @Autowired
    private StudentHigherStudiesService service;

    @GetMapping
    public List<StudentHigherStudies> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public StudentHigherStudies getById(@PathVariable int id) {
        return service.getById(id);
    }

    @PostMapping
    public StudentHigherStudies add(@RequestBody StudentHigherStudies studies) {
        return service.add(studies);
    }

    @PutMapping("/{id}")
    public StudentHigherStudies update(@PathVariable int id, @RequestBody StudentHigherStudies updated) {
        return service.update(id, updated);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        return service.deleteById(id) ? "Deleted Successfully" : "Not Found";
    }
}
