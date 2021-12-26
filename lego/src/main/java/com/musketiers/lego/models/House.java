package com.musketiers.lego.models;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * This class <description of functionality>
 *
 * @author jipderksen
 */

@Entity
public class House {
    @Id
    private int id;
    private String name;

    public House() {
    }

    public House(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
