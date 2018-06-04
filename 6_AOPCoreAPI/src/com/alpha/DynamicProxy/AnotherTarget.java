package com.alpha.DynamicProxy;

/**
 * Created by Administrator on 2017/5/16.
 */
public class AnotherTarget implements AnotherTargetInterface {
    @Override
    public void  writeMessage(String message){
        System.out.println("writting.........");
    }
}
