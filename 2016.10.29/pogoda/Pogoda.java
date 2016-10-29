package com.pjatk.pogoda;

class Pogoda {
    private double temperatura;
    private int wilgotnosc;
    private int zachmurzenie;

    public void setTemperatura(double temperatura) {
        if (temperatura > 100.0) return;
        if (temperatura < 0) return;
        this.temperatura = temperatura;
    }

    public void setWilgotnosc(int wilgotnosc) {
        if (wilgotnosc > 100) return;
        if (wilgotnosc < 0) return;
        this.wilgotnosc = wilgotnosc;
    }

    public void setZachmurzenie(int zachmurzenie) {
        if (zachmurzenie < 0) return;
        if (zachmurzenie > 4) return;
        this.zachmurzenie = zachmurzenie;
    }

    public double getTemperatura() {
        return this.temperatura;
    }

    public int getWilgotnosc() {
        return this.wilgotnosc;
    }

    public int getZachmurzenie() {
        return this.zachmurzenie;
    }

}