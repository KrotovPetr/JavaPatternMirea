package com.example.task15;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("userWork")
public class userWork {
    private final SessionFactory sessionFactory;
    private Session session;

    @Autowired
    public userWork(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public User read(long id){
        session = sessionFactory.openSession();
        User myUser = session.createQuery("select u from User u where u.id = :id", User.class).setParameter("id", id).getSingleResult();
        session.close();
        return myUser;
    }

    public void saveUser(User user){
        session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.saveOrUpdate(user);
        transaction.commit();
        session.close();
    }

    public boolean deleteUser(User user){
        session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        //Удаляем пользователя
        session.delete(user);
        transaction.commit();
        session.close();
        return true;
    }

    public List<User> getUsers() {
        session = sessionFactory.openSession();
        List<User> usrs = session.createQuery("select u from User u", User.class).getResultList();
        session.close();
        return usrs;
    }


}
