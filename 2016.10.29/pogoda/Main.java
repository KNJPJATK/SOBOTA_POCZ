package com.pjatk.pogoda;

/**
 * Created by lukaszlesniewski on 29.10.2016.
 */
public class Main {

    public static void main(String[] args) {
        Pogoda pogoda = new Pogoda();
        pogoda.setTemperatura(30);
        pogoda.setWilgotnosc(3);
        pogoda.setZachmurzenie(3);

        System.out.println(pogoda.getTemperatura());
        System.out.println(pogoda.getWilgotnosc());
        System.out.println(pogoda.getZachmurzenie());


    }

}
