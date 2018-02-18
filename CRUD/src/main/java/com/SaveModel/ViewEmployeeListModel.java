package com.SaveModel;

import com.entity.User;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class ViewEmployeeListModel {

    SessionFactory factory = HibernateUtil.getSessionFactory();
    Session session = factory.openSession();

    public List<User> ViewEmployee() {
        List list = new ArrayList();
        try{
        session.beginTransaction();
        Criteria c=session.createCriteria(User.class);
        session.getTransaction();
        list=c.list();
        }
        catch(Exception e)
        {
            session.getTransaction().rollback();
        }
        //session.close();
        return list;
    }
}
