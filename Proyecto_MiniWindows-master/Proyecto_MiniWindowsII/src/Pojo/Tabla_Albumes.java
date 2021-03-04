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
public class Tabla_Albumes {
    int Id;
    int IdUsuario;
    String Nombre_Album;

    public Tabla_Albumes() {
    }

    public Tabla_Albumes(int Id, int IdUsuario, String Nombre_Album) {
        this.Id = Id;
        this.IdUsuario = IdUsuario;
        this.Nombre_Album = Nombre_Album;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getNombre_Album() {
        return Nombre_Album;
    }

    public void setNombre_Album(String Nombre_Album) {
        this.Nombre_Album = Nombre_Album;
    }
    
}
