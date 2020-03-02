package com.vineet.rest.webservice.resetful.Helloworld;

import com.vineet.rest.webservice.resetful.Helloworld.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloworldController {
    @GetMapping(path = "/hello-world")
    public String HelloWorld(){

        return "Hello-World";
    }



    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean HelloWorldBean(){

        return new HelloWorldBean("Hello World");
    }

    //hello-world/Path-variable/vineet
    @GetMapping(path = "/hello-world/Path-variable/{name}")
    public HelloWorldBean HelloWorldPathVariable(@PathVariable String name){

        return new HelloWorldBean(String.format("Hello You are , %s " ,name));
    }

}
