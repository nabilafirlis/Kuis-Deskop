/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis.db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kuis.model.Setrika;
/**
 *
 * @author didik
 */
public class DBHandler {
    public final Connection conn;

    public DBHandler(String driver) {
        this.conn = DBHelper.getConnection(driver);
    }
    public void addSetrika(Setrika strk){
        String insertStrk = "INSERT INTO `setrika`(`kode_barang`, `merk`,`warna`,`harga`,`tanggal_produksi`)"
                + "VALUES (?,?,?,?,?)";
        try {
            PreparedStatement stmtInsert = conn.prepareStatement(insertStrk);
            stmtInsert.setString(1, strk.getKode());
            stmtInsert.setString(2, strk.getMerk());
            stmtInsert.setString(3, strk.getWarna());
            stmtInsert.setString(4, strk.getHarga());
            stmtInsert.setString(5, strk.getTanggalProduksi());
            stmtInsert.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DBHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
