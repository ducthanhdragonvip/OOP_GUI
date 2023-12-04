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
    AnchorPane chatbox2;
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
    @FXML
    public void boxChat2(MouseEvent mouseEvent) {
        try {
            chatbox2 = FXMLLoader.load(getClass().getResource("Friend#2.fxml"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        setMainPane(chatbox2);
    }

}