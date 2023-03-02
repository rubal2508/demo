package com.example.demo.repo;

import com.example.demo.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ShowRepository extends JpaRepository<Show, Integer> {
    List<Show> getShowsByMovieName(String movieName);
}
