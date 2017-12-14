package com.ljc.jdk8;
//演示jdk8，接口默认方法新特性
public interface DefaultDemo
{
    default void jdk8defaultMethod()
    {
        System.out.println("DefaultDemo.jdk8defaultMethod");
    }
    //默认方法不只一个
    default int add(int x,int y)
    {
        return x + y;
    }

    static void staticDemo(String str)
    {
        System.out.println("DefaultDemo.staticDemo");
    }
}
