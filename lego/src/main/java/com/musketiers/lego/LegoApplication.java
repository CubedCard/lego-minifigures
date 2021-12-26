package com.musketiers.lego;

import com.musketiers.lego.models.*;
import com.musketiers.lego.repositories.HouseRepository;
import com.musketiers.lego.repositories.MinifigureRepository;
import com.musketiers.lego.repositories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class LegoApplication implements CommandLineRunner {

    @Autowired
    private MinifigureRepository minifigureRepository;

    @Autowired
    private HouseRepository houseRepository;

    @Autowired
    private OwnerRepository ownerRepository;

    public static void main(String[] args) {
        SpringApplication.run(LegoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        this.houseRepository.add(new House("Apple Store"));
        this.ownerRepository.add(new Owner("Jip"));
        this.minifigureRepository.add(new Minifigure(List.of(new Owner("Jip")), "Jip", "Apple Store",
                false, false, "real-life", "Software Engineer", false, new House("Apple Store"), StupidLevel.NORMAAL));
    }
}
