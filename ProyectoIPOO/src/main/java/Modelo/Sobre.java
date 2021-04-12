/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Randy
 */
public class Sobre extends Entregable {
    
     private TipoSobre tipoSobre;
     private String contenido;

    public TipoSobre getTipoSobre() {
        return tipoSobre;
    }

    public void setTipoSobre(TipoSobre tipoSobre) {
        this.tipoSobre = tipoSobre;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Sobre{" + "tipoSobre=" + tipoSobre + ", contenido=" + contenido + '}';
    }

}
