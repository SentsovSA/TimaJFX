package com.example.timajfx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private ComboBox<String> comboBox = new ComboBox<>();

    @FXML
    private Button button;

    @FXML
    private TextField textField;

    @FXML
    void onClick(ActionEvent event) {
            comboBox.getItems().add(textField.getText());
    }
}