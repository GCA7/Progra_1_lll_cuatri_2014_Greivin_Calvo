/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaarreglos;

/**
 *
 * @author Greivin
 */
public class Ejercicio4 {
    double[]elementos=new double[10];
    
    public void Ordenado (double num)
    {
        for (int i = 0; i < elementos.length; i++) {
            if(elementos[i]==0){
                elementos[i]= num;
                break;
            }
        }
    }
    
    public String MenMan (){
           if(elementos[0]<elementos[1]&&elementos[1]<elementos[2]&&
           elementos[2]<elementos[3]&&elementos[3]<elementos[4]&&
           elementos[4]<elementos[5]&&elementos[5]<elementos[6]&&
           elementos[6]<elementos[7]&&elementos[7]<elementos[8]&&
           elementos[8]<elementos[9])
        {
        return "Si se encuentra ordeano";
    }else{
         return "No se encuentra ordenado";

        }    
    }
}

