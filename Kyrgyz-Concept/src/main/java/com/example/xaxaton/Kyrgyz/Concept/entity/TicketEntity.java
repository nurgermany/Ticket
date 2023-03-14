package com.example.xaxaton.Kyrgyz.Concept.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
import java.util.Calendar;
import javax.persistence.*;

import java.sql.Timestamp;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "/ticket")
public class TicketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private AirlineEntity airline;

    @ManyToOne
    private CityEntity departureCity;

    @ManyToOne
    private CityEntity arrivalCity;

    @ManyToOne
    private FlightNumberEntity flightNumber;

    @Temporal(TemporalType.DATE)        //Temporal для работы с датами и временем
    private Date departureDate;

    @Temporal(TemporalType.TIME)
    private Date departureTime;


    private Date arrivalDate;

    @Temporal(TemporalType.TIME)
    private Date arrivalTime;

    @ManyToOne
    private TerminalEntity departureTerminal;

    @ManyToOne
    private TerminalEntity arrivalTerminal;


}
