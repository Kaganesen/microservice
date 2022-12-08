package com.kodlamaio.rentalService.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Table(name = "rentals")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
public class Rental {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "carId")
    private String carId;

    @Column(name = "dateStarted")
    private LocalDate dateStarted = LocalDate.now();

    @Column(name = "rentedForDays")
    private int rentedForDays;

    @Column(name = "dailyPrice")
    private double dailyPrice;

    @Column(name = "totalPrice")
    private double totalPrice;


}
