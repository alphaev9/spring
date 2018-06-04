package com.alpha.PointCut.JdkRegexpMethodPointcut;

import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.JdkRegexpMethodPointcut;

/**
 * ProxyFactory类
 */
public class TargetTest {
    @Test
    public void test() throws Exception {
        simpleBeforeAdvice beforeAdvice = new simpleBeforeAdvice();
        ProxyFactory proxyFactory = new ProxyFactory();
        /**专门用来处理函数名匹配的切点*/
        JdkRegexpMethodPointcut pointcut = new JdkRegexpMethodPointcut();
        /**所有以say开头的方法*/
        pointcut.setPattern(".*say.*");

        DefaultPointcutAdvisor advisor = new DefaultPointcutAdvisor(pointcut, beforeAdvice);
        proxyFactory.addAdvisor(advisor);


        proxyFactory.setTarget(new Target());
        Target proxy = (Target) proxyFactory.getProxy();
        /**所有方法都会被拦截*/
        proxy.sayHello();
        proxy.sayBye();

//        proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new AnotherTarget());
        AnotherTarget anotherTarget = (AnotherTarget) proxyFactory.getProxy();
        anotherTarget.writeMessage("welcome");
        anotherTarget.saying();
    }

}