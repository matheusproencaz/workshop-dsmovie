package com.mpz.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mpz.dsmovie.entities.Score;
import com.mpz.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{
}