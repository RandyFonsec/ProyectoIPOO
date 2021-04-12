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
public class Revista extends Entregable {
    
    private String nombre;
    private boolean catalogo;
    private TemaRevista tema;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCatalogo() {
        return catalogo;
    }

    public void setCatalogo(boolean catalogo) {
        this.catalogo = catalogo;
    }

    public TemaRevista getTema() {
        return tema;
    }

    public void setTema(TemaRevista tema) {
        this.tema = tema;
    }

    @Override
    public String toString() {
        return "Revista{" + "nombre=" + nombre + ", catalogo=" + catalogo + ", tema=" + tema + '}';
    }
    
}
