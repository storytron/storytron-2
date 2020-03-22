package main;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;

import javax.swing.*;


public class MainController {

    @FXML
    protected void displayAboutDialog(ActionEvent event) {
       //System.out.println("About menu clicked");
        Alert about = new Alert(Alert.AlertType.INFORMATION);
        about.setTitle("Storytron 2.0");
        about.setHeaderText(null);
        about.setContentText("v2.0-alpha1\n\n\"Omnes idea nulla superbia\"\nAll ideas, no pride");
        about.showAndWait();
    }

    @FXML
    protected void quitApplication() {
        Platform.exit();
    }

}
