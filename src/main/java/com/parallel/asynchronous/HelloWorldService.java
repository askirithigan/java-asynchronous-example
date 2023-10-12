package com.parallel.asynchronous;

import static java.lang.Thread.sleep;

public class HelloWorldService {

    public String helloWorld()  {
        delay(1000);
        System.out.println("Inside Hello World Method");
        return "Hello World";
    }

    public static void delay(long delayMilliSeconds)  {
        try{
            sleep(delayMilliSeconds);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
