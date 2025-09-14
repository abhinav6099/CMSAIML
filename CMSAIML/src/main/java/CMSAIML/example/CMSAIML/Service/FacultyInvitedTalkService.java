package CMSAIML.example.CMSAIML.Service;
import CMSAIML.example.CMSAIML.Entity.FacultyInvitedTalk;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FacultyInvitedTalkService {

    private final List<FacultyInvitedTalk> talks = new ArrayList<>();

    public void addTalk(FacultyInvitedTalk talk) {
        talks.add(talk);
    }

    public List<FacultyInvitedTalk> getAllTalks() {
        return talks;
    }

    public FacultyInvitedTalk getByTitle(String talkTitle) {
        return talks.stream()
                .filter(t -> t.getTalkTitle().equalsIgnoreCase(talkTitle))
                .findFirst()
                .orElse(null);
    }

    public boolean deleteByTitle(String talkTitle) {
        return talks.removeIf(t -> t.getTalkTitle().equalsIgnoreCase(talkTitle));
    }
}
