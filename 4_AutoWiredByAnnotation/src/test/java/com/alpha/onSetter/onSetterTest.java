package com.alpha.onSetter;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/5/12.
 */
public class onSetterTest {
    private ApplicationContext ctx;

    @Before
    public void setUp() throws Exception {
        ctx = new ClassPathXmlApplicationContext("myconfig2.xml");
    }

    @Test
    public void getB() throws Exception {
        A a = ctx.getBean("a", A.class);
        System.out.println(a.getB());
    }

}