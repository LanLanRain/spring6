package com.rainsoul.spring6.test;

import com.rainsoul.spring6.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) // 使用Spring提供的JUnit运行器
@ContextConfiguration("classpath:spring.xml") // 指定Spring配置文件的位置
public class SpringJUnit4Test {

    @Autowired // 自动注入User实例
    private User user;

    /**
     * 测试User对象的名称打印。
     * 该测试函数没有参数和返回值。
     */
    @Test
    public void testUser(){
        System.out.println(user.getName()); // 打印用户名称
    }

    /*Spring提供的方便主要是这几个注解：
    @RunWith(SpringJUnit4ClassRunner.class)
    @ContextConfiguration("classpath:spring.xml")
    在单元测试类上使用这两个注解之后，在单元测试类中的属性上可以使用@Autowired。比较方便。*/

    @Test
    public void testUser0(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user.getName());
    }

    @Test
    public void testUser2(){
        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User user = applicationContext.getBean("user", User.class);*/
        System.out.println(user.getName());
    }

    @Test
    public void testUser3(){
        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User user = applicationContext.getBean("user", User.class);*/
        System.out.println(user.getName());
    }
}

