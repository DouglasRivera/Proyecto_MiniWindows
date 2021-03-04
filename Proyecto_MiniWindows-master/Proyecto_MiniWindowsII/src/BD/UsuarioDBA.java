/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;
import Pojo.Usuario;
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
public class UsuarioDBA {
    public int crear(Usuario User){
        try
            {
                Connection con = null;
                Dba dba = new Dba();
                con = dba.getConnection();
                Statement st = con.createStatement();
                String sql = "insert into Usuario (Nombre, Contraseña, Rol_Usuario) values (?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, User.getNombre());
                pst.setString(2, User.getContraseña());
                pst.setInt(3, User.getRol_Usuario());
                int filas = pst.executeUpdate();
                return filas;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                return 0;
            }
    }
    
    public int actualizar(Usuario User){
        try
            {
                Connection con = null;
                Dba dba = new Dba();
                con = dba.getConnection();
                Statement st = con.createStatement();
                String sql = "update Usuario set Nombre = ?,Contraseña = ?,Rol_Usuario = ? where Id = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, User.getNombre());
                pst.setString(2, User.getContraseña());
                pst.setInt(3, User.getRol_Usuario());
                pst.setInt(4, User.getId());
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
                String sql = "delete from Usuario where Id = ?";
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
    
    public ArrayList<Usuario> obtenerTodos(){
        try
            {
                ArrayList<Usuario> user = new ArrayList<>();
                Connection con = null;
                Dba dba = new Dba();
                dba.conectar();
                con = dba.getConnection();
                String sql = "select * from Usuario";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    user.add(new Usuario(rs.getInt(0), rs.getString(1), rs.getString(2), rs.getInt(3)));
                }
                dba.desconectar();
                return user;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                return new ArrayList<>();
            }
    }
    
    public Usuario obtenerPorId(int id){
        try
            {
                Usuario user = null;
                Connection con = null;
                Dba dba = new Dba();
                dba.conectar();
                con = dba.getConnection();
                 String sql = "select * from Cliente where Id = ?";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setInt(1, id);
                ResultSet rs = pst.executeQuery(sql);
                while(rs.next()){
                    user = new Usuario(rs.getInt(0), rs.getString(1), rs.getString(2), rs.getInt(3));
                }
                dba.desconectar();
                return user;
            } catch (SQLException | HeadlessException e)
            {
                e.printStackTrace();
                return null;
            }
    }
}
