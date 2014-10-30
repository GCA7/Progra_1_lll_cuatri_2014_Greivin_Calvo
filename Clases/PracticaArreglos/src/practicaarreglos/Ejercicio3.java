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

  //3.	Se tienen las notas del primer parcial de los alumnos de dos cursos, 
    //el curso A y el curso B, cada curso cuenta con 5 alumnos.
//Realizar un programa que muestre el curso que obtuvo el mayor promedio general.
public class Ejercicio3 {
    double[] CursoA= new double[5];
    double[] CursoB= new double[5];
    
    public void Clases (double cursoa)
    {
        for (int i = 0; i < CursoA.length; i++) {
            if(CursoA[i]==0){
                CursoA[i]= cursoa;
                break;
            }  
        }
    }
    public void Clases2 (double cursob)
    {
        for (int i = 0; i < CursoB.length; i++) {
            if(CursoB[i]==0){
                CursoB[i]= cursob;
                break;
            }
        }
    }
    public String Prom ()
    {
        double acumA=0, acumB=0;
        double promA=0, promB=0;
        for (int i = 0; i < CursoA.length; i++) {
            acumA+=CursoA[i];
        }
        for (int i = 0; i < CursoB.length; i++) {
            acumB+=CursoB[i];
        }
        promA=acumA/5;
        promB=acumB/5;
        if(promA>promB){
            return "El curso con promedio mayor es el A";
        }else{
            return "El curso con promedio mayor es el B";
        }
    }
}

