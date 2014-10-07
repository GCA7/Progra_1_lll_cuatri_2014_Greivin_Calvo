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
public class Ejercicio2 {
    //Metodo para calcular el numero
    public double calNumero (double numC)
    {
        double C;
        if (numC==2||numC==5||numC==8){
            C=Math.pow(numC, 2);
            return C ;
        }
        if (numC==4||numC==7||numC==9){
            return numC*5;
        }else{
            return numC;
        }
            
    }
}
