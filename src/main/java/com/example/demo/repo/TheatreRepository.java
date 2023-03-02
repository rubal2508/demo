package com.example.demo.repo;

import com.example.demo.model.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheatreRepository extends JpaRepository<Theatre,Integer > {
}
