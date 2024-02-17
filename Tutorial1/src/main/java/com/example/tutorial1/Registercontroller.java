package com.example.tutorial1;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Registercontroller {
    @FXML
    private TextField firstname;

    @FXML
    private TextField lastname;

    @FXML
    private TextField username;

    @FXML
    private TextField email;



    @FXML
    private TextField phonenumberfield;


    @FXML
    private Label phonenumberlable;



    int phonenumber;
    public void s(ActionEvent event){

        try{
            phonenumber = Integer.parseInt(phonenumberfield.getText());

        }
        catch (NumberFormatException e){
            phonenumberlable.setText("Enter only Numbers");
        }
        catch (Exception e){
            phonenumberlable.setText("error");
        }

    }



}
