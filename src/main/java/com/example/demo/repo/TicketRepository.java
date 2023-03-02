package com.example.demo.repo;

import com.example.demo.model.Show;
import com.example.demo.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TicketRepository extends JpaRepository<Ticket,Integer> {
    List<Ticket> getTicketsByUserId(Integer userId);
}
