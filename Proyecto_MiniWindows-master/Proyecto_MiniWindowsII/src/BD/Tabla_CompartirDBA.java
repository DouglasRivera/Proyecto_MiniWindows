/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Pojo.Tabla_Compartir;
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
public class Tabla_CompartirDBA {
   public int crear(Tabla_Compartir TC){
        try
            {
                Connection con = null;
                Dba dba = new Dba();
                con = dba.getConnection();
                Statement st = con.createStatement();
                String sql = "insert into Tabla_Compartir (IdPublicacion, IdUsuarioComparte, Descripcion) values (?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, TC.getIdPublicacion());
                pst.setInt(2, TC.getIdUsuarioComparte());
                pst.setString(3, TC.getDescripcion());
                int filas = pst.executeUpdate();
                return filas;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                return 0;
            }
    }
    
    public int actualizar(Tabla_Compartir TC){
        try
            {
                Connection con = null;
                Dba dba = new Dba();
                con = dba.getConnection();
                Statement st = con.createStatement();
                String sql = "update Tabla_Compartir set IdPublicacion = ?,IdUsuarioComparte = ?,Descripcion = ? where Id = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, TC.getIdPublicacion());
                pst.setInt(2, TC.getIdUsuarioComparte());
                pst.setString(3, TC.getDescripcion());
                pst.setInt(4, TC.getId());
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
    
    public ArrayList<Tabla_Compartir> obtenerTodos(){
        try
            {
                ArrayList<Tabla_Compartir> TC = new ArrayList<>();
                Connection con = null;
                Dba dba = new Dba();
                dba.conectar();
                con = dba.getConnection();
                String sql = "select * from Tabla_Compartir";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    TC.add(new Tabla_Compartir(rs.getInt(0), rs.getInt(1), rs.getInt(2), rs.getString(3)));
                }
                dba.desconectar();
                return TC;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                return new ArrayList<>();
            }
    }
    
    public Tabla_Compartir obtenerPorId(int id){
        try
            {
                Tabla_Compartir TC = null;
                Connection con = null;
                Dba dba = new Dba();
                dba.conectar();
                con = dba.getConnection();
                 String sql = "select * from Tabla_Compartir where Id = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, id);
                ResultSet rs = pst.executeQuery(sql);
                while(rs.next()){
                    TC = new Tabla_Compartir(rs.getInt(0), rs.getInt(1), rs.getInt(2), rs.getString(3));
                }
                dba.desconectar();
                return TC;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                return null;
            }
    } 
}
