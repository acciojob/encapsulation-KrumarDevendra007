package com.driver;

public class RWOnly {

    private String name;
    public String getName(){  // create getter function for get the private variable name
        return name;
    }

    public void setName(String name){ //create setter function for set the private variable name
        this.name = name;
    }
}
