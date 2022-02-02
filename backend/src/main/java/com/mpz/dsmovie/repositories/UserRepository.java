package com.mpz.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mpz.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
}