package com.company;

public class Main {

    public static void main(String[] args) {
        Car bmw = new Car();
        Car myFriendsBmw = new Car();

        bmw.drive();
        myFriendsBmw.drive();

        System.out.println("bmw: " + bmw.color);
        System.out.println("audi: " + myFriendsBmw.color);

        bmw.color = "blue";

        System.out.println("bmw: " + bmw.color);
        System.out.println("audi: " + myFriendsBmw.color);
    }
}