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
public class Tabla_Comentario {
    int Id;
    int IdPublicacion;
    int IdUsuarioComenta;
    String Descripcion;

    public Tabla_Comentario() {
    }

    public Tabla_Comentario(int Id, int IdPublicacion, int IdUsuarioComenta, String Descripcion) {
        this.Id = Id;
        this.IdPublicacion = IdPublicacion;
        this.IdUsuarioComenta = IdUsuarioComenta;
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

    public int getIdUsuarioComenta() {
        return IdUsuarioComenta;
    }

    public void setIdUsuarioComenta(int IdUsuarioComenta) {
        this.IdUsuarioComenta = IdUsuarioComenta;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
}
