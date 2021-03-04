/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Pojo.Tabla_Imagenes;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author river
 */
public class Tabla_ImagenesDBA {
    public int crear(Tabla_Imagenes TI){
        try
            {
                Connection con = null;
                Dba dba = new Dba();
                con = dba.getConnection();
                Statement st = con.createStatement();
                String sql = "insert into Tabla_Imagenes (IdAlbum, Ruta_Archivo) values (?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, TI.getIdAlbum());
                pst.setString(2, TI.getRuta_Archivo());
                int filas = pst.executeUpdate();
                return filas;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                return 0;
            }
    }
    
    public int actualizar(Tabla_Imagenes TI){
        try
            {
                Connection con = null;
                Dba dba = new Dba();
                con = dba.getConnection();
                Statement st = con.createStatement();
                String sql = "update Tabla_Imagenes set IdAlbum = ?,Ruta_Archivo = ? where Id = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, TI.getIdAlbum());
                pst.setString(2, TI.getRuta_Archivo());
                pst.setInt(3, TI.getId());
                int filas = pst.executeUpdate();
                return filas;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                return 0;
            }
    }
    
    public int eliminar(int id){
        try
            {
                Connection con = null;
                Dba dba = new Dba();
                con = dba.getConnection();
                Statement st = con.createStatement();
                String sql = "delete from  where Id = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, id);
                int filas = pst.executeUpdate();
                return filas;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                return 0;
            }
    }
    
    public ArrayList<Tabla_Imagenes> obtenerTodos(){
        try
            {
                ArrayList<Tabla_Imagenes> TI = new ArrayList<>();
                Connection con = null;
                Dba dba = new Dba();
                dba.conectar();
                con = dba.getConnection();
                String sql = "select * from Tabla_Imagenes";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    TI.add(new Tabla_Imagenes(rs.getInt(0), rs.getInt(1), rs.getString(2)));
                }
                dba.desconectar();
                return TI;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                return new ArrayList<>();
            }
    }
    
    public Tabla_Imagenes obtenerPorId(int id){
        try
            {
                Tabla_Imagenes TI = null;
                Connection con = null;
                Dba dba = new Dba();
                dba.conectar();
                con = dba.getConnection();
                 String sql = "select * from Tabla_Imagenes where Id = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, id);
                ResultSet rs = pst.executeQuery(sql);
                while(rs.next()){
                    TI = new Tabla_Imagenes(rs.getInt(0), rs.getInt(1), rs.getString(2));
                }
                dba.desconectar();
                return TI;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                return null;
            }
    }
}
