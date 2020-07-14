package sample.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import sample.model.DyV;

import java.awt.*;
import java.util.Random;

public class divideYVencerasController {

    @FXML
    private Label lResultadoAleatorio;

    @FXML
    private Label lResultadoPosicion;

    @FXML
    private TextField txtTamano;

    @FXML
    private TextField txtPosicion;

    public void initialize(){
        
    }


    public void aleatorio(){
        Random random=new Random();
        int n= random.nextInt(40)+10;
        int[] vector=new int[n];
        for (int i=0;i<n;i++){
            vector[i]=random.nextInt(99)+1;
        }

        DyV dvy=new DyV();
        String respuesta=dvy.sortMergeIterativo(vector);

        lResultadoAleatorio.setText(respuesta);
    }

    public void encontrarDato(){
        int tamano=Integer.parseInt(txtTamano.getText());
        int posicion=Integer.parseInt(txtPosicion.getText());

        Random random=new Random();
        int[] vector=new int[tamano];
        for (int i=0;i<tamano;i++){
            vector[i]=random.nextInt(99)+1;
        }

        DyV dvy=new DyV();
        String respuesa="El vector generado es:\n\n"+dvy.print(vector)+"\n\n"+ dvy.sortMergeDescendente(vector,posicion-1);

        lResultadoPosicion.setText(respuesa);
    }
}
