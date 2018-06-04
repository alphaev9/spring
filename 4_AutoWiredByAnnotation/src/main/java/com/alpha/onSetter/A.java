package com.alpha.onSetter;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/5/12.
 */
public class A {
    private B b;

    public B getB() {
        return b;
    }
    @Autowired
    public void setB(B b) {
        System.out.println("setter");
        this.b = b;
    }
}
