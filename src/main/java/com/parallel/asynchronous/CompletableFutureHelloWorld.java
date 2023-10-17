package com.parallel.asynchronous;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureHelloWorld {

    public static void main(String[] args)  {

        HelloWorldService hws = new HelloWorldService();

        CompletableFuture
                .supplyAsync(() -> hws.helloWorld()) // SupplyAsync is factory Method & Has Supplier Functional Interface, It Returns CompletableFuture<T>
                .thenApply((result) -> result.toUpperCase()) //thenApply function used apply some changes from the supplyAsnc Result
                .thenAccept((value) -> System.out.println(value)) //thenAccept is CompletionStage Method & has Consumer Functional Interface, It returns CompletableFuture<Void>
                .join(); //Used to wait till this thread completes & join with the main thread

        System.out.println("Closing the main thread");

    }


}
