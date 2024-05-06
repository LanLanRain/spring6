package com.rainsoul.spring6.service;

import org.springframework.stereotype.Service;

@Service("orderService")
public class OrderService { // 目标类

    // 目标方法
    public void generate(){
        System.out.println("系统正在生成订单.....");
        /*if (1 == 1) {
           throw new RuntimeException("运行时异常");
        }*/
    }

}
