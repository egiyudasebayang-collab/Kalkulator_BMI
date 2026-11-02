package model;

public abstract class BMI {
    protected double berat; 
    protected double tinggi; 

    public BMI(double berat, double tinggi) {
        this.berat = berat;
        this.tinggi = tinggi;
    }

    public double hitungBMI() {
        double tinggiMeter = tinggi / 100.0;
        return berat / (tinggiMeter * tinggiMeter);
    }

    public abstract String getKategori();
}