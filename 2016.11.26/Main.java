package com.company;

public class Main {

    public static void main(String[] args) {
        Drzewo korzen = new Drzewo();
        korzen.setWartosc(500);


        Drzewo naLewo = new Drzewo();
        naLewo.setWartosc(250);

        Drzewo naPrawo = new Drzewo();
        naPrawo.setWartosc(1000);


        korzen.setLewo(naLewo);
        korzen.setPrawo(naPrawo);

        naLewo.setLewo(korzen);

        System.out.println(korzen);

    }
}
