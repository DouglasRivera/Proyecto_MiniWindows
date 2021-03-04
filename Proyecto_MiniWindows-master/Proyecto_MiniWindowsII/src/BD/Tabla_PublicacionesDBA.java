/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Pojo.Tabla_Publicaciones;
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
public class Tabla_PublicacionesDBA {
    public int crear(Tabla_Publicaciones TP){
        try
            {
                Connection con = null;
                Dba dba = new Dba();
                con = dba.getConnection();
                Statement st = con.createStatement();
                String sql = "insert into Tabla_Publicaciones (IdUsuario, Descripcion, FechaCreaccion) values (?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, TP.getIdUsuario());
                pst.setString(2, TP.getDescripcion());
                pst.setDate(3, TP.getFecha());
                int filas = pst.executeUpdate();
                return filas;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                return 0;
            }
    }
    
    public int actualizar(Tabla_Publicaciones TP){
        try
            {
                Connection con = null;
                Dba dba = new Dba();
                con = dba.getConnection();
                Statement st = con.createStatement();
                String sql = "update Tabla_Publicaciones set IdUsuario = ?,Descripcion = ?,FechaCreacion = ? where Id = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, TP.getIdUsuario());
                pst.setString(2, TP.getDescripcion());
                pst.setDate(3, TP.getFecha());
                pst.setInt(4, TP.getId());
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
    
    public ArrayList<Tabla_Publicaciones> obtenerTodos(){
        try
            {
                ArrayList<Tabla_Publicaciones> TP = new ArrayList<>();
                Connection con = null;
                Dba dba = new Dba();
                dba.conectar();
                con = dba.getConnection();
                String sql = "select * from Tabla_Publicaciones";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    TP.add(new Tabla_Publicaciones(rs.getInt(0), rs.getInt(1), rs.getString(2),rs.getDate(3)));
                }
                dba.desconectar();
                return TP;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                return new ArrayList<>();
            }
    }
    
    public Tabla_Publicaciones obtenerPorId(int id){
        try
            {
                Tabla_Publicaciones TP = null;
                Connection con = null;
                Dba dba = new Dba();
                dba.conectar();
                con = dba.getConnection();
                 String sql = "select * from Tabla_Publicaciones where Id = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, id);
                ResultSet rs = pst.executeQuery(sql);
                while(rs.next()){
                    TP = new Tabla_Publicaciones(rs.getInt(0), rs.getInt(1), rs.getString(2),rs.getDate(3));
                }
                dba.desconectar();
                return TP;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                return null;
            }
    }
}
