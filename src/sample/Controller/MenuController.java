package sample.Controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class MenuController {

    private MainController mainController;




    @FXML
    public void openApplication(ActionEvent actionEvent) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/sample/fxml/AppScreen.fxml"));
        Pane pane =null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        AppController appController = loader.getController();
        appController.setMainController(mainController);
       mainController.setScreen(pane);
    }

    @FXML
    public void openOptions(ActionEvent actionEvent) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/sample/fxml/OptionsScreen.fxml"));
        Pane pane =null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        OptionsController optionsController = loader.getController();
        optionsController.setMainController(mainController);
        mainController.setScreen(pane);
    }

    @FXML
    public void exit(ActionEvent actionEvent) {
        Platform.exit();
    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }
}
