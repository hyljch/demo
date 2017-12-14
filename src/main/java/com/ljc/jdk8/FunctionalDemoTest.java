package com.ljc.jdk8;

public class FunctionalDemoTest
{
    static int x = 6;
    static int y = 1;
    public static void main(String[] args) {
        System.out.println("FunctionalDemoTest.main");
        new FDemo().methodDemo(((x,y) ->  x + y),x,y);
    }
}

@FunctionalInterface
interface FunctionalDemo
{
    int add(int x,int y);

    default void hello()
    {

    }
}

class FDemo
{
    public void methodDemo(FunctionalDemo fd,int x,int y)
    {
        System.out.println(fd.add(x,y));
    }
}