package com.mpz.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mpz.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
}