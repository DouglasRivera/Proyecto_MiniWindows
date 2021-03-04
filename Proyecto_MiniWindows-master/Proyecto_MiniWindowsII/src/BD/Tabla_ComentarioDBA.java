/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import Pojo.Tabla_Comentario;
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
public class Tabla_ComentarioDBA {
    public int crear(Tabla_Comentario tc){
        try
            {
                Connection con = null;
                Dba dba = new Dba();
                con = dba.getConnection();
                Statement st = con.createStatement();
                String sql = "insert into Tabla_Comentario (IdPublicacion, IdUsuarioComenta, Descripcion) values (?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, tc.getIdPublicacion());
                pst.setInt(2, tc.getIdUsuarioComenta());
                pst.setString(3, tc.getDescripcion());
                int filas = pst.executeUpdate();
                return filas;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                return 0;
            }
    }
    
    public int actualizar(Tabla_Comentario tc){
        try
            {
                Connection con = null;
                Dba dba = new Dba();
                con = dba.getConnection();
                Statement st = con.createStatement();
                String sql = "update Tabla_Comentario set IdPublicacion = ?,IdUsuarioComenta = ?,Descripcion = ? where Id = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, tc.getIdPublicacion());
                pst.setInt(2, tc.getIdUsuarioComenta());
                pst.setString(3, tc.getDescripcion());
                pst.setInt(4, tc.getId());
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
    
    public ArrayList<Tabla_Comentario> obtenerTodos(){
        try
            {
                ArrayList<Tabla_Comentario> tc = new ArrayList<>();
                Connection con = null;
                Dba dba = new Dba();
                dba.conectar();
                con = dba.getConnection();
                String sql = "select * from Tabla_Comentario";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    tc.add(new Tabla_Comentario(rs.getInt(0), rs.getInt(1), rs.getInt(2), rs.getString(3)));
                }
                dba.desconectar();
                return tc;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                return new ArrayList<>();
            }
    }
    
    public Tabla_Comentario obtenerPorId(int id){
        try
            {
                Tabla_Comentario tc = null;
                Connection con = null;
                Dba dba = new Dba();
                dba.conectar();
                con = dba.getConnection();
                 String sql = "select * from Tabla_Comentario where Id = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, id);
                ResultSet rs = pst.executeQuery(sql);
                while(rs.next()){
                    tc = new Tabla_Comentario(rs.getInt(0), rs.getInt(1), rs.getInt(2), rs.getString(3));
                }
                dba.desconectar();
                return tc;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                return null;
            }
    } 
}
