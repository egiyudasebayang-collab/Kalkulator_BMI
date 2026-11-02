package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main {

    public static void main(String[] args) {
        Application.launch(AppUI.class, args);
    }

    public static class AppUI extends Application {
        @Override
        public void start(Stage primaryStage) throws Exception {
            Parent root = FXMLLoader.load(getClass().getResource("/BMI_View.fxml"));
            
            Scene scene = new Scene(root);
            primaryStage.setTitle("Kalkulator BMI");
            primaryStage.setResizable(false);
            primaryStage.setScene(scene);
            primaryStage.show();
        }
    }
}