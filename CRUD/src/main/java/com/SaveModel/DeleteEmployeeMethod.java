
package com.SaveModel;

import com.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DeleteEmployeeMethod 
{
   SessionFactory factory=HibernateUtil.getSessionFactory();
   public void DeleteEmployeeMethod(User user)
   {
       Session session=factory.openSession();
       try
       {
          session.beginTransaction();
          session.delete(user);
          session.getTransaction().commit();
       }
       catch(Exception e)
       {
           session.getTransaction().rollback();
       }
       session.close();
   }
   
}
