package com.alpha.Advice.Around;

import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;

/**
 * ProxyFactory类
 */
public class TargetTest {
    @Test
    public void sayHello() throws Exception {
        AroundAdvice beforeAdvice = new AroundAdvice();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.addAdvice(beforeAdvice);

        proxyFactory.setTarget(new Target());
        Target proxy = (Target) proxyFactory.getProxy();
        /**所有方法都会被拦截*/
        proxy.sayHello();
        proxy.sayBye();
        String foo = proxy.foo();
        System.out.println(foo);

        proxyFactory.setTarget(new AnotherTarget());
        AnotherTarget anotherTarget = (AnotherTarget) proxyFactory.getProxy();
        anotherTarget.writeMessage("welcome");
    }

}