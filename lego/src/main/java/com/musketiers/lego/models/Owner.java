package com.musketiers.lego.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 * This class <description of functionality>
 *
 * @author jipderksen
 */

@Entity
@NamedQueries(
        {
                @NamedQuery(name = "find_all_owners", query = "SELECT o FROM Owner o"),
        }
)
public class Owner {
    @Id
    private int id;
    private String name;

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
