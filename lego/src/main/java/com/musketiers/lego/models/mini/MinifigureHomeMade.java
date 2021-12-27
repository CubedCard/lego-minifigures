package com.musketiers.lego.models.mini;

import com.musketiers.lego.models.House;
import com.musketiers.lego.models.Owner;
import com.musketiers.lego.models.enums.StupidLevel;

import java.util.List;

/**
 * This class <description of functionality>
 *
 * @author jipderksen
 */
public class MinifigureHomeMade extends Minifigure {
    private boolean changed;

    public MinifigureHomeMade(List<Owner> owners, String name, String location, boolean female, boolean old, String theme, String job, boolean homeless, House house, StupidLevel stupidLevel, boolean changed) {
        super(owners, name, location, female, old, theme, job, homeless, house, stupidLevel);
        this.changed = changed;
    }

    public boolean isChanged() {
        return changed;
    }

    public void setChanged(boolean changed) {
        this.changed = changed;
    }
}
