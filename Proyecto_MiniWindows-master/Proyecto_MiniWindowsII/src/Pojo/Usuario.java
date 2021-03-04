package Pojo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author famii
 */
public class Usuario {
    int Id;
    String Nombre;
    String Contraseña;
    int Rol_Usuario;

    public Usuario() {
    }

    public Usuario(int Id, String Nombre, String Contraseña, int Rol_Usuario) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Contraseña = Contraseña;
        this.Rol_Usuario = Rol_Usuario;
        
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public int getRol_Usuario() {
        return Rol_Usuario;
    }

    public void setRol_Usuario(int Rol_Usuario) {
        this.Rol_Usuario = Rol_Usuario;
    }
    
}
