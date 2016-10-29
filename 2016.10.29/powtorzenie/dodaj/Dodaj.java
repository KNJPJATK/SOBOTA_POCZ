package com.pjatk.powtorzenie.dodaj;


/**
 * Created by lukaszlesniewski on 29.10.2016.
 */
public class Dodaj {

    public static int dodaj(int x, int y) {
        return x + y;
    }

    public static int dodaj(int x, float y) {
        return x + (int)y + 100;
    }

    public static int dodaj(int x, double y) {
        return x + (int)y * 100;
    }

    public static void main(String[] args) {
        System.out.println(dodaj(10,
                                 dodaj(20,
                                       (double)dodaj(20, 4f))));
    }

}
