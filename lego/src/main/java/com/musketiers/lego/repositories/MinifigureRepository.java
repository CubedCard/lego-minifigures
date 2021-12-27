package com.musketiers.lego.repositories;

import com.musketiers.lego.models.mini.Minifigure;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * This class <description of functionality>
 *
 * @author jipderksen
 */

@Repository
@Component
@Transactional
public class MinifigureRepository implements ElementRepository<Minifigure> {

    @Autowired
    private EntityManager em;

    public MinifigureRepository() {
    }

    public Minifigure add(Minifigure minifigure) {
        return this.em.merge(minifigure);
    }

    public List<Minifigure> findAll() {
        TypedQuery<Minifigure> namedQuery = em.createNamedQuery("find_all_minifigures", Minifigure.class);
        return namedQuery.getResultList();
    }

    public Minifigure update(Minifigure minifigure) {
        return this.em.merge(minifigure);
    }

    public Minifigure findById(int id) {
        return this.em.find(Minifigure.class, id);
    }

    public boolean delete(Minifigure minifigure) {
        int oldSize = this.findAll().size();
        this.em.remove(minifigure);
        int sizeDiff = oldSize - this.findAll().size();

        return sizeDiff > 0;
    }
}
