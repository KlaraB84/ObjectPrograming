package com.company;
public class Company {

    public static void main(String[] args) {
        Employee jan = new Employee("Jan", "Kowalski", 45, 2500);
        Employee adam = new Employee("Adam", "Nowak", 35, 2000);

        jan.printInfo();
        adam.printInfo();

        adam.age = 37;

        jan.printInfo();
        adam.printInfo();

        Director director = new Director("Karol", "Kowal",
                50, 4000);
        director.printInfo();
        director.printDirectorInfo();


        CompanyCEO companyCEO = new CompanyCEO("Maciej", "Mazurek",
                60, 2000, 100000);

        companyCEO.printInfo();
        companyCEO.printDirectorInfo();
        companyCEO.printCEOInfo();
    }
}
