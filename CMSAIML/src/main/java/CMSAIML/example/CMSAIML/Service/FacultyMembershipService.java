package CMSAIML.example.CMSAIML.Service;


import CMSAIML.example.CMSAIML.Entity.FacultyMembership;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FacultyMembershipService {

    private final List<FacultyMembership> memberships = new ArrayList<>();

    public void addMembership(FacultyMembership membership) {
        memberships.add(membership);
    }

    public List<FacultyMembership> getAllMemberships() {
        return memberships;
    }

    public FacultyMembership getByMembershipId(String membershipId) {
        return memberships.stream()
                .filter(m -> m.getMembershipId().equalsIgnoreCase(membershipId))
                .findFirst()
                .orElse(null);
    }

    public boolean deleteByMembershipId(String membershipId) {
        return memberships.removeIf(m -> m.getMembershipId().equalsIgnoreCase(membershipId));
    }
}
