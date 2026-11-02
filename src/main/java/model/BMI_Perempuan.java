package model;

public class BMI_Perempuan extends BMI {

    public BMI_Perempuan(double berat, double tinggi) {
        super(berat, tinggi);
    }

    @Override
    public String getKategori() {
        double bmi = hitungBMI();
        if (bmi < 18.5) {
            return "Kurus (Underweight)";
        } else if (bmi < 24.0) {
            return "Normal (Ideal)";
        } else if (bmi < 29.0) {
            return "Kelebihan Berat Badan (Overweight)";
        } else {
            return "Obesitas";
        }
    }
}