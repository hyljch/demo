package com.ljc.jdk8;

import java.util.Arrays;

public class LambdaDemo
{
    public void lamdbaDemoMethod(LambdaDemoTest ldt)
    {
        ldt.hello("hello");
    }

    public static void main(String[] args) {
       // new LambdaDemo().lamdbaDemoMethod(LambdaDemoTest::new);

        Arrays.asList("1","a","f").forEach(e -> System.out.println(e));
    }
}

class LambdaDemoTest
{
    public void hello(String h)
    {
        System.out.println("LambdaDemoTest.hello" + h);
    }

    public void helloWorld(String h)
    {
        System.out.println("FUCK" + h);
    }
}
