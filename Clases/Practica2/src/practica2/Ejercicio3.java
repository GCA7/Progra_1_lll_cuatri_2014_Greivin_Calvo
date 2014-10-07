/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author Greivin
 */
public class Ejercicio3 {
    //declaracion de variables
    private String a="a",A="A";
    private String b="b",B="B";
    private String c="c",C="C";
    private String d="d",D="D";
    private String e="e",E="E";
    //
    public String Letra(String L){
        
          if((L.equals(a))||(L.equals(A))){
              return "Excelente";
          }
          if(L.equals(b)||L.equals(B)){
              return "Bueno";
          }
          if(L.equals(c)||L.equals(C)){
              return "Regular";
          }
          if(L.equals(d)||L.equals(D)){
              return "Malo";
          }
          if(L.equals(e)||L.equals(E)){
              return "Pesimo";
          }
            return "Abecedario"; 
    }
    
    
        }

        
            
           
                
            


        
        
        
        
        