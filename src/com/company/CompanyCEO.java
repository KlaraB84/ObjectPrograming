package com.company;


public class CompanyCEO extends Director{
    public int yearBonus;

    public CompanyCEO(String firstName, String lastName, int age, int bonus, int yearBonus) {
        super(firstName, lastName, age, bonus);
        this.yearBonus = yearBonus;
    }


    public void printCEOInfo(){
        System.out.println(firstName+ lastName+ age+
                salary+ bonus+ yearBonus);
    }
}