package CMSAIML.example.CMSAIML.Controller;
import CMSAIML.example.CMSAIML.Entity.FacultyInvitedTalk;
import CMSAIML.example.CMSAIML.Service.FacultyInvitedTalkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculty-invited-talks")
public class FacultyInvitedTalkController {

    @Autowired
    private FacultyInvitedTalkService talkService;

    @PostMapping("/add")
    public String addTalk(@RequestBody FacultyInvitedTalk talk) {
        talkService.addTalk(talk);
        return "Invited talk added successfully.";
    }

    @GetMapping("/all")
    public List<FacultyInvitedTalk> getAllTalks() {
        return talkService.getAllTalks();
    }

    @GetMapping("/get/{talkTitle}")
    public FacultyInvitedTalk getTalk(@PathVariable String talkTitle) {
        FacultyInvitedTalk talk = talkService.getByTitle(talkTitle);
        if (talk != null) return talk;
        throw new RuntimeException("Talk not found.");
    }

    @DeleteMapping("/delete/{talkTitle}")
    public String deleteTalk(@PathVariable String talkTitle) {
        boolean removed = talkService.deleteByTitle(talkTitle);
        return removed ? "Talk deleted successfully." : "Talk not found.";
    }
}
