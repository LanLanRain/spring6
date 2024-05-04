package com.rainsoul.spring6.test;

import com.rainsoul.spring6.bean2.Husband;
import com.rainsoul.spring6.bean2.Wife;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CircularDependencyTest {

    @Test
    public void testCD2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring2.xml");

        Husband husbandBean = applicationContext.getBean("h", Husband.class);
        System.out.println(husbandBean);

        Wife wifeBean = applicationContext.getBean("w", Wife.class);
        System.out.println(wifeBean);
    }

    @Test
    public void testCD1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring1.xml");

        Husband husbandBean = applicationContext.getBean("husbandBean", Husband.class);
        System.out.println(husbandBean);

        Wife wifeBean = applicationContext.getBean("wifeBean", Wife.class);
        System.out.println(wifeBean);
    }
}
