
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javax.swing.JOptionPane;

/**
 *
 * @author jafigueroa
 */
public class Dba {

    Connection ccn = null;
    Statement st = null;

    public Dba() {
        // conectar();
    }

    public Connection getConnection() {
        return ccn;
    }

    public boolean conectar() {
        try {
            String rutafile = new File(".").getCanonicalPath() + "\\src\\BD\\" + "Cines.accdb";
            String Url = "jdbc:ucanaccess://" + rutafile;
            ccn = DriverManager.getConnection(Url);
            st = ccn.createStatement();
            System.out.println("Conexión correcta");
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "CONEXION ERRONEA " + e);
        } catch (IOException ex) {
            Logger.getLogger(Dba.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return false;
    }

    public boolean desconectar() {
        try {
            ccn.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Dba.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
