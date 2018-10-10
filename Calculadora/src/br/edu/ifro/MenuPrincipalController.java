/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import javafx.scene.control.TextField;

/**
 *
 * @author 03822722260
 */
public class MenuPrincipalController implements Initializable {
    
     @FXML
    private TextField txtNumero1;
    @FXML
    private TextField txtNumero2;
    @FXML
    private TextField txtResultado;
    @FXML
    private Button btnSoma, btnMenos, btnVezes, btnDivide;

    public MenuPrincipalController() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial java/lang/Object."<init>":()V
         * 4: return
         *  */
        // </editor-fold>
    }

    @FXML
    private void soma(ActionEvent event) {
        Double numero1 = Double.parseDouble(txtNumero1.getText());
        Double numero2 = Double.parseDouble(txtNumero2.getText());
        Double resultado = numero1 + numero2;
        
        txtResultado.setText(resultado.toString());
    }

    @FXML
    private void menos(ActionEvent event) {
        Double numero1 = Double.parseDouble(txtNumero1.getText());
        Double numero2 = Double.parseDouble(txtNumero2.getText());
        Double resultado = numero1 - numero2;
        
        txtResultado.setText(resultado.toString());
    }

    @FXML
    private void vezes(ActionEvent event) {
        Double numero1 = Double.parseDouble(txtNumero1.getText());
        Double numero2 = Double.parseDouble(txtNumero2.getText());
        Double resultado = numero1 * numero2;
        
        txtResultado.setText(resultado.toString());
    }

    @FXML
    private void divide(ActionEvent event) {
        Double numero1 = Double.parseDouble(txtNumero1.getText());
        Double numero2 = Double.parseDouble(txtNumero2.getText());
        Double resultado = numero1 / numero2;
        
        txtResultado.setText(resultado.toString());
    }

    public void initialize(URL url, ResourceBundle rb) {
        
    }
}

    

