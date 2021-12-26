package com.musketiers.lego.repositories;

import com.musketiers.lego.models.House;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * This class <description of functionality>
 *
 * @author jipderksen
 */

@Repository
@Component
@Transactional
public class HouseRepository implements ElementRepository<House> {

    @Autowired
    private EntityManager em;

    @Override
    public List<House> findAll() {
        return null;
    }

    @Override
    public House add(House house) {
        return this.em.merge(house);
    }

    @Override
    public House update(House house) {
        return this.em.merge(house);
    }

    @Override
    public boolean delete(House house) {
        int oldSize = this.findAll().size();
        this.em.remove(house);
        int sizeDiff = oldSize - this.findAll().size();

        return sizeDiff > 0;
    }

    @Override
    public House findById(int id) {
        return this.em.find(House.class, id);
    }
}
