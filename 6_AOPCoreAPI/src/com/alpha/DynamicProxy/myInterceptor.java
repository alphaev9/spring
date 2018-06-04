package com.alpha.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/5/16.
 */
public class myInterceptor implements InvocationHandler {
    private Object target;

    public myInterceptor(Object target) {
        this.target = target;
    }

    /**
     * @param proxy:实现接口的代理对象
     * @param method:被调用的方法
     * 1、分离了横切关注点
     * 2、通过代理，可以方便的织入到任意对象
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        /**模拟在被代理对象方法调用之前，进行日志*/
        System.out.println("logging.......");
        return method.invoke(target, args);
    }
}
