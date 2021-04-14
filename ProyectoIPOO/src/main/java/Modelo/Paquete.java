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
public class Paquete extends Entregable {
    
    private PresentacionPaquete presentacion;
    private boolean electronico;
    private boolean fragil;

    public PresentacionPaquete getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(PresentacionPaquete presentacion) {
        this.presentacion = presentacion;
    }

    public boolean isElectronico() {
        return electronico;
    }

    public void setElectronico(boolean electronico) {
        this.electronico = electronico;
    }

    public boolean isFragil() {
        return fragil;
    }

    public void setFragil(boolean fragil) {
        this.fragil = fragil;
    }

    @Override
    public String toString() {
        return "Paquete{" + "presentacion=" + presentacion + ", electronico=" + electronico + ", fragil=" + fragil + '}';
    }
    
}