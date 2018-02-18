package com.SaveModel;

import com.entity.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class EditEmployeeRecord
{
    SessionFactory factory=HibernateUtil.getSessionFactory();
    
    public User EditEmployee(int id)
    {
        User emp=new User();
        Session session=factory.openSession();
        try
        {
            session.beginTransaction();
            System.out.println("id : "+id);
            Criteria c=session.createCriteria(User.class);
            emp=(User) session.get(User.class, id);
            //session.update(emp);
            
            //System.out.println("Designation : "+emp.getDesignation());
            session.getTransaction();
            //found=true;
            //System.out.println("found : "+found);
            //System.out.println(emp.getDesignation());
        }
        catch(Exception e)
        {
             
           e.printStackTrace();
           
        }
        session.close();
        
        return emp;
    }
    
    
    
    
    public void UpdateEmployee(User user)
    {
        Session session=factory.openSession();
        try
        {
//            //user.setId(1);
//            System.out.println("Id update : "+user.getId());
//            System.out.println("Name update : "+user.getName());
//            System.out.println("Salary update : "+user.getSalary());
//            System.out.println("Designation update : "+user.getDesignation());
            session.beginTransaction();
            session.update(user);
            session.getTransaction().commit();
        }
        catch(Exception e)
        {
            session.getTransaction().rollback();
            
        }
        session.close();
    }
    
    
    
}
