package com.ljc.spark;

import spark.servlet.SparkApplication;
import static spark.Spark.*;
public class MyAppInit implements SparkApplication
{
    @Override
    public void init()
    {

        get("/hello",(req,res) -> "helloworld");
    }
}
