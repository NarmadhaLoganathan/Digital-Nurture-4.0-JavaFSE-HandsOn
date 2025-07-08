package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        cfg.addAnnotatedClass(Employee.class);

        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction tx = session.beginTransaction();

        Employee emp = new Employee();
        emp.setName("John Doe");
        emp.setSalary(50000);
        session.save(emp);

        List<Employee> employees = session.createQuery("from Employee", Employee.class).list();
        for (Employee e : employees) {
            System.out.println(e);
        }

        Employee fetched = session.get(Employee.class, emp.getId());
        System.out.println("Fetched: " + fetched);

        session.delete(fetched);
        tx.commit();

        session.close();
        sessionFactory.close();
    }
}
