package com.example.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Show {

    @Id
    @GeneratedValue
    private int showId;
    private String movieName;
    private String dateTime;
    private int availableSeats;
    private int movieId;
    private int theatreId;

}
