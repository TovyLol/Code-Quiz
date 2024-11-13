/*
 * Dit is voor gevordigen met Java Kenis
 * 
 * Voor tips ga naar W3schools.com
 */



package org.example;


public class Main {
    public static void main(String[] args) {
        Auto mijnAuto = new Auto("Tesla", "Model Y", 2022, 1.972, "Electrisch", "AB-123-C", 0);
        int belasting = mijnAuto.berekenBelasting();
        System.out.println("De wegenbelasting voor de auto is: €" + belasting);
    }
}