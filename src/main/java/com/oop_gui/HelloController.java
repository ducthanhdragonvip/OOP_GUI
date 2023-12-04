package com.oop_gui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class HelloController {

    @FXML
    Pane friend1;
    @FXML
    AnchorPane chatPane;
    AnchorPane chatbox1;
    public void setMainPane(AnchorPane pane) {
        chatPane.getChildren().clear();
        chatPane.getChildren().addAll(pane);
    }
    @FXML
    public void boxChat1(MouseEvent mouseEvent) {
        try {
            chatbox1 = FXMLLoader.load(getClass().getResource("Friend#1.fxml"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        setMainPane(chatbox1);
    }

}