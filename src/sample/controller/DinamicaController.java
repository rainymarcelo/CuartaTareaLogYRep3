package sample.controller;

import javafx.fxml.FXML;
import sample.model.Dinamica;
import javafx.scene.control.Label;
import java.awt.*;

public class DinamicaController {

    @FXML
    private Label lResultado;

    public void initialize(){
        Dinamica dinamica=new Dinamica();
        lResultado.setText(dinamica.numeroPrimos());
    }
}
