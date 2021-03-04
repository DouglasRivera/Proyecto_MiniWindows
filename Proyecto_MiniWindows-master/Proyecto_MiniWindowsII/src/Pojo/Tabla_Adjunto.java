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
public class Tabla_Adjunto {
    int Id;
    int IdPublicacion;
    String Ruta_Archivo;

    public Tabla_Adjunto() {
    }

    public Tabla_Adjunto(int Id, int IdPublicacion, String Ruta_Archivo) {
        this.Id = Id;
        this.IdPublicacion = IdPublicacion;
        this.Ruta_Archivo = Ruta_Archivo;
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

    public String getRuta_Archivo() {
        return Ruta_Archivo;
    }

    public void setRuta_Archivo(String Ruta_Archivo) {
        this.Ruta_Archivo = Ruta_Archivo;
    }
    
}
