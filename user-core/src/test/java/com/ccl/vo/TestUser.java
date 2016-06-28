package com.ccl.vo;

import com.ccl.util.HibernateUtil;
import org.hibernate.Session;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hp on 2016/6/28 0028.
 */
public class TestUser {

    @Test
    public void testAdd() {
        /*Session session = HibernateUtil.openSession();
        session.beginTransaction();
        User user = new User();
        user.setUsername("admin");
        user.setPassword("123");
        user.setNickname("超级管理员");
        user.setEmail("15618035056@163.com");
        session.save(user);
        Assert.assertTrue(user.getId()>0);
        session.getTransaction().commit();*/
    }

    @Test
    public void loadTest() {
        Session session = HibernateUtil.openSession();
        session.beginTransaction();
        User user = (User) session.load(User.class, 1);
        Assert.assertEquals(1,user.getId());
        session.getTransaction().commit();
    }
}
