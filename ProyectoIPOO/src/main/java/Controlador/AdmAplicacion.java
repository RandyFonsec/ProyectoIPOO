/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.*;

/**
 *
 * @author Randy
 */
public class AdmAplicacion {
    private CreacionCliente crearCliente;
    private AdmCounter admCounter;

    public AdmAplicacion() {
        this.admCounter = new AdmCounter();
        //this.crearCliente = new CreacionCliente(null, false, this);
        //this.crearCliente.setVisible(true);
    }

    public CreacionCliente getCrearCliente() {
        return crearCliente;
    }

    public void setCrearCliente(CreacionCliente crearCliente) {
        this.crearCliente = crearCliente;
    }

    

    public AdmCounter getAdmCounter() {
        return admCounter;
    }

    public void setAdmCounter(AdmCounter admCounter) {
        this.admCounter = admCounter;
    }
    
}
