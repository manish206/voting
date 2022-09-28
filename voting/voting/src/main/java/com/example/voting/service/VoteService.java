package com.example.voting.service;

import com.example.voting.entity.Vote;
import com.example.voting.entity.VoterId;
import com.example.voting.repository.VotingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
public class VoteService {
    @Autowired
    public VotingRepository rep;
    public List<Vote> findall() {
        return rep.findAll();
    }

    public String registerVoter(Vote v) {
        Optional<Vote> existingVote=rep.findById(v.getId());
        if(existingVote.isEmpty()){
            rep.save(v);
            System.out.println("Voter Registered!!");
            return "Voter is registered!!!";
        }
        else{
            return "Voting ID already exist !!!";
        }
    }

    public ResponseEntity<Vote> findbyid(VoterId id) {
        Optional<Vote> v=rep.findById(id.getId());
        System.out.println(v);
        if(!v.isEmpty()) {
            return new ResponseEntity<Vote>(v.get(), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
