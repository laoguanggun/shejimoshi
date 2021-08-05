package com.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author mzb
 * @version 1.0.0
 * @ClassName ProxyFactory
 * @Description TODO
 * @createTime 2021年08月03日 10:23:00
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("动态代理开始");
                Object invoke = method.invoke(target, args);
                System.out.println("动态代理结束");
                return invoke;
            }
        });
    }
}
