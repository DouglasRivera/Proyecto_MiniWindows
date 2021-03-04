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
public class Tabla_Compartir {
    int Id;
    int IdPublicacion;
    int IdUsuarioComparte;
    String Descripcion;

    public Tabla_Compartir() {
    }

    public Tabla_Compartir(int Id, int IdPublicacion, int IdUsuarioComparte, String Descripcion) {
        this.Id = Id;
        this.IdPublicacion = IdPublicacion;
        this.IdUsuarioComparte = IdUsuarioComparte;
        this.Descripcion = Descripcion;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getIdPublicacion() {
        return IdPublicacion;
    }

    public void setIdPublicacion(int IdPublicacion) {
        this.IdPublicacion = IdPublicacion;
    }

    public int getIdUsuarioComparte() {
        return IdUsuarioComparte;
    }

    public void setIdUsuarioComparte(int IdUsuarioComparte) {
        this.IdUsuarioComparte = IdUsuarioComparte;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
}
