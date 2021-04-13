/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Casillero;
import Modelo.Counter;

/**
 *
 * @author kendall c
 */
public class AdmCounter {
    
    //private int id = 1000;
    private Counter counter;
    
    public boolean crearCounter(String nombre, String cedula, int cantidadCasilleros, int paquetesNivel) {
        boolean bandera = false;
        if(cantidadCasilleros > 0) {
            counter = new Counter(nombre, cedula, cantidadCasilleros, paquetesNivel);
            bandera = true;
        }
        return bandera;
    }
    
    public boolean ocuparCasilleros() {
        boolean respuesta = true;
        for (int i = 0; i < counter.getCantidadCasilleros(); i++) {
            Casillero casillero = new Casillero(1000+i, true);
            counter.getCasilleros().add(casillero);
        }
        return respuesta;
    }
    
    public void mostrarCasilleros() {
        for (Casillero casillero : counter.getCasilleros()) {
            System.out.println("id: " + casillero.getNumero() + ", estado: " + casillero.isLibre());
        }
    }

    public Counter getCounter() {
        return counter;
    }

    public void setCounter(Counter counter) {
        this.counter = counter;
    }
    
}
