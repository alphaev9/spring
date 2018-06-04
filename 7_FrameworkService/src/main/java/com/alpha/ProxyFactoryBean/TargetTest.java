package com.alpha.ProxyFactoryBean;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/5/18.
 */
public class TargetTest {
    private ApplicationContext ctx;
    private Target proxy;

    @Before
    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext("my-config.xml");
        proxy = this.ctx.getBean("proxy", Target.class);
    }

    @Test
    public void sayHello() throws Exception {
        proxy.sayHello();
    }

    @Test
    public void sayBye() throws Exception {
        proxy.sayBye();
    }

}