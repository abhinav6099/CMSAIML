package CMSAIML.example.CMSAIML.Controller;


import CMSAIML.example.CMSAIML.Entity.FacultyMembership;
import CMSAIML.example.CMSAIML.Entity.FacultyMembership;
import CMSAIML.example.CMSAIML.Service.FacultyMembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculty-memberships")
public class FacultyMembershipController {

    @Autowired
    private FacultyMembershipService membershipService;

    @PostMapping("/add")
    public String addMembership(@RequestBody FacultyMembership membership) {
        membershipService.addMembership(membership);
        return "Membership added successfully.";
    }

    @GetMapping("/all")
    public List<FacultyMembership> getAllMemberships() {
        return membershipService.getAllMemberships();
    }

    @GetMapping("/get/{membershipId}")
    public FacultyMembership getMembership(@PathVariable String membershipId) {
        FacultyMembership m = membershipService.getByMembershipId(membershipId);
        if (m != null) return m;
        throw new RuntimeException("Membership not found.");
    }

    @DeleteMapping("/delete/{membershipId}")
    public String deleteMembership(@PathVariable String membershipId) {
        boolean removed = membershipService.deleteByMembershipId(membershipId);
        return removed ? "Membership deleted successfully." : "Membership not found.";
    }
}
