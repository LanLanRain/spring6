package com.rainsoul.test;

import cn.rainsoul.service.StudentService;
import com.rainsoul.bean.*;
import com.rainsoul.bean3.MyDataSource;
import com.rainsoul.bean3.Product;
import com.rainsoul.dao.OrderDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IoCAnnotationTest {
    @Test
    public void testBeanComponent() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        User userBean = applicationContext.getBean("userBean", User.class);
        System.out.println(userBean);
        Vip vipBean = applicationContext.getBean("vipBean", Vip.class);
        System.out.println(vipBean);
        //Order orderBean = applicationContext.getBean("orderBean", Order.class);
        Order orderBean = applicationContext.getBean("order", com.rainsoul.bean.Order.class);
        System.out.println(orderBean);
        //Student studentBean = applicationContext.getBean("studentBean", Student.class);
        Student studentBean = applicationContext.getBean("student", Student.class);
        System.out.println(studentBean);

        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        System.out.println(orderService);

        OrderDao orderDao = applicationContext.getBean("orderDao", OrderDao.class);
        System.out.println(orderDao);
    }

    @Test
    public void testChoose() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-choose.xml");
    }

    @Test
    public void testDIByAnnotation() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-di-annotation.xml");
        MyDataSource myDataSource = applicationContext.getBean("myDataSource", MyDataSource.class);
        System.out.println(myDataSource);
        Product product = applicationContext.getBean("product", Product.class);
        System.out.println(product);
    }

    @Test
    public void testAutowired(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-autowired.xml");
        org.rainsoul.service.OrderService orderService = applicationContext.getBean("orderService", org.rainsoul.service.OrderService.class);
        orderService.generate();
    }

    @Test
    public void testResource() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-resource.xml");
        StudentService studentService = applicationContext.getBean("studentService", StudentService.class);
        studentService.deleteStudent();
    }
}
