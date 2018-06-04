package com.alpha.PointCut.ClassFilter;

import org.springframework.aop.ClassFilter;

/**
 * Created by Administrator on 2017/5/18.
 */
public class MyClassFilter implements ClassFilter {
    @Override
    public boolean matches(Class<?> aClass) {
        return aClass==AnotherTarget.class;
    }
}
