/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_miniwindowsii;

/**
 *
 * @author famii
 */
public class Usuario {
    String Nombre;
    String Contraseña;
    int Rol_Usuario;

    public Usuario() {
    }

    public Usuario(String Nombre, String Contraseña, int Rol_Usuario) {
        this.Nombre = Nombre;
        this.Contraseña = Contraseña;
        this.Rol_Usuario = Rol_Usuario;
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
