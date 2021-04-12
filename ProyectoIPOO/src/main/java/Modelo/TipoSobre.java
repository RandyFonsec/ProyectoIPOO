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
public enum TipoSobre {
    
    MANILA,
    AEREO;
    
    public static String decodificador(TipoSobre valor) {
        String respuesta = "";
        switch (valor) {
            case MANILA : 
                respuesta = "Manila";
                break;
            case AEREO: 
                respuesta = "Aereo";
                break;
        }
        return respuesta;
    }
    
}
