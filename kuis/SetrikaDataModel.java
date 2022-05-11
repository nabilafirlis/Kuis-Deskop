/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SetrikaDataModel {

    private static Connection getConnection(String driver) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 

    public final java.sql.Connection conn;

    public SetrikaDataModel(String driver) {
        this.conn = SetrikaDataModel.getConnection(driver);
    }

    public void addSetrika(Setrika strk){
        String insertSetrika = "INSERT INTO `setrika`( `merek`,`harga`,`jenis`,`warna`,`tanggal_masuk`)"
                + "VALUES (?,?,?,?,?)";
        try {
            java.sql.PreparedStatement stmtInsert = conn.prepareStatement(insertSetrika);
            stmtInsert.setString(1, strk.getMerek());
            stmtInsert.setString(2, strk.getHarga());
            stmtInsert.setString(3, strk.getJenis());
            stmtInsert.setString(4, strk.getWarna());
            stmtInsert.setString(5, strk.getTanggal_masuk());
            stmtInsert.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SetrikaDataModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}