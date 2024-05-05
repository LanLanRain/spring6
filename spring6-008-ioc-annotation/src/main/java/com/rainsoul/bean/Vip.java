package com.rainsoul.bean;

import org.springframework.stereotype.Controller;

@Controller("vipBean") // 如果属性名是value的话，这个属性名可以省略。
public class Vip {
}

/*
以上的这个注解@Controller("vipBean")就相当于以下的这个配置信息：
<bean id="vipBean" class="com.rainsoul.bean.Vip"></bean>
 */