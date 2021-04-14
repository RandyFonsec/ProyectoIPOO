/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Randy
 */
public class Entregable {
    
    private int numeroReferencia;
    private boolean entregado;
    private String descripcion;
    private String remitente;
    private Cliente destinatario;
    private double pesoKilogramos;
    private TipoEntregable tipo;
    private Calendar fechaRetiro;

    public int getNumeroReferencia() {
        return numeroReferencia;
    }

    public void setNumeroReferencia(int numeroReferencia) {
        this.numeroReferencia = numeroReferencia;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public Cliente getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Cliente destinatario) {
        this.destinatario = destinatario;
    }

    public double getPesoKilogramos() {
        return pesoKilogramos;
    }

    public void setPesoKilogramos(double pesoKilogramos) {
        this.pesoKilogramos = pesoKilogramos;
    }

    public TipoEntregable getTipo() {
        return tipo;
    }

    public void setTipo(TipoEntregable tipo) {
        this.tipo = tipo;
    }

    public Calendar getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(Calendar fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    @Override
    public String toString() {
        return "Entregable{" + "numeroReferencia=" + numeroReferencia + ", entregado=" + entregado + ", descripcion=" + descripcion + ", remitente=" + remitente + ", destinatario=" + destinatario + ", pesoKilogramos=" + pesoKilogramos + ", tipo=" + tipo + ", fechaRetiro=" + fechaRetiro + '}';
    }
    
}