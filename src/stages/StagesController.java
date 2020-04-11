package stages;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class StagesController implements Initializable {

    final ObservableList<String> stageListItems = FXCollections.observableArrayList("Stage 1", "Stage 2", "Stage 3");

    @FXML
    private ListView<String> stageList;

    @FXML
    private ImageView stageIcon;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        // Create image for stage editor icon
        URL imageUrl = this.getClass().getResource("/resources/stage.png");
        Image image = new Image(String.valueOf(imageUrl));

        stageIcon.setImage(image);
        stageList.setItems(stageListItems);

        stageList.getSelectionModel().select(0);
    }
}
