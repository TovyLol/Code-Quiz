package org.example;

public class Auto extends Vervoermiddel {
    private String brandstof;
    private String kenteken;

    private double CO2Uitstoot;
    private double wegenbelasting;
    public Auto(String merk, String model, int bouwjaar, double gewicht, String brandstofType, String kenteken, double CO2Uitstoot) {
        super(merk, model, bouwjaar, gewicht);
        this.brandstof = brandstofType;
        this.kenteken = kenteken;
        this.CO2Uitstoot = CO2Uitstoot;
    }
    public double berekenBelasting() {
        int basiskost = 50.00;
        int gewichtkost = 0;

        if (getGewicht() <= 750) {
            gewichtkost = 20.00;
        } else if (getGewicht() <= 1000) {
            gewichtkost = 40.00;
        } else if (getGewicht() <= 1500) {
            gewichtkost = 60.00;
            gewichtkost = 80.00;
        }
        int CO2Tarief = 0;
        if (CO2Uitstoot > 95) {
            CO2Tarief = (CO2Uitstoot - 95) * 0.10;
        }

        this.wegenbelasting = basiskost + gewichtkost + CO2Tarief;
        return this.wegenbelasting;
    }

}
