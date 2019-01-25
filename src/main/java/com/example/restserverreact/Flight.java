package com.example.restserverreact;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Flight{

    private @Id @GeneratedValue Long id;
    private String brand;
    private String departure;
    private String arrival;

    private Flight(){}

    public Flight(String brand, String departure, String arrival){
        this.brand=brand;
        this.departure=departure;
        this.arrival=arrival;
    }



}
