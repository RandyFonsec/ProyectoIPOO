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
public enum ClasificacionCliente {
    NORMAL,
    PLATA,
    ORO;
    public static String decodificador(ClasificacionCliente valor){
        String respuesta = "";
        switch(valor){
            case NORMAL -> respuesta = "Normal";
            case PLATA -> respuesta = "Respuesta";
            case ORO -> respuesta = "Oro";
        }
        return respuesta;
    }
}
