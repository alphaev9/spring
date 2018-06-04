package com.alpha.PointCut.NameMatchMethodPointcut;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/5/16.
 */
public class simpleBeforeAdvice implements MethodBeforeAdvice {
    /**
     * @param o       :拦截的是哪个对象
     * @param method  :拦截的是哪个方法
     * @param objects :拦截的方法的参数
     *                可以做什么？
     */
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("logging.... " + method.getName());
    }
}
