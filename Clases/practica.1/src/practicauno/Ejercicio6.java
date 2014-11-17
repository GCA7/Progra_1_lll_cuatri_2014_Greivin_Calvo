/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicauno;

/**
 *
 * @author Greivin
 */
public class Ejercicio6 {

    
    
    String PalabraNueva(String palabra) {
        String temporal = "", muestra = "", acum = "";

        for (int i = 0; i < palabra.length(); i++) {
            temporal += palabra.charAt(i);
            acum = temporal;
            if (temporal.toLowerCase().equals(acum)) {
                muestra += temporal.toUpperCase();
            } else {
                if (temporal.toUpperCase().equals(acum)) {
                    muestra += temporal.toLowerCase();
                }
            }
            temporal = "";
        }
        return muestra;
    }
}
