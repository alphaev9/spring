package com.alpha.PointCut.DyanmicMethodMatcherPointcut;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/5/18.
 */
public class SimpleDynamicPointcut extends DynamicMethodMatcherPointcut {
    /**
     * @param aClass  :被拦截的类名
     * @param method  :被拦截的方法名
     * @param objects :被拦截的方法的实际参数，静态的只能根据参数的类型
     */
    @Override
    public boolean matches(Method method, Class<?> aClass, Object... objects) {
        /**可以根据拦截方法的实际参数，动态检查*/
        return method.getName().startsWith("say") && objects.length!=0;
    }
}
