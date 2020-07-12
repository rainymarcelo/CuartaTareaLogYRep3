package sample.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import sample.model.DyV;

import java.awt.*;
import java.util.Random;

public class divideYVencerasController {

    @FXML
    private Label lResultado;

    public void initialize(){
        Random random=new Random();
        int n= random.nextInt(40)+10;
        int[] vector=new int[n];
        for (int i=0;i<n;i++){
            vector[i]=random.nextInt(100)+1;
        }

        DyV dvy=new DyV();
        String respuesta=dvy.sortMergeIterativo(vector);

        lResultado.setText(respuesta);
    }
}
