package scenes;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

public class ScenesController implements Initializable {

    final ObservableList<String> sceneListItems = FXCollections.observableArrayList("Scene 1");

    @FXML
    private ListView<String> sceneList;

    @FXML
    private ImageView sceneIcon;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {

        // Create image for scene editor icon
        URL imageUrl = this.getClass().getResource("/resources/audience.png");
        Image image = new Image(String.valueOf(imageUrl));

        sceneIcon.setImage(image);
        sceneList.setItems(sceneListItems);
    }
}
