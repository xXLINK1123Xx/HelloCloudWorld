package com.google.training.helloworld;

public class HelloClass {
    public String message = "Hello World";
    public static int count = 0;
    public String saycount = "You have already pressed buttons "+count;
    
    public HelloClass () {
    	count++;
    }
    
    public HelloClass(String name, String period)
    {
    	count++;
    	this.message = "Hello " + name + ", now is "+ period;
    }

    public HelloClass (String name) {
    	count++;
        this.message = "Hello " + name + "!";
    }
    
    public HelloClass(int a){
    	this.message = "you saw message " + count + " times.";
    }

    public String getMessage() {
    	
        return message;
    }
    
    public String getCount()
    {
    	return "You have pressed buttons "+count;
    }
}
