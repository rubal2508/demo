package com.example.demo.controller;

import com.example.demo.model.Ticket;
import com.example.demo.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/bookTicket")
    public Ticket bookTicket(@RequestBody Ticket ticket){
        return bookingService.bookTicket(ticket);
    }

    @GetMapping("getBookingHistory")
    public List<Ticket> getBookingHistory(@RequestParam int userId){
        return bookingService.getBookingHistory(userId);
    }
}
