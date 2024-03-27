package com.example.dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dev.domain.User;


@Repository
public interface LogRepo extends JpaRepository<User ,String> {
    User findByUsernameAndPassword(String username, String password);
}

