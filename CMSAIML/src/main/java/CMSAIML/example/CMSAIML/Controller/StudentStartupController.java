package CMSAIML.example.CMSAIML.Controller;

import CMSAIML.example.CMSAIML.Entity.StudentStartup;
import CMSAIML.example.CMSAIML.Service.StudentStartupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/startups")
public class StudentStartupController {

    @Autowired
    private StudentStartupService service;

    @GetMapping
    public List<StudentStartup> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public StudentStartup getById(@PathVariable int id) {
        return service.getById(id);
    }

    @PostMapping
    public StudentStartup add(@RequestBody StudentStartup startup) {
        return service.add(startup);
    }

    @PutMapping("/{id}")
    public StudentStartup update(@PathVariable int id, @RequestBody StudentStartup updated) {
        return service.update(id, updated);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        return service.deleteById(id) ? "Deleted Successfully" : "Not Found";
    }
}
