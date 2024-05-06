package com.rainsoul.spring6.test;

import com.rainsoul.spring6.bean.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * SpringJUnit5Test类负责演示如何在JUnit 5测试中集成和使用Spring框架。
 * 该类使用了Spring Extension来启用Spring测试功能，并通过ContextConfiguration指定了Spring配置文件的位置。
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:spring.xml")
public class SpringJUnit5Test {

    // 通过@Autowired注解自动注入User实例，以便在测试中使用。
    @Autowired
    private User user;

    /**
     * 测试用户名称的打印。
     * 该测试方法简单地打印出用户的名称，用于演示如何在Spring测试中使用@Autowired注解注入依赖。
     */
    @Test
    public void testUser(){
        System.out.println(user.getName());
    }

    /*在JUnit5当中，可以使用Spring提供的以下两个注解，标注到单元测试类上，这样在类当中就可以使用@Autowired注解了。
    @ExtendWith(SpringExtension.class)
    @ContextConfiguration("classpath:spring.xml")*/
}

