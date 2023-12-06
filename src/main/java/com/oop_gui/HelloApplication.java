package com.oop_gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MainApp.fxml"));
        String css = this.getClass().getResource("/style/style.css").toExternalForm();
        Scene scene = new Scene(fxmlLoader.load(), 900, 600);
        scene.getStylesheets().add(css);
        stage.setTitle("Chat_Box!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}