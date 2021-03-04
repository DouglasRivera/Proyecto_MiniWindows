/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Pojo.Rol;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author jafigueroa
 */
public class RolDBA {
    public int crear(Rol rol){
        try
            {
                Connection con = null;
                Dba dba = new Dba();
                con = dba.getConnection();
                Statement st = con.createStatement();
                String sql = "insert into Rol (Nombre_Rol) values (?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, rol.getNombre_Rol());
                int filas = pst.executeUpdate();
                return filas;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                return 0;
            }
    }
    
    public int actualizar(Rol rol){
        try
            {
                Connection con = null;
                Dba dba = new Dba();
                con = dba.getConnection();
                Statement st = con.createStatement();
                String sql = "update Rol set Nombre_Rol = ? where Id = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, rol.getNombre_Rol());
                pst.setInt(2, rol.getId());
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
                String sql = "delete from Rol where Id = ?";
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
    
    public ArrayList<Rol> obtenerTodos(){
        try
            {
                ArrayList<Rol> rol = new ArrayList<>();
                Connection con = null;
                Dba dba = new Dba();
                dba.conectar();
                con = dba.getConnection();
                String sql = "select * from Rol";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    rol.add(new Rol(rs.getInt(0), rs.getString(1)));
                }
                dba.desconectar();
                return rol;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                return new ArrayList<>();
            }
    }
    
    public Rol obtenerPorId(int id){
        try
            {
                Rol rol = null;
                Connection con = null;
                Dba dba = new Dba();
                dba.conectar();
                con = dba.getConnection();
                 String sql = "select * from Rol where Id = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, id);
                ResultSet rs = pst.executeQuery(sql);
                while(rs.next()){
                    rol = new Rol(rs.getInt(0), rs.getString(1));
                }
                dba.desconectar();
                return rol;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                return null;
            }
    }
}
