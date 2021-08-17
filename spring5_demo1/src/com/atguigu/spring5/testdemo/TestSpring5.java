package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.Book;
import com.atguigu.spring5.Orders;
import com.atguigu.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring5 {
    @Test
//    public void testAdd(){
//       ApplicationContext ac = new ClassPathXmlApplicationContext("bean1.xml");
//        User user = ac.getBean("user", User.class);
//        System.out.println(user);
//        user.add();
//    }
    public void testBook1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.testDemo();
    }
    @Test
    public void testOrders(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Orders orders1 = context.getBean("orders", Orders.class);
        System.out.println(orders1);
        orders1.ordersTest();
    }
}
