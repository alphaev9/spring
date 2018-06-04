package com.alpha.onConstructor;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/5/12.
 */
public class A {

    private B b;

    @Autowired
    public A(B b) {
        this.b = b;
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        System.out.println("setter");
        this.b = b;
    }
}
