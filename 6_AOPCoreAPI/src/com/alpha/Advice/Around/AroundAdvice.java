package com.alpha.Advice.Around;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by Administrator on 2017/5/16.
 */
public class AroundAdvice implements MethodInterceptor {
    /**
     * @param methodInvocation:封装了被拦截的方法
     * @return 被拦截的方法的返回值
     */
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("before:" + methodInvocation.getMethod().getName());
        Object result = methodInvocation.proceed();
        System.out.println("after:" + methodInvocation.getMethod().getName());
        return result;
    }
}
