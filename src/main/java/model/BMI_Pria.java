package model;

public class BMI_Pria extends BMI {

    public BMI_Pria(double berat, double tinggi) {
        super(berat, tinggi);
    }

    @Override
    public String getKategori() {
        double bmi = hitungBMI();
        if (bmi < 20.0) {
            return "Kurus (Underweight)";
        } else if (bmi < 25.0) {
            return "Normal (Ideal)";
        } else if (bmi < 30.0) {
            return "Kelebihan Berat Badan (Overweight)";
        } else {
            return "Obesitas";
        }
    }
}
