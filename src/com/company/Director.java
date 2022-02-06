package com.company;

public class Director extends Employee{
    public int bonus;

    public Director(String firstName, String lastName, int age, int salary){
        super(firstName, lastName, age, salary);
        this.bonus = bonus;
    }

    public void printDirectorInfo(){
        System.out.println(firstName + lastName
                +age + salary + bonus);
    }
}