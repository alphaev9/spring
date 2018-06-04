package com.alpha.PointCut.StaticMethodMatcherPointcut;

import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

/**
 * ProxyFactory类
 */
public class TargetTest {
    @Test
    public void test() throws Exception {
        simpleBeforeAdvice beforeAdvice = new simpleBeforeAdvice();
        ProxyFactory proxyFactory = new ProxyFactory();
        /**
         * 1、创建一个切面=pointCut+Advice
         * 2、addAdvice是对 new DefaultPointcutAdvisor(Pointcut.TRUE, advice)封装
         * */
        DefaultPointcutAdvisor advisor = new DefaultPointcutAdvisor(new SimpleStaticPoint(), beforeAdvice);
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