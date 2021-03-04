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
public class Tabla_Likes {
    int Id;
    int IdPublicacion;
    int IdUsuarioLike;

    public Tabla_Likes() {
    }

    public Tabla_Likes(int Id, int IdPublicacion, int IdUsuarioLike) {
        this.Id = Id;
        this.IdPublicacion = IdPublicacion;
        this.IdUsuarioLike = IdUsuarioLike;
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

    public int getIdUsuarioLike() {
        return IdUsuarioLike;
    }

    public void setIdUsuarioLike(int IdUsuarioLike) {
        this.IdUsuarioLike = IdUsuarioLike;
    }
    
    
}
