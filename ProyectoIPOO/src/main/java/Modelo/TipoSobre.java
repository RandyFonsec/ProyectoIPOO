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
    
    public static String decodificador(TipoEntregable valor) {
        String respuesta = "";
        switch (valor) {
            case SOBRE: 
                respuesta = "Sobre";
                break;
            case PAQUETE: 
                respuesta = "Paquete";
                break;
            case REVISTA: 
                respuesta = "Revista";
                break;
        }
        return respuesta;
    }
    
}
