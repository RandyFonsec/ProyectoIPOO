/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Randy
 */
public class AdmCounter {
    private Counter counter;
    
    public AdmCounter(){
        ;
    }
    public boolean crearCounter(String nombre, String cedula, String direccion, int cantidadCasilleros, int paquetesNivel) {
        boolean bandera = false;
        if(cantidadCasilleros > 0) {
            this.counter = new Counter(nombre, cedula, direccion, cantidadCasilleros, paquetesNivel);
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
    public boolean validarMail(String email) {
        // Patron para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
 
        Matcher mather = pattern.matcher(email);
        return mather.find();
    }
    public Casillero asignarCasillero(){
        Casillero resultado = null;
        for(Casillero var : this.counter.getCasilleros()){
            if(var.isLibre()){
                resultado = var;
                break;
            }
        }
        return resultado;
    }
    public String crearCliente(int cedula, String nombre, String correo, int telefono, String direccion, char sexo, int dia, int mes, int anno){
        boolean bandera = true;
        String resultado = "Fallo en el registro, motivo: \n";
        if(consultarCliente(cedula) != null){
            resultado += " La cedula ya se encuentra registrada \n";
            bandera = false;
        }else{
            if(String.valueOf(telefono).length() != 8){
                resultado += " El numero de telefono es incorrecto \n";
                bandera = false;
            }
            if(!validarMail(correo)){
                resultado += " El correo es incorrecto \n";
                bandera = false;
            }
            if(String.valueOf(cedula).length() != 9){
                resultado += " La cedula tiene un formato incorrecto \n";
                bandera = false;
            }
        }            
        if(bandera){
            Calendar fechaNacimiento = new GregorianCalendar(anno, mes, dia);
            Cliente agregar;
            agregar = new Cliente(cedula, nombre, correo, telefono, direccion, sexo,fechaNacimiento);
            Casillero casilleroCliente = asignarCasillero();
            if(casilleroCliente != null){
                agregar.setCasillero(casilleroCliente);
                casilleroCliente.setLibre(false);
                this.counter.agregarCliente(agregar);
                resultado = "Cliente creado, casillero numero "+casilleroCliente.getNumero()+" asignado";
            }
            else{
                resultado += " No hay casilleros disponibles\n";
            }
        }
        
        return resultado;
    }
    public String actualizarCliente(String cedula, String nombre, String correo, String telefono, String direccion, char sexo, String dia, String mes, String anno){
        String resultado = "";
        boolean bandera = true;
        
        Cliente cliente = consultarCliente(Integer.parseInt(cedula));
        int tel = (telefono.equals("")? 12345678 : Integer.parseInt(telefono));
        String correo2 = (correo.equals("") ? "abcd@gmail.com" : correo);
        
        if(cliente == null){
            resultado += " El cliente no existe \n";
            bandera = false;
        }else{
            if(String.valueOf(tel).length() != 8){
                resultado += " El numero de telefono es incorrecto \n";
                bandera = false;
            }
            if(!validarMail(correo2)){
                resultado += " El correo es incorrecto \n";
                bandera = false;
            }
        }     
        
        if(bandera){
            cliente.setNombre((nombre.equals("")? cliente.getNombre() : nombre));
            cliente.setCorreo(correo.equals("")? cliente.getCorreo(): correo);
            cliente.setTelefono(telefono.equals("") ? cliente.getTelefono() : Integer.parseInt(telefono));
            cliente.setDireccion(direccion.equals("") ? cliente.getDireccion(): direccion);
            cliente.setSexo(sexo);
            int dia2, mes2, anno2;
            dia2 = dia.equals("N/A")? cliente.getFechaNacimiento().get(Calendar.DATE) : Integer.parseInt(dia);
            mes2 = dia.equals("N/A")? cliente.getFechaNacimiento().get(Calendar.MONTH) : Integer.parseInt(mes);
            anno2 = dia.equals("N/A")? cliente.getFechaNacimiento().get(Calendar.YEAR) : Integer.parseInt(anno);
            cliente.setFechaNacimiento(new GregorianCalendar(anno2, mes2, dia2));
            resultado = "Cliente actualizado exitosamente ";
        }
        
        return resultado;
    }
    public Cliente consultarCliente(int cedula){
        Cliente resultado = null;
        for(Cliente var : this.counter.getClientes()){
            if(var.getCedula() == cedula){
                resultado = var;
                break;
            }
        }
        return resultado;
    }
    public String eliminarCliente(int cedula){
        String resultado = "";
        Cliente cliente = consultarCliente(cedula);
        if(cliente == null){
            resultado = "No existe el cliente";
        }else{
            cliente.getCasillero().setLibre(true);
            this.getCounter().getClientes().remove(cliente);
            resultado = "Cliente eliminado";
        }
        return resultado;
    }

    public Counter getCounter() {
        return counter;
    }

    public void setCounter(Counter counter) {
        this.counter = counter;
    }
    
}
