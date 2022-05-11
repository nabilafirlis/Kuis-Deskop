
package kuis;

import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;



public class FXMLDocumentController implements Initializable {
    
   @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    
    @FXML
    private TextField harga;

    @FXML
    private ComboBox<String> jenis;

    @FXML
    private TextField merek;

    @FXML
    private Button simpan;

    @FXML
    private DatePicker tanggal;

    @FXML
    private TextField warna;
  
   
    @FXML
    private void handleButtonAction(ActionEvent event) throws SQLException {
       
       
        System.out.println(merek.getText());
        System.out.println(harga.getText());
        System.out.println(warna.getText());
        System.out.println(tanggal.getValue().toString());
        System.out.println(jenis.getValue().toString());
        
       Setrika strk = new Setrika (merek.getText(),harga.getText(),
                jenis.getValue().toString(), warna.getText(), tanggal.getValue().toString());
        SetrikaDataModel sdh = new SetrikaDataModel("MYSQL");
        sdh.addSetrika(strk);
    }

       
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       ArrayList <String> list = new ArrayList<String>();
        list.add("Listrik");
        list.add("Uap");
        list.add("Gas ");
        ObservableList items = FXCollections.observableArrayList(list);
        jenis.setItems(items);
        
        
        
    }    
}
