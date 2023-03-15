package com.driver;

public class Main {

    public static void main(String[] args){

        RWOnly obj = new RWOnly();

        // Set the name using set function
        obj.setName("Kumar Devendra");

        // get the name using get funtion
        System.out.print(obj.getName());
    }
}