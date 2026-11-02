package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import model.BMI;
import model.BMI_Perempuan;
import model.BMI_Pria;

public class BMI_Controller {

    @FXML
    private TextField txtBerat;

    @FXML
    private TextField txtTinggi;

    @FXML
    private RadioButton rbPria;

    @FXML
    private RadioButton rbPerempuan;

    @FXML
    private ToggleGroup genderGroup;

    @FXML
    private Label lblHasilBMI;

    @FXML
    private Label lblKategori;

    @FXML
    void hitungAction(ActionEvent event) {
        try {
            double berat = Double.parseDouble(txtBerat.getText());
            double tinggi = Double.parseDouble(txtTinggi.getText());

            if (berat <= 0 || tinggi <= 0) {
                lblKategori.setText("Berat dan tinggi harus lebih dari 0!");
                return;
            }

            BMI bmiObj;
            if (rbPria.isSelected()) {
                bmiObj = new BMI_Pria(berat, tinggi);
            } else if (rbPerempuan.isSelected()) {
                bmiObj = new BMI_Perempuan(berat, tinggi);
            } else {
                lblKategori.setText("Pilih jenis kelamin terlebih dahulu!");
                return;
            }

            double hasil = bmiObj.hitungBMI();
            lblHasilBMI.setText(String.format("BMI: %.2f", hasil));
            lblKategori.setText("Kategori: " + bmiObj.getKategori());

        } catch (NumberFormatException e) {
            lblHasilBMI.setText("BMI: -");
            lblKategori.setText("Input harus berupa angka yang valid!");
        }
    }

    @FXML
    void resetAction(ActionEvent event) {
        txtBerat.clear();
        txtTinggi.clear();
        rbPria.setSelected(false);
        rbPerempuan.setSelected(false);
        lblHasilBMI.setText("BMI: -");
        lblKategori.setText("Kategori: -");
    }
}