package com.rainsoul.spring6.test;

import com.rainsoul.spring6.service.CustomerService;
import com.rainsoul.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDITest {
    @Test
    public void testSetDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean("userServiceBean", UserService.class);
        userService.saveUser();
    }

    @Test
    public void testConstructorDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        CustomerService customerService = applicationContext.getBean("csBean", CustomerService.class);
        customerService.save();

        CustomerService csBean2 = applicationContext.getBean("csBean2", CustomerService.class);
        csBean2.save();

        CustomerService csBean3 = applicationContext.getBean("csBean3", CustomerService.class);
        csBean3.save();
    }
}
