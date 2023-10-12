package com.parallel.asynchronous;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureHelloWorld {

    public static void main(String[] args)  {

        HelloWorldService hws = new HelloWorldService();

        CompletableFuture.supplyAsync(() -> hws.helloWorld())
                .thenAccept((value) -> System.out.println(value))
                .join();

        System.out.println("Closing the main thread");

    }


}
