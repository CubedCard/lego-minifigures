package com.musketiers.lego.rest;

import com.fasterxml.jackson.annotation.JsonView;
import com.musketiers.lego.models.User;
import com.musketiers.lego.repositories.UserRepository;
import com.musketiers.lego.views.UserView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

/**
 * This class <description of functionality>
 *
 * @author jipderksen
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    @JsonView(UserView.UserViewFilter.class)
    public List<User> getAllUsers() {
        return this.repository.findAll();
    }

    @PostMapping("/{key}")
    public User addUser(@RequestBody User user, @PathVariable String key) {
        if (!Objects.equals(key, this.getAllUsers().get(0).getPassword())) return null;
        return this.repository.add(user);
    }
}
