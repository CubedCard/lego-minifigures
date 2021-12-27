package com.musketiers.lego.rest;

import com.musketiers.lego.models.mini.Minifigure;
import com.musketiers.lego.repositories.MinifigureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * This class <description of functionality>
 *
 * @author jipderksen
 */

@RestController
@RequestMapping("/mini")
public class MinifigureController {

    @Autowired
    private MinifigureRepository repository;

    @GetMapping
    public List<Minifigure> getAllMinifigures() {
        return this.repository.findAll();
    }

//    @PutMapping("/{id}")
//    public Minifigure updateMinifigure(@RequestBody String minifigure, @PathVariable int id) {
//        final GsonBuilder gsonBuilder = new GsonBuilder();
//        final Gson gson = gsonBuilder.create();
//        Minifigure minifigure1 = gson.fromJson(minifigure, Minifigure.class);
//        if (minifigure1 == null) return null;
//        return this.repository.updateMinifigure(minifigure1);
//    }

    @PostMapping
    public Minifigure addMinifigure(@RequestBody Minifigure minifigure) {
        return this.repository.add(minifigure);
    }
}
