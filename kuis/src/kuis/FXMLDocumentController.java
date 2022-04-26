/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import kuis.db.DBHandler;
import kuis.model.Setrika;



public class FXMLDocumentController implements Initializable {
    
  @FXML
    private Button btnSave;

    @FXML
    private ComboBox<?> cbWarna;

    @FXML
    private DatePicker datePick;

    @FXML
    private TextField tfHarga;

    @FXML
    private TextField tfKode;

    @FXML
    private TextField tfMerk;
  @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        System.out.println(tfKode.getText());
        System.out.println(tfMerk.getText());
        System.out.println(tfHarga.getText());
        System.out.println(datePick.getValue().toString());
        System.out.println(cbWarna.getValue().toString());
        Setrika strk = new Setrika(tfKode.getText(),tfMerk.getText(),tfHarga.getText(),datePick.getValue().toString(),cbWarna.getValue().toString());
        DBHandler dh = new DBHandler("MYSQL");
        dh.addSetrika(strk);
       
         }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       ArrayList <String> list = new ArrayList<String>();
        list.add("Biru");
        list.add("Merah");
        list.add("Kuning ");
        list.add("Ungu");
        ObservableList items = FXCollections.observableArrayList(list);
        cbWarna.setItems(items);
        
    }    
    
}