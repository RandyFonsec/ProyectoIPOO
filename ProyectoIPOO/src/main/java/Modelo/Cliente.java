/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Calendar;

/**
 *
 * @author Randy
 */
public class Cliente {
    private int cedula; 
    private String nombre;
    private String correo;
    private int telefono;
    private String direccion;
    private char sexo;
    private Calendar fechaNacimiento;
    private Casillero casillero;
    private ClasificacionCliente clasificacion;
    private int paquetesRetirados;

    public Cliente(int cedula, String nombre, String correo, int telefono, String direccion, char sexo, Calendar fechaNacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.paquetesRetirados = 0;
        this.clasificacion = ClasificacionCliente.NORMAL;
    }

    public Cliente(int cedula, String nombre, String correo, int telefono, String direccion, char sexo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.sexo = sexo;
        this.paquetesRetirados = 0;
        this.clasificacion = ClasificacionCliente.NORMAL;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
        
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Casillero getCasillero() {
        return casillero;
    }

    public void setCasillero(Casillero casillero) {
        this.casillero = casillero;
    }

    public ClasificacionCliente getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(ClasificacionCliente clasificacion) {
        this.clasificacion = clasificacion;
    }

    public int getPaquetesRetirados() {
        return paquetesRetirados;
    }

    public void setPaquetesRetirados(int paquetesRetirados) {
        this.paquetesRetirados = paquetesRetirados;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cedula=" + cedula + ", nombre=" + nombre + ", correo=" + correo + ", numero=" + telefono + ", direccion=" + direccion + ", sexo=" + sexo + ", fechaNacimiento=" + fechaNacimiento.get(Calendar.DATE) + "/" +(fechaNacimiento.get(Calendar.MONTH)+1) + "/" +fechaNacimiento.get(Calendar.YEAR) + ", casillero=" + String.valueOf(casillero.getNumero()) + ", clasificacion=" + clasificacion + ", paquetesRetirados=" + paquetesRetirados + '}';
    }
    
    
}
