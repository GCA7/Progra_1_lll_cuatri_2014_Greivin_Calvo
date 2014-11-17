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
public class Ejercicio5 {
    
    private String Nombre=" ";
    
    
    public String Muestra100 (String Snombre){
        int i=1;
        while(i<=100){
            Nombre+=i+":"+"\n"+Snombre+"\n"+"\n";
            i++;
        }
        return Nombre;
    }
    
    
}
