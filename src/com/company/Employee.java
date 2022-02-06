package com.company;

public class Employee {
    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    public Employee(String firstName, String lastName, int age, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println(firstName + " " + lastName + " " + age);
        printPrivateMsg();
    }

    private void printPrivateMsg(){
        System.out.println("Hey it's me!");
    }
}
