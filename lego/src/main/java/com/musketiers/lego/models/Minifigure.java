package com.musketiers.lego.models;

import javax.persistence.*;
import java.util.List;

/**
 * This class <description of functionality>
 *
 * @author jipderksen
 */

@Entity
@NamedQueries(
        {
                @NamedQuery(name = "find_all_minifigures", query = "SELECT m FROM Minifigure m"),
        }
)
public class Minifigure {
    @Id
    private int id;
    @ManyToMany(cascade = CascadeType.DETACH)
    private List<Owner> owners;
    private String name;
    private String location;
    private boolean female;
    private boolean old;
    private String theme;
    private String job;
    private boolean homeless;
    @ManyToOne()
    private House house;
    private StupidLevel stupidLevel;

    public Minifigure() {
    }

    public Minifigure(List<Owner> owners, String name, String location, boolean female, boolean old, String theme, String job, boolean homeless, House house, StupidLevel stupidLevel) {
        this.owners = owners;
        this.name = name;
        this.location = location;
        this.female = female;
        this.old = old;
        this.theme = theme;
        this.job = job;
        this.homeless = homeless;
        this.house = house;
        this.stupidLevel = stupidLevel;
    }

    public void setOwners(List<Owner> owners) {
        this.owners = owners;
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

    public List<Owner> getOwners() {
        return owners;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isFemale() {
        return female;
    }

    public void setFemale(boolean female) {
        this.female = female;
    }

    public boolean isOld() {
        return old;
    }

    public void setOld(boolean old) {
        this.old = old;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public boolean isHomeless() {
        return homeless;
    }

    public void setHomeless(boolean homeless) {
        this.homeless = homeless;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public StupidLevel getStupidLevel() {
        return stupidLevel;
    }

    public void setStupidLevel(StupidLevel stupidLevel) {
        this.stupidLevel = stupidLevel;
    }
}
