package com.example.restserverreact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final FlightRepository repository;

    @Autowired
    public DatabaseLoader(FlightRepository repository){
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception{
        this.repository.save(new Flight("Fly Emirates","Monday 21th January at 9:00pm", "Tuesday 22th January at 4:00am"));
    }



}
