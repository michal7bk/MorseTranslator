package sample.Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import javafx.scene.control.TextField;

import java.io.IOException;

public class AppController {
    @FXML
    public ListView<String> listView = new ListView<>();

    @FXML
    public void initialize(){
        ObservableList<String> items = FXCollections.observableArrayList (
                "Single", "Double", "Suite", "Family App");
        listView.setItems(items);

    }

    private MainController mainController;

    @FXML
    private TextField writeTextField;
    @FXML
    private TextField readTextField;


    @FXML
    public void backMenu(ActionEvent actionEvent) {
        mainController.loadMenuScreen();


    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    @FXML
    public void button(ActionEvent actionEvent) {
        readTextField.setText(writeTextField.getText());

    }
}
