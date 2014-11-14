package ru.karinuss;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Created by karina on 03.10.14.
 */

//todo add hibernate config
public class MainApp {

    static private SessionFactory sessionFactory;

    private void setUpConnection() {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    public static void main(String[] args) {

        MainApp app = new MainApp();
        app.setUpConnection();
        //todo: add ui
        session.close();
    }

    public void add(BusinessCenter bc) {

        // open transaction
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
//todo

        // close transaction
        session.getTransaction().commit();
        session.close();
    }

    public void remove(BusinessCenter bc) {

        // open transaction
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
//todo

        // close transaction
        session.getTransaction().commit();
    }

}
