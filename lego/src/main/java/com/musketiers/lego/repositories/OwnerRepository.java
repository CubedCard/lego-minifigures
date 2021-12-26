package com.musketiers.lego.repositories;

import com.musketiers.lego.models.Owner;
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
public class OwnerRepository implements ElementRepository<Owner> {

    @Autowired
    private EntityManager em;

    @Override
    public List<Owner> findAll() {
        return null;
    }

    @Override
    public Owner add(Owner owner) {
        return this.em.merge(owner);
    }

    @Override
    public Owner update(Owner owner) {
        return this.em.merge(owner);
    }

    @Override
    public boolean delete(Owner owner) {
        int oldSize = this.findAll().size();
        this.em.remove(owner);
        int sizeDiff = oldSize - this.findAll().size();

        return sizeDiff > 0;
    }

    @Override
    public Owner findById(int id) {
        return this.em.find(Owner.class, id);
    }
}
