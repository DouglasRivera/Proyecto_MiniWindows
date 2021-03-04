/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Pojo.Tabla_Albumes;
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
public class Tabla_AlbumesDBA {
     public int crear(Tabla_Albumes TAL){
        try
            {
                Connection con = null;
                Dba dba = new Dba();
                con = dba.getConnection();
                Statement st = con.createStatement();
                String sql = "insert into Tabla_Albumes (IdUsuario, Nombre_Album) values (?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, TAL.getIdUsuario());
                pst.setString(2, TAL.getNombre_Album());
                int filas = pst.executeUpdate();
                return filas;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                return 0;
            }
    }
    
    public int actualizar(Tabla_Albumes TAL){
        try
            {
                Connection con = null;
                Dba dba = new Dba();
                con = dba.getConnection();
                Statement st = con.createStatement();
                String sql = "update Tabla_Albumes set IdUsuario = ?,Nombre_Album = ? where Id = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, TAL.getIdUsuario());
                pst.setString(2, TAL.getNombre_Album());
                pst.setInt(3, TAL.getId());
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
    
    public ArrayList<Tabla_Albumes> obtenerTodos(){
        try
            {
                ArrayList<Tabla_Albumes> TAL = new ArrayList<>();
                Connection con = null;
                Dba dba = new Dba();
                dba.conectar();
                con = dba.getConnection();
                String sql = "select * from Tabla_Albumes";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    TAL.add(new Tabla_Albumes(rs.getInt(0), rs.getInt(1), rs.getString(2)));
                }
                dba.desconectar();
                return TAL;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                return new ArrayList<>();
            }
    }
    
    public Tabla_Albumes obtenerPorId(int id){
        try
            {
                Tabla_Albumes TAL = null;
                Connection con = null;
                Dba dba = new Dba();
                dba.conectar();
                con = dba.getConnection();
                 String sql = "select * from Tabla_Albumes where Id = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, id);
                ResultSet rs = pst.executeQuery(sql);
                while(rs.next()){
                    TAL = new Tabla_Albumes(rs.getInt(0), rs.getInt(1), rs.getString(2));
                }
                dba.desconectar();
                return TAL;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                return null;
            }
    } 
}
