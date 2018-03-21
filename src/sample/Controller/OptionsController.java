package sample.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class OptionsController {

    private MainController mainController;

    @FXML
    public void backMenu(ActionEvent actionEvent) {
        mainController.loadMenuScreen();

    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}
