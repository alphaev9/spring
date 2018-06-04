package com.alpha.PointCut.DyanmicMethodMatcherPointcut;

/**
 * Created by Administrator on 2017/5/16.
 */
public class Target {
    public void sayHello() {
        System.out.println("hello!");
    }

    public void sayBye(String prefix) {
        System.out.println(prefix + "Bye!");
    }
}
