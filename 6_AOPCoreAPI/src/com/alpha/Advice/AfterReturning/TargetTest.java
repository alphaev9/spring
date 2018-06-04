package com.alpha.Advice.AfterReturning;

import org.junit.Test;
import org.springframework.aop.framework.ProxyFactory;

/**
 * ProxyFactory类
 */
public class TargetTest {
    @Test
    public void sayHello() throws Exception {
        AfterAdvice beforeAdvice = new AfterAdvice();
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.addAdvice(beforeAdvice);

        proxyFactory.setTarget(new Target());
        Target proxy = (Target) proxyFactory.getProxy();
        /**所有方法都会被拦截*/
        proxy.sayHello();
        proxy.sayBye();
        proxy.foo();

        proxyFactory.setTarget(new AnotherTarget());
        AnotherTarget anotherTarget = (AnotherTarget) proxyFactory.getProxy();
        anotherTarget.writeMessage("welcome");
    }

}