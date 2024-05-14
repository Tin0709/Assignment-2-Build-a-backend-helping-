package com.example.furtherprog_asm2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Db_function db = new Db_function();
        db.connect_to_db();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("TableView-Display-InsuranceCard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("HealthCare System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}