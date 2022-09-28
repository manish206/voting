package com.example.voting.repository;

import com.example.voting.entity.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface VotingRepository extends JpaRepository<Vote, Integer> {
}
