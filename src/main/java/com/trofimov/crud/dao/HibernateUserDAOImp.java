package com.trofimov.crud.dao;

import com.trofimov.crud.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class HibernateUserDAOImp implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public List<User> getAllUsers() {
        return getEntityManager().createQuery("From User").getResultList();
    }

    @Override
    public User getUserById(int id) {
        return getEntityManager().find(User.class, id);
    }

    @Override
    public void saveUser(User user) {
        getEntityManager().persist(user);
    }

    @Override
    public void editUser(User user) {
        getEntityManager().merge(user);
    }

    @Override
    public void removeUserById(int id) {
        getEntityManager().remove(getEntityManager().find(User.class, id));
    }

}
