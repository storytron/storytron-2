package main;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Tab;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class MainController{

    @FXML
    protected void displayAboutDialog(ActionEvent event)
    {
       //System.out.println("About menu clicked");
        Alert about = new Alert(Alert.AlertType.INFORMATION);
        about.setTitle("Storytron 2");
        about.setHeaderText(null);
        about.setContentText("v0.1-alpha1\n\n\"Omnes idea nulla superbia\"\nAll ideas, no pride");
        about.showAndWait();
    }

    @FXML
    protected void openFile() {

    }

    @FXML
    protected void saveFile() {

    }

    @FXML
    protected void quitApplication() {
        Platform.exit();
    }

}
