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
public class Counter {
    private String nombre;
    private String cedulaJuridica;
    private String direccion;
    private ArrayList<Casillero> casilleros = new ArrayList();
    private ArrayList<Cliente> clientes = new ArrayList();
    private int cantidadCasilleros;
    private int paquetesNivel;

    public Counter(String nombre) {
        this.nombre = nombre;
    }
    
    public Counter(String nombre, String cedulaJuridica, String direccion, int cantidadCasilleros, int paquetesNivel) {
        this.nombre = nombre;
        this.cedulaJuridica = cedulaJuridica;
        this.direccion = direccion;
        this.cantidadCasilleros = cantidadCasilleros;
        this.paquetesNivel = paquetesNivel;
    }

    public Counter(String nombre, String cedula, int cantidadCasilleros, int paquetesNivel) {
        this.nombre = nombre;
        this.cedulaJuridica = cedula;
        this.cantidadCasilleros = cantidadCasilleros;
        this.paquetesNivel = paquetesNivel;
    }
    
    public void agregarCliente(Cliente cliente){
        this.clientes.add(cliente);
        System.out.println("agregado ");
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedulaJuridica() {
        return cedulaJuridica;
    }

    public void setCedulaJuridica(String cedulaJuridica) {
        this.cedulaJuridica = cedulaJuridica;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Casillero> getCasilleros() {
        return casilleros;
    }

    public void setCasilleros(ArrayList<Casillero> casilleros) {
        this.casilleros = casilleros;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public int getCantidadCasilleros() {
        return cantidadCasilleros;
    }

    public void setCantidadCasilleros(int cantidadCasilleros) {
        this.cantidadCasilleros = cantidadCasilleros;
    }

    public int getPaquetesNivel() {
        return paquetesNivel;
    }

    public void setPaquetesNivel(int paquetesNivel) {
        this.paquetesNivel = paquetesNivel;
    }

    

    @Override
    public String toString() {
        return "Counter{" + "nombre=" + nombre + ", cedulaJuridica=" + cedulaJuridica + ", direccion=" + direccion + ", casilleros=" + casilleros + ", clientes=" + clientes + ", cantidadCasilleros=" + cantidadCasilleros + ", casillerosNivel=" + paquetesNivel + '}';
    }
    
    
}
