package com.example.voting.controller;

import com.example.voting.entity.Vote;
import com.example.voting.entity.VoterId;
import com.example.voting.repository.VotingRepository;
import com.example.voting.service.VoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
public class VotingController {
    @Autowired
    private VoteService service;
    @PostMapping("/v1/register-voter")
    public String registerVoter(@RequestBody Vote v){
        System.out.println(v);
        return service.registerVoter(v);
    }
    @GetMapping("/get-all-voters")
    public List<Vote> getAllVoters(){
        return service.findall();
    }
    @PostMapping("/get-voter/id")
    public ResponseEntity<Vote> GetVoter(@RequestBody VoterId id){
        System.out.println(id);
        return service.findbyid(id);
    }

    @GetMapping("/")
    public String hello(){
        return "Hello world!!!";
    }
}
