package com.example.demo.repo;

import com.example.demo.model.RegisteredUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisteredUserRepository extends JpaRepository<RegisteredUser, Integer> {
}
