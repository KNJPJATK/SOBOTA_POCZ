package com.company;

/**
 * Zobacz lepiej:
 * Stack<String> strings = new Stack<>();
 */
public class StosStringow {
    private String[] obiekty;
    private int i;

    public StosStringow() {
        obiekty = new String[10];
        i = -1;
    }

    public StosStringow(int wysokoscStosu) {
        obiekty = new String[wysokoscStosu];
        i = -1;
    }

    public String zdejmij() {
        if (i < 0) {
            powiamProgramisteZeJegoMarzeniaSaNiczym();
            return "";
        }
        return obiekty[i--];
    }

    public void poloz(String element) {
        if (++i > obiekty.length - 1) {
            powiamProgramisteZeJegoMarzeniaSaNiczym();
            return;
        }
        obiekty[i] = element;
    }

    public boolean pusty() {
        return i == -1;
    }

    public boolean pelny() {
        return i == obiekty.length - 1;
    }

    private void powiamProgramisteZeJegoMarzeniaSaNiczym() {
        System.err.println("Zle!!!!!");
    }
}
