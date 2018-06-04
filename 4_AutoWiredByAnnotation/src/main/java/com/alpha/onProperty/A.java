package com.alpha.onProperty;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/5/12.
 */
public class A {
    @Autowired
    /**通过反射注入，而不是setter*/
    private B b;

    public B getB() {
        return b;
    }
    public void setB(B b) {
        System.out.println("setter");
        this.b = b;
    }
}
