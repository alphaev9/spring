package com.alpha.DynamicProxy;

/**
 * Created by Administrator on 2017/5/16.
 */
public class Target implements TargetInterface {
    @Override
    public void sayHello() {
        System.out.println("hello!");
    }

    @Override
    public void sayBye() {
        System.out.println("Bye!");
    }
}
