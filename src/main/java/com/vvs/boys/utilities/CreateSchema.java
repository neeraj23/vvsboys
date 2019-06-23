package com.vvs.boys.utilities;

import com.vvs.boys.objects.UserObject;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;


import java.util.Date;


/**
 * Created by NRavi on 6/20/2019.
 */
public class CreateSchema
{
    public static void main(String[] args)
    {
        UserObject userObjectObj;

        userObjectObj = new UserObject();
        userObjectObj.setUserid(1);
        userObjectObj.setUsername("Editor ");
        userObjectObj.setCreatedBy("Administrator");
        userObjectObj.setCreatedDate(new Date());

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(userObjectObj);
        session.getTransaction().commit();




    }
}
