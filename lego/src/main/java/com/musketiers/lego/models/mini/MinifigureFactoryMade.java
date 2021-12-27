package com.musketiers.lego.models.mini;

import com.musketiers.lego.models.*;
import com.musketiers.lego.models.enums.Packaging;
import com.musketiers.lego.models.enums.Size;
import com.musketiers.lego.models.enums.StupidLevel;

import java.util.List;

/**
 * This class <description of functionality>
 *
 * @author jipderksen
 */
public class MinifigureFactoryMade extends Minifigure {
    private Size size;
    private Packaging packaging;

    public MinifigureFactoryMade(List<Owner> owners, String name, String location, boolean female, boolean old, String theme, String job, boolean homeless, House house, StupidLevel stupidLevel, Size size, Packaging packaging) {
        super(owners, name, location, female, old, theme, job, homeless, house, stupidLevel);
        this.size = size;
        this.packaging = packaging;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Packaging getPackaging() {
        return packaging;
    }

    public void setPackaging(Packaging packaging) {
        this.packaging = packaging;
    }
}
