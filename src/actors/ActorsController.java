package actors;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;

import java.net.URL;
import java.util.ResourceBundle;

public class ActorsController implements Initializable {

    final ObservableList<String> personalityListItems = FXCollections.observableArrayList("Personality Model", "Relationships");
    final ObservableList<String> actorListItems = FXCollections.observableArrayList("Actor 1", "Actor 2", "Actor 3");

    @FXML private ListView<String> personalityList;
    @FXML private ListView<String> actorList;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        personalityList.setItems(personalityListItems);
        actorList.setItems(actorListItems);
    }
}
