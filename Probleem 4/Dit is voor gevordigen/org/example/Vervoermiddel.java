package org.example;

public class Vervoermiddel {
    private String merk;
    private String model;
    private int bouwjaar;
    private double gewicht;

    public Vervoermiddel(String merk, String model, int bouwjaar, double gewicht) {
        this.merk = merk;
        this.model = model;
        this.bouwjaar = bouwjaar;
        this.gewicht = gewicht;
    }

    public String getMerk() {
        return merk;
    }

    public String getModel() {
        return model;
    }

    public int getBouwjaar() {
        return bouwjaar;
    }

    public double getGewicht() {
        return gewicht;
    }
}
