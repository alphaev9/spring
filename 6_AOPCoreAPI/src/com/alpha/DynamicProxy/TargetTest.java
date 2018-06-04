package com.alpha.DynamicProxy;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2017/5/16.
 */
public class TargetTest {
    @Test
    public void sayHello() throws Exception {
        TargetInterface targetProxy = (TargetInterface) Proxy.newProxyInstance(Target.class.getClassLoader(),
                new Class[]{TargetInterface.class},
                new myInterceptor(new Target()));
        targetProxy.sayHello();

        AnotherTargetInterface anotherTartgetProxy = (AnotherTargetInterface) Proxy.newProxyInstance(AnotherTarget.class.getClassLoader(),
                new Class[]{AnotherTargetInterface.class},
                new myInterceptor(new AnotherTarget()));
        anotherTartgetProxy.writeMessage("welcome you!");
    }

}