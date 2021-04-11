/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Randy
 */
public class Casillero {
    private int numero;
    private boolean libre;
    private ArrayList<Entregable> articulos = new ArrayList();

    public Casillero(int numero, boolean libre) {
        this.numero = numero;
        this.libre = libre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public ArrayList<Entregable> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Entregable> articulos) {
        this.articulos = articulos;
    }
    
    
}
