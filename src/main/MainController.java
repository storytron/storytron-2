package main;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Window;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Alert;



public class MainController {

    @FXML
    private MenuItem menuItemAbout;

    @FXML
    protected void displayAboutDialog(ActionEvent event) {
       //System.out.println("About menu clicked");
        Alert about = new Alert(Alert.AlertType.INFORMATION);
        about.setTitle("Storytron 2.0");
        about.setHeaderText(null);
        about.setContentText("\"Omnes idea nulla superbia\"\n\nAll ideas, no pride");
        about.showAndWait();
    }

}
