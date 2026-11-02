package main;

import java.util.Scanner;
import model.BMI;
import model.BMI_Perempuan;
import model.BMI_Pria;

public class demoTerminal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ulang;

        do {
            System.out.println("====================================");
            System.out.println("           KALKULATOR BMI           ");
            System.out.println("====================================");

            System.out.println("Pilih Jenis Kelamin:");
            System.out.println("1. Pria");
            System.out.println("2. Perempuan");
            System.out.print("Masukkan pilihan (1/2): ");
            int pilihan = input.nextInt();

            if (pilihan != 1 && pilihan != 2) {
                System.out.println("\n[!] Pilihan tidak valid! Silakan masukkan 1 atau 2.\n");
                System.out.print("Ingin mencoba lagi? (y/n): ");
                ulang = input.next();
                System.out.println();
                continue;
            }

            System.out.print("Masukkan Berat Badan (kg) : ");
            double berat = input.nextDouble();

            System.out.print("Masukkan Tinggi Badan (cm): ");
            double tinggi = input.nextDouble();

            if (berat <= 0 || tinggi <= 0) {
                System.out.println("\n[!] Berat dan tinggi badan harus lebih dari 0!\n");
            } else {
                // Polymorphism: objek BMI menyesuaikan dengan pilihan gender
                BMI bmiObj;
                String gender;

                if (pilihan == 1) {
                    bmiObj = new BMI_Pria(berat, tinggi);
                    gender = "Pria";
                } else {
                    bmiObj = new BMI_Perempuan(berat, tinggi);
                    gender = "Perempuan";
                }

                double hasilBMI = bmiObj.hitungBMI();
                String kategori = bmiObj.getKategori();

                System.out.println("\n----------- HASIL ANALISIS -----------");
                System.out.println("Jenis Kelamin : " + gender);
                System.out.printf("Nilai BMI     : %.2f\n", hasilBMI);
                System.out.println("Kategori      : " + kategori);
                System.out.println("--------------------------------------\n");
            }

            System.out.print("Hitung ulang lagi? (y/n): ");
            ulang = input.next();
            System.out.println();

        } while (ulang.equalsIgnoreCase("y"));

        System.out.println("Terima kasih telah menggunakan Kalkulator BMI!");
        input.close();
    }
}