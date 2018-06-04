package com.alpha.ProxyFactoryBean;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/5/18.
 */
public class AnotherTargetTest {
    private ApplicationContext ctx;
    private AnotherTarget proxy;

    @Before
    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext("my-config.xml");
        proxy = this.ctx.getBean("proxy1", AnotherTarget.class);
    }

    @Test
    public void writeMessage() throws Exception {
        proxy.writeMessage("hello");
    }

    @Test
    public void saying() throws Exception {
        proxy.saying();
    }

}