package scenes;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class ScenesController implements Initializable {

    final ObservableList<String> sceneListItems = FXCollections.observableArrayList("Scene 1", "Scene 2", "Scene 3", "Scene 4", "Scene 5");

    @FXML
    private ListView<String> sceneList;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        sceneList.setItems(sceneListItems);
    }
}
