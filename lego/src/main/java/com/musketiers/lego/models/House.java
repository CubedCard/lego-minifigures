package com.musketiers.lego.models;

import javax.persistence.*;

/**
 * This class <description of functionality>
 *
 * @author jipderksen
 */

@Entity
@NamedQueries(
        {
                @NamedQuery(name = "find_all_houses", query = "SELECT h FROM House h"),
        }
)
public class House {
    @Id
    @GeneratedValue
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
