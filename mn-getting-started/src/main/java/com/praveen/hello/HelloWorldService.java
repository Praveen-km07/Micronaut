package com.praveen.hello;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class HelloWorldService {


    public String helloFromService(){
        return "Hello from service!";
    }
}
