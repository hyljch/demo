package com.ljc.demo;

import static spark.Spark.*;

public class SparkDemo
{
    public static void main(String[] args)
    {
        get("/hello",(req,res) -> "helloworld");
    }
}
