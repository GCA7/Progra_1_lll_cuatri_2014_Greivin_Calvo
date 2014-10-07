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
public class Ejercicio1 {
    
    //metodo del mes
    public String Mes (int num)
    {
        if(num==1){ 
            return "Enero";
        }
        if(num==2){
            return "Febrero";
        }
        if(num==3){
            return"Marzo";
        }
        if(num==4){
            return "Abril";
        }
        if(num==5){
            return "Mayo";
        }
        if(num==6){
            return "Junio";
        }
        if(num==7){
            return "Julio";
        }
        if (num==8){
            return "Agosto";
        }
        if (num==9){
            return "Septiembre";
        }
        if (num==10){
            return "Octubre";
        }
        if (num==11){
            return "Noviembre";
        }
        if (num==12){
            return "Diciembre";
        }else{
            return "Error, mes inexistente";
        }
    }
}
