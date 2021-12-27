package com.musketiers.lego.repositories;

import com.musketiers.lego.models.User;
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
public class UserRepository implements ElementRepository<User> {

    @Autowired
    private EntityManager em;

    @Override
    public List<User> findAll() {
        TypedQuery<User> namedQuery = em.createNamedQuery("find_all_users", User.class);
        return namedQuery.getResultList();
    }

    @Override
    public User add(User user) {
        return this.em.merge(user);
    }

    @Override
    public User update(User user) {
        return this.em.merge(user);
    }

    @Override
    public boolean delete(User user) {
        int oldSize = this.findAll().size();
        this.em.remove(user);
        int sizeDiff = oldSize - this.findAll().size();

        return sizeDiff > 0;
    }

    @Override
    public User findById(int id) {
        return this.em.find(User.class, id);
    }
}
