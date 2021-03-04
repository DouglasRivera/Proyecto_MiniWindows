/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojo;

/**
 *
 * @author river
 */
public class Rol {
    int Id;
    String Nombre_Rol;

    public Rol() {
    }

    public Rol(int Id, String Nombre_Rol) {
        this.Id = Id;
        this.Nombre_Rol = Nombre_Rol;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre_Rol() {
        return Nombre_Rol;
    }

    public void setNombre_Rol(String Nombre_Rol) {
        this.Nombre_Rol = Nombre_Rol;
    }
    
}
