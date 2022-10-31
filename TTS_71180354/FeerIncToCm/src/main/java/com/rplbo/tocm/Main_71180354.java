package com.rplbo.tocm;

public class Main_71180354 {
    public Main_71180354() {
    }

    public static double FeetIncToCm(int inc) {
        if (inc > 0) {
            double inch = (double)(inc % 12);
            double feet = ((double)inc - inch) / 12.0;
            double hasil = FeetIncToCm(feet, inch);
            System.out.println("" + inc + " inc = " + feet + " feet " + inch + " inc");
            return hasil;
        } else {
            return -1.0;
        }
    }

    public static double FeetIncToCm(double feet, double inch) {
        if (feet > 0.0 && inch > 0.0) {
            double f = feet * 12.0;
            double hasil = (f + inch) * 2.54;
            return hasil;
        } else {
            return -1.0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Nilai Dalam Centimeter: " + FeetIncToCm(1.0, 3.0) + " cm");
        System.out.println("Nilai Dalam Centimeter: " + FeetIncToCm(15));
        System.out.println();
        System.out.println();
        System.out.println("Nilai Dalam Centimeter: " + FeetIncToCm(12.0, 5.0) + " cm");
        System.out.println("Nilai Dalam Centimeter: " + FeetIncToCm(30));
    }
}
