/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author kendall c
 */
public enum PresentacionPaquete {
    
    CAJA,
    BOLSA;
    
    public static String decodificador(PresentacionPaquete valor) {
        String respuesta = "";
        switch (valor) {
            case CAJA: 
                respuesta = "Caja";
                break;
            case BOLSA: 
                respuesta = "Bolsa";
                break;
        }
        return respuesta;
    }
    
}
