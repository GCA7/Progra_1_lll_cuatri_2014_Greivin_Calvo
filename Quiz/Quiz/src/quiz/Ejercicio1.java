/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author Greivin
 */

/**Diseñe un programa que le solicite al usuario digitar cinco palabras 
 * con mayúscula y minúscula(estas pueden tomar cualquier orden).
 * Se deben ordenar estas 5 palabras en orden alfabético y ascendente, 
 * tomando en cuenta que las mayúsculas van después de las minúsculas pero 
 * solo con respecto a la misma letra.Un espacio en blanco va antes de cualquier letra
Por ejemplo
* 
Casa casa cosa cOsa Cosa;Estas 5 palabras están ordenadas correctamente.*/
public class Ejercicio1 {
    
    private String[]minusculas={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    private String[]mayusculas={"A","B","C","D","E","F","G","H","I","j","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    private String[]Pal;
    private String ordenar="";
    

    
    public String Ordenar (String pal, String pal2, String pal3, String pal4, String pal5){
        for (int i = 0; i < pal.charAt(i); i++) {
            for (int j = 0; j < minusculas.length; j++) {
                if(pal!=pal2){
                    if(i==j){
                       ordenar=pal; 
                    }
        }
            }
        }
        return ordenar;
        
  
        
    }
}
    
    

