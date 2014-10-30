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
public class Ejercicio1 {
    double[] vector= new double[8];
    
    public void vectores (double Vector)
    {
        for(int i=0; i<vector.length; i++){
            if(vector[i]==0)
            {
                vector[i]= Vector;
                break;
            }
        }
        
    }
    public double Acumulado ()
    {
        double acum=0;
        for (int i = 0; i < vector.length; i++) {
            acum+=vector[i];
            
        }
        return acum;
    }
    public String SumaAcumulado (){
        String acum="";
        int suma=0;
        for (int i = 0; i < vector.length; i++) {
                acum=acum+vector[i]+",";
                suma+=vector[i];
                if(suma>=36){
                    acum+="--";
                    suma=0;
                    i=i+1;
                    }
        }
        return acum;
    }
    public String Mayores ()
    {
        String acum2="";
        int G=0;
        for (int i = 0; i < vector.length; i++) {
            if(vector[i]>50){
                acum2=acum2+vector[i]+",";
               
            }
        }
        return acum2;
    }
}
