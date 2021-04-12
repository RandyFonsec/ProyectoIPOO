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
public enum TemaRevista {
    
    NEGOCIOS,
    MODA,
    TECNOLOGÍA,
    SALUD,
    COCINA,
    OTROS;
    
    public static String decodificador(TemaRevista valor) {
        String respuesta = "";
        switch (valor) {
            case NEGOCIOS: 
                respuesta = "Negocios";
                break;
            case MODA: 
                respuesta = "Moda";
                break;
            case TECNOLOGÍA: 
                respuesta = "Tecnología";
                break;
            case SALUD: 
                respuesta = "Salud";
                break;
            case COCINA: 
                respuesta = "Cocina";
                break;
            case OTROS: 
                respuesta = "Otros";
                break;
        }
        return respuesta;
    }
    
}
