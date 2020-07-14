package sample;

import sample.controller.contenedorPrincipalController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader=new FXMLLoader(getClass().getResource("view/contenedor-princial.fxml"));
        Parent root = loader.load();
        contenedorPrincipalController controller=loader.getController();
        controller.setPrimaryStage(primaryStage);
        primaryStage.setTitle("Cuarta tarea Log Y Rep 3");
        primaryStage.setScene(new Scene(root, 500, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
