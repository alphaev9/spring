package com.alpha.onConstructor;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/5/12.
 */
public class onConstructorTest {
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext("myconfig.xml");
    }

    @Test
    public void getB() throws Exception {
        A a = ctx.getBean("a", A.class);
        System.out.println(a.getB());
    }

}