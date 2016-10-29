package com.pjatk.powtorzenie.kompiluj;

public class CompileOrNot {
    public static void main(String[] args) {
        Punkt punkt = new Punkt();

        punkt.x = 10;
        punkt.y = 20;
        System.out.println(punkt.x + " " + punkt.y);
    }
}

class Punkt {
    int x;
    int y;
}
