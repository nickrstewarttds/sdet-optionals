package com.qa.main;

import java.util.Optional;

public class Runner {

    public static void main(String[] args) {

        String item;

        if (Math.random() >= 0.5) {
            item = "Hello";
        } else {
            item = null;
        }

        
        // optionals are a wrapper class which we can use to check if a particular object exists, or has a certain value
        
        // we can get the content of an object we've wrapped inside an optional by using get()
        System.out.println(Optional.of(item).get());
        
        // we can check if an object is null or not with the ofNullable() method
        System.out.println(Optional.ofNullable(item));
        
        // or we can be fancy and use optionals to check if an item exists, AND if it doesn't - throw an exception!
        // this funky () -> thing is a lambda expression, which is an anonymous function (single-use only) - we'll look at these later 
        System.out.println(Optional.of(item).orElseThrow(() -> new RuntimeException("not found, oof")));

    }

}
