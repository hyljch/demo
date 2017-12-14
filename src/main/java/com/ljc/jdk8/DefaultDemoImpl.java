package com.ljc.jdk8;

//演示jdk8，接口默认方法新特性
public class DefaultDemoImpl implements DefaultDemo
{
    //有点类似继承的关系，可以重写默认方法
    @Override
    public void jdk8defaultMethod()
    {
        System.out.println("DefaultDemoImpl.jdk8defaultMethod");
    }

    public static void main(String[] args)
    {
        new DefaultDemoImpl().jdk8defaultMethod();

        DefaultDemo.staticDemo("hl");

        System.out.println(new DefaultDemoImpl().add(1,2));
    }
}
