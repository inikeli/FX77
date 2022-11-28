package com.example.fx77;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class FieldController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button fieldButton;

    @FXML
    private TextField xEnd;

    @FXML
    private TextField xStart;

    @FXML
    void setRange(ActionEvent event) throws IOException {
         int start = Integer.parseInt(xStart.getText());
         int end = Integer.parseInt(xEnd.getText());
        FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        root = loader.load();
        Controller controller = loader.getController();
        //root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.showAndWait();

    }


}
