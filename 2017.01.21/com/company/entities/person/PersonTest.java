package com.company.entities.person;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lukaszlesniewski on 21.01.2017.
 */
public class PersonTest {

    @Test
    public void ustawWiek() {
        Person person = new Person();
        person.setAge(10);
    }

}