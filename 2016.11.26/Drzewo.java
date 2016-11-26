package com.company;

public class Drzewo {

    private int wartosc;
    private Drzewo lewo;
    private Drzewo prawo;


    public int getWartosc() {
        return wartosc;
    }

    public void setWartosc(int wartosc) {
        this.wartosc = wartosc;
    }

    public Drzewo getLewo() {
        return lewo;
    }

    public void setLewo(Drzewo lewo) {
        this.lewo = lewo;
    }

    public Drzewo getPrawo() {
        return prawo;
    }

    public void setPrawo(Drzewo prawo) {
        this.prawo = prawo;
    }

    @Override
    public String toString() {
        return "Drzewo{" +
                "wartosc=" + wartosc +
                ", lewo=" + lewo +
                ", prawo=" + prawo +
                '}';
    }
}
