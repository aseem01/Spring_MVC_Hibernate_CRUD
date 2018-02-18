package com.SaveModel;

import com.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class SaveModel {

    SessionFactory factory = HibernateUtil.getSessionFactory();
    Session session = factory.openSession();

    public boolean EmployeeInsert(User user) {
        boolean found = true;
        try {
            session.beginTransaction();
//            System.out.println("Name : " + user.getName());
//            System.out.println("Salary : " + user.getSalary());
//            System.out.println("Designation : " + user.getDesignation());
            session.save(user);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            found = false;
        }
        return found;
    }

}
