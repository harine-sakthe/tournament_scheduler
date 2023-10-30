//package com.postgresql.demotg.controller;
//
//import com.postgresql.demotg.model.Teams;
//import com.postgresql.demotg.repo.TeamRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/teams")
//public class TeamsController {
//    @Autowired
//    private TeamRepo teamRepository;
//
//    @GetMapping
//    public List<Teams> getAllTeams() {
//        return teamRepository.findAll();
//    }
//
//    @PostMapping
//    public Teams addTeams(@RequestBody Teams teams) {
//        return teamRepository.save(teams);
//    }
//
//    @GetMapping("/{id}")
//    public Teams getTeamsById(@PathVariable Long id) {
//        return teamRepository.findById(id).orElse(null);
//    }
//
//    @PutMapping("/{id}")
//    public Teams updateTeams(@PathVariable Long id, @RequestBody Teams updatedTeams) {
//        if (teamRepository.existsById(id)) {
//            return teamRepository.save(updatedTeams);
//        }
//        return null;
//    }
//    @DeleteMapping("/{id}")
//    public void deleteTodo(@PathVariable Long id) {
//        teamRepository.deleteById(id);
//    }
//
//
//
////    @Autowired
////    private TeamRepo teamRepository;
////
////    @PostMapping("/")
////    public List<Teams> scheduleMatches(@RequestBody Teams teams) {
////        Teams newMatch = new Teams();
////        newMatch.setTeamA(teams.getTeamA());
////        newMatch.setTeamB(teams.getTeamB());
////        newMatch.setTeamC(teams.getTeamC());
////        newMatch.setTeamD(teams.getTeamD());
////        newMatch.setTeamE(teams.getTeamE());
////        newMatch.setTeamF(teams.getTeamF());
////        newMatch.setMatchDate(teams.getDate());
////
////        teamRepository.save(newMatch);
////
////        return teamRepository.findAll();
////    }
//}
package com.postgresql.demotg.controller;

import com.postgresql.demotg.model.Teams;
import com.postgresql.demotg.repo.TeamRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("http://localhost:4200")

@RestController
@RequestMapping("/api/teams")
public class TeamsController {
    @Autowired
    private TeamRepo teamRepository;


    @GetMapping
    public List<Teams> getAllTeams() {
        return teamRepository.findAll();
    }

    @PostMapping
    public Teams addTeams(@RequestBody Teams teams) {
        return teamRepository.save(teams);
    }

    @GetMapping("/{id}")
    public Teams getTeamsById(@PathVariable Long id) {
        return teamRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Teams updateTeams(@PathVariable Long id, @RequestBody Teams updatedTeams) {
        if (teamRepository.existsById(id)) {
            return teamRepository.save(updatedTeams);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteTeams(@PathVariable Long id) {
        teamRepository.deleteById(id);
    }
}
