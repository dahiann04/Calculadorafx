package utez.calculadora;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label resultado;

    @FXML
    private Button calcular;

    @FXML
    private Button sumar;

    @FXML
    private Button restar;

    @FXML
    private Button dividir;

    @FXML
    private Button multiplicar;

    @FXML
    private TextField numero1;

    @FXML
    private TextField numero2;

    @FXML
    protected void operacion1(ActionEvent event) throws IOException {
        String num1 = numero1.getText();
        String num2 = numero2.getText();
        Integer numInt = Integer.parseInt(num1);
        Integer numInt2 = Integer.parseInt(num2);
        Integer resultadoNumero = numInt + numInt2;
        String resultadoString = resultadoNumero.toString();
        resultado.setText(resultadoString);



    }
    @FXML
    protected void operacion2(ActionEvent event) throws IOException {
        String num1 = numero1.getText();
        String num2 = numero2.getText();
        Integer numInt = Integer.parseInt(num1);
        Integer numInt2 = Integer.parseInt(num2);
        Integer resultadoNumero = numInt - numInt2;
        String resultadoString = resultadoNumero.toString();
        resultado.setText(resultadoString);



    }
    @FXML
    protected void operacion3(ActionEvent event) throws IOException {
        String num1 = numero1.getText();
        String num2 = numero2.getText();
            Integer numInt = Integer.parseInt(num1);
            Integer numInt2 = Integer.parseInt(num2);
            Integer resultadoNumero = numInt * numInt2;
            String resultadoString = resultadoNumero.toString();
            resultado.setText(resultadoString);
        }
    @FXML
    protected void operacion4(ActionEvent event) throws IOException {
        String num1 = numero1.getText();
        String num2 = numero2.getText();
        if(numero2.getText().equals("0")){
            resultado.setText("ERROR");
        }else{
            Integer numInt = Integer.parseInt(num1);
            Integer numInt2 = Integer.parseInt(num2);
            Integer resultadoNumero = numInt / numInt2;
            String resultadoString = resultadoNumero.toString();
            resultado.setText(resultadoString);
        }
    }
}

//Se agrego algo alsldsal