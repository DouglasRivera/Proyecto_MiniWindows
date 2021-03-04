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
public class Tabla_Amigos {
   int Id;
   int IdUsuario;
   int IdAmigos;
   boolean SolicitudesAceptadas;

    public Tabla_Amigos() {
    }

    public Tabla_Amigos(int Id, int IdUsuario, int IdAmigos, boolean SolicitudesAceptadas) {
        this.Id = Id;
        this.IdUsuario = IdUsuario;
        this.IdAmigos = IdAmigos;
        this.SolicitudesAceptadas = SolicitudesAceptadas;
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

    public int getIdAmigos() {
        return IdAmigos;
    }

    public void setIdAmigos(int IdAmigos) {
        this.IdAmigos = IdAmigos;
    }

    public boolean isSolicitudesAceptadas() {
        return SolicitudesAceptadas;
    }

    public void setSolicitudesAceptadas(boolean SolicitudesAceptadas) {
        this.SolicitudesAceptadas = SolicitudesAceptadas;
    }
   
}
