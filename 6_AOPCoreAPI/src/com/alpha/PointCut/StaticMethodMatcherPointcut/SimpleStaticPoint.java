package com.alpha.PointCut.StaticMethodMatcherPointcut;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.lang.reflect.Method;

/**
 * 切点：1、方法级别；2、根据方法匹配
 */
public class SimpleStaticPoint extends StaticMethodMatcherPointcut {
    /**
     * @param method :被拦截的方法名称
     * @param aClass :被拦截的方法所属的类
     * 可以根据方法的全部信息：名字、返回值、参数类型等
     */
    @Override
    public boolean matches(Method method, Class<?> aClass) {
        /**根据方法名称拦截*/
        return method.getName().startsWith("say");
    }
}
