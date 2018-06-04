package com.alpha.Advice.AfterReturning;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/5/16.
 */
public class AfterAdvice implements AfterReturningAdvice {
    /**
     * @param o1      :拦截的对象
     * @param method  :拦截的方法
     * @param objects :拦截的方法的参数
     * @param o       :拦截的方法的返回值
     */
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("logging: " + method.getName());
        System.out.println(o);
        System.out.println(o1);

    }
}
