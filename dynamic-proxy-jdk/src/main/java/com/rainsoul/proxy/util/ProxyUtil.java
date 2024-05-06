package com.rainsoul.proxy.util;

import com.rainsoul.proxy.service.TimerInvocationHandler;

import java.lang.reflect.Proxy;

/**
 * 动态代理工具类
 */
public class ProxyUtil {

    /**
     * 生成代理对象的工具方法。
     * 该方法会根据目标对象创建一个动态代理，代理对象会拦截并处理特定的 method 调用。
     *
     * @param target 目标对象，将为目标对象创建一个代理
     * @return 代理对象，该对象实现了与目标对象相同的接口
     */
    public static Object newProxyInstance(Object target){
        // 使用JDK动态代理创建代理实例
        /*target.getClass().getClassLoader():
                            这个参数是类加载器，它用于加载代理类。这里使用目标对象的类加载器，确保代理类与目标类在相同的运行时环境中。
        target.getClass().getInterfaces():
                            这个参数是一个接口数组，表示代理对象需要实现的所有接口。这里是获取目标对象所实现的接口，
                            这样代理对象也能实现这些接口，保持与目标对象的兼容性。
        new TimerInvocationHandler(target):
                            这是调用处理器，当代理对象的方法被调用时，会由这个处理器来处理。TimerInvocationHandler是一个自定义的
                            InvocationHandler，它通常会记录方法的开始时间，在调用实际目标对象的方法后记录结束时间，从而实现方法执
                            行的计时功能。target参数是传递给处理器的目标对象引用，使得处理器可以调用目标对象的实际方法。*/
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new TimerInvocationHandler(target));
    }

}

