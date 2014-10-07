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
public class Ejercicio4 {
    
    
    public String Mesaño (int mes, int año){
        if(mes==1){
            return "31 Días";
        }
        if(mes==2){
            return "28 Días";
        }
        if(mes==3){
            return "31 Días";
        }
        if(mes==4){
            return "30 Días";
        }
        if (mes==5){
            return "31 Días";
        }
        if (mes==6){
            return "30 Días";
        }
        if (mes==7){
            return "31 Días";
        }
        if (mes==8){
            return "31 Días";
        }
        if (mes==9){
            return "30 Días";
        }
        if(mes==10){
            return "31 Días";
        }
        if (mes==11){
            return "30 Días";
        }
        if (mes==12){
            return "31 Días";
        }else{
            return "Error, mes inexistente";
        }
    }
    
}
