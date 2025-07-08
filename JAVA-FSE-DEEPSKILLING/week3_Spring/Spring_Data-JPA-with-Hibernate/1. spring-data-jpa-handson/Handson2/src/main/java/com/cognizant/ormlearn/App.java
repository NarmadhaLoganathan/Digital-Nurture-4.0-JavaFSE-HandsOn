package com.cognizant.ormlearn;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        // Load hibernate.cfg.xml and build session factory
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            // Create a new Country
            Country country = new Country();
            country.setCode("FR");
            country.setName("France");
            session.save(country);

            // Retrieve all countries
            List<Country> countries = session.createQuery("from Country", Country.class).list();
            for (Country c : countries) {
                System.out.println(c);
            }

            // Get by ID
            Country c = session.get(Country.class, "FR");
            System.out.println("Fetched: " + c);

            // Delete
            session.delete(c);

            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
