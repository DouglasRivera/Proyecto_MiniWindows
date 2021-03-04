/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pojo;

import java.sql.Date;

/**
 *
 * @author river
 */
public class Tabla_Publicaciones {
    int Id;
    int IdUsuario;
    String Descripcion;
    Date Fecha;

    public Tabla_Publicaciones() {
    }

    public Tabla_Publicaciones(int Id, int IdUsuario, String Descripcion, Date Fecha) {
        this.Id = Id;
        this.IdUsuario = IdUsuario;
        this.Descripcion = Descripcion;
        this.Fecha = Fecha;
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

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }
    
}
