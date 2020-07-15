package sample.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class contenedorPrincipalController {

    private Stage primaryStage;

    @FXML
    private BorderPane contenedorPrincipal;

    public void divideYVenceras() {
        try {
            AnchorPane registrarTrabajador = FXMLLoader
                    .load(getClass().getResource("../view/divide-venceras.fxml"));
            this.contenedorPrincipal.setCenter(registrarTrabajador);
            this.primaryStage.setWidth(850);
            this.primaryStage.setHeight(700);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public void dinamica() {
        try {
            AnchorPane registrarTrabajador = FXMLLoader
                    .load(getClass().getResource("../view/dinamica.fxml"));
            this.contenedorPrincipal.setCenter(registrarTrabajador);
            this.primaryStage.setWidth(850);
            this.primaryStage.setHeight(700);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }



    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
}
