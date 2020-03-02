package com.vineet.rest.webservice.resetful.Helloworld;

public class HelloWorldBean {

    private String message;

    public HelloWorldBean(String s) {
        this.message=s;
    }

    public String getMessage() {
        return message;
    }

    @Override

    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }

    public void setS(String s) {
        this.message = s;
    }
}
