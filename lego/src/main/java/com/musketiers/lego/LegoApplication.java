package com.musketiers.lego;

import com.musketiers.lego.models.*;
import com.musketiers.lego.models.enums.StupidLevel;
import com.musketiers.lego.models.mini.Minifigure;
import com.musketiers.lego.repositories.HouseRepository;
import com.musketiers.lego.repositories.MinifigureRepository;
import com.musketiers.lego.repositories.OwnerRepository;
import com.musketiers.lego.repositories.UserRepository;
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

    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(LegoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        this.userRepository.add(
                new User("Jippert", "appelsapmetjamismisschiennietheellekker")
        );
        this.houseRepository.add(
                new House("Apple Store")
        );
        this.ownerRepository.add(
                new Owner("Jip")
        );
        this.minifigureRepository.add(
                new Minifigure(this.ownerRepository.findAll(), "Jip", "Apple Store", false, false, "real-life",
                        "Software Engineer", false, this.houseRepository.findAll().get(0), StupidLevel.NORMAAL)
        );
    }
}
