package com.alpha.Advice.AfterReturning;

/**
 * Created by Administrator on 2017/5/16.
 */
public class Target {
    public void sayHello() {
        System.out.println("hello!");
    }

    public void sayBye() {
        System.out.println("Bye!");
    }

    public String foo() {
        System.out.println("i'm foo");
        return "foo";
    }
}
