package com.alpha.byInject;

import javax.inject.Inject;

/**
 * Created by Administrator on 2017/5/12.
 */
public class A {
    @Inject
    private B b;

    /**必须有无参构造函数*/
    public A() {
    }

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
