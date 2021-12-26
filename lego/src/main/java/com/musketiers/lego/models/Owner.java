package com.musketiers.lego.models;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * This class <description of functionality>
 *
 * @author jipderksen
 */

@Entity
public class Owner {
    private String name;
    @Id
    private int id;

    public Owner() {}

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
