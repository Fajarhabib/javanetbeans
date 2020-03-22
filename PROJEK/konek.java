/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.*;
import com.mysql.jdbc.Driver;
/**
 *
 * @author ASUS
 */
public class konek {
    static Connection Koneksi;
    public static Connection getConnection(){
        try {
            Koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/data_mhs","root","");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi Database Gagal");
        }
        return Koneksi;
    }
}
