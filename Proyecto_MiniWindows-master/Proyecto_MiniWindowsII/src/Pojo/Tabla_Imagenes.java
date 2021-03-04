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
public class Tabla_Imagenes {
    int Id;
    int IdAlbum;
    String Ruta_Archivo;

    public Tabla_Imagenes() {
    }

    public Tabla_Imagenes(int Id, int IdAlbum, String Ruta_Archivo) {
        this.Id = Id;
        this.IdAlbum = IdAlbum;
        this.Ruta_Archivo = Ruta_Archivo;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getIdAlbum() {
        return IdAlbum;
    }

    public void setIdAlbum(int IdAlbum) {
        this.IdAlbum = IdAlbum;
    }

    public String getRuta_Archivo() {
        return Ruta_Archivo;
    }

    public void setRuta_Archivo(String Ruta_Archivo) {
        this.Ruta_Archivo = Ruta_Archivo;
    }
    
}
