package com.company;

import com.company.entities.person.Person;

public class Main {


    public static void main(String[] args) {


        for (int i = 0; i < 8; i++) {
            new Thread(() -> {
                for (int j = 0; j < 125000; j++) {
                    Person person = new Person();
                    person.setAge(10);
                    person.setCountry("PL");
                    person.setName("Jan Nowak");
                    person.setZipCode("23-234");
                    System.out.println("Done");
                }
            }).start();
        }


    }
}
