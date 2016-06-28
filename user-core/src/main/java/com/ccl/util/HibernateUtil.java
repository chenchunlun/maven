package com.ccl.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by hp on 2016/6/28 0028.
 */
public class HibernateUtil {
    private static SessionFactory factory = null;
    static {
        factory = new Configuration().configure().buildSessionFactory();
    }
    public static Session openSession(){
        return factory.openSession();
    }
}
