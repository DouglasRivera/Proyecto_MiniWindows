/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Pojo.Tabla_Amigos;
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
public class Tabla_AmigosDBA {
    public int crear(Tabla_Amigos ta){
        try
            {
                Connection con = null;
                Dba dba = new Dba();
                con = dba.getConnection();
                Statement st = con.createStatement();
                String sql = "insert into Tabla_Amigos (IdUsuario, IdAmigos, SolicitudesAceptadas) values (?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, ta.getIdUsuario());
                pst.setInt(2, ta.getIdAmigos());
                pst.setBoolean(3, ta.isSolicitudesAceptadas());
                int filas = pst.executeUpdate();
                return filas;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                return 0;
            }
    }
    
    public int actualizar(Tabla_Amigos ta){
        try
            {
                Connection con = null;
                Dba dba = new Dba();
                con = dba.getConnection();
                Statement st = con.createStatement();
                String sql = "update Tabla_Amigos set IdUsuario = ?,IdAmigos = ?,SolicitudesAceptadas = ? where Id = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, ta.getIdUsuario());
                pst.setInt(2, ta.getIdAmigos());
                pst.setBoolean(3, ta.isSolicitudesAceptadas());
                pst.setInt(4, ta.getId());
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
    
    public ArrayList<Tabla_Amigos> obtenerTodos(){
        try
            {
                ArrayList<Tabla_Amigos> ta = new ArrayList<>();
                Connection con = null;
                Dba dba = new Dba();
                dba.conectar();
                con = dba.getConnection();
                String sql = "select * from Tabla_Amigos";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    ta.add(new Tabla_Amigos(rs.getInt(0), rs.getInt(1), rs.getInt(2),rs.getBoolean(3)));
                }
                dba.desconectar();
                return ta;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                return new ArrayList<>();
            }
    }
    
    public Tabla_Amigos obtenerPorId(int id){
        try
            {
                Tabla_Amigos ta = null;
                Connection con = null;
                Dba dba = new Dba();
                dba.conectar();
                con = dba.getConnection();
                 String sql = "select * from Tabla_Amigos where Id = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, id);
                ResultSet rs = pst.executeQuery(sql);
                while(rs.next()){
                    ta = new Tabla_Amigos(rs.getInt(0), rs.getInt(1), rs.getInt(2),rs.getBoolean(3));
                }
                dba.desconectar();
                return ta;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                return null;
            }
    }
}
