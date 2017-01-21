package com.company.entities.person;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {

    private String name;
    private int age;
    private String country;
    private String zipCode;

    private static final String zipCodeRegex = "(\\d+\\S)+";
    private static final Pattern zipCodePattern = Pattern.compile(zipCodeRegex);

    private static final String nameRegex = "(\\p{IsAlphabetic}{2,}\\s*)+";
    private static final Pattern namePattern = Pattern.compile(nameRegex);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Matcher matcher = namePattern.matcher(name);
        if (!matcher.matches())
            throw new WrongNameRuntimeExcetion();
        this.name = name;
    }

    public void setZipCode(String zipCode) {
        Matcher matcher = zipCodePattern.matcher(zipCode);
        if (!matcher.matches()) {
            throw new WrongZipCodeRuntimeException();
        }
        this.zipCode = zipCode;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new WrongAgeRuntimeException();
        }
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country.length() != 2) {
            throw new WrongCountryCodeRuntimeException();
        }
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }


}
