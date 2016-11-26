package com.company;

/**
 * Created by lukaszlesniewski on 26.11.2016.
 */
public class MainRandom {

    public static int losuj(int a, int b) {
        return a + (int)(Math.random()*(b - a + 1));
    }

    public static void main(String[] args) {



        for (int i = 0; i < 10000; i++) {
            wygenerujPeselIGoNapisz();
        }

    }

    private static void wygenerujPeselIGoNapisz() {
        System.out.println(wygenerujPesel());
    }

    private static String wygenerujPesel() {
        String tmp = "";
        tmp = tmp + losuj(5, 9);
        for (int i = 0; i < 10; i++) {
            tmp = tmp + losuj(5, 9);
        }
        return tmp;
    }

}
