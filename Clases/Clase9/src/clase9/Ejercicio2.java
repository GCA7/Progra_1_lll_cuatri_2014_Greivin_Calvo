/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase9;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Greivin
 */
public class Ejercicio2 {
    
    private int[][] Matriz2;
    
    public void CrearMatriz (int fila, int columna)
    {
        Matriz2= new int [fila][columna]; 
    }
    public void CargarMatriz ()
    {
        Scanner teclado= new Scanner(System.in);
        for (int i = 0; i < Matriz2[0].length; i++) {
            for (int j = 0; j < Matriz2.length; j++) {
                Matriz2[i][j]=teclado.nextInt();
            }
        }
    }
    public String Impresion ()
    {
     String impresion="";
        for (int i = 0; i < Matriz2.length; i++) {
            for (int j = 0; j < Matriz2[0].length; j++) {
               
                impresion +=Matriz2[j][i]+" ";      
            }
            impresion+="\n";       
        }
        return impresion;
    }
    public String CambiarFilas ()
    {
        String Impresion="";
        String Impresion2="";
        for (int i = 0; i < Matriz2.length; i++) {
            for (int j = 0; j < Matriz2.length; j++) {
                if(j==0){
                    Impresion+=Matriz2[i][j]+" ";
                }
                if(j==1){
                    Impresion2+=Matriz2[i][j]+" ";
                }
            }
        
        }
        
        return Impresion2+"\n"+Impresion;
    }
    
  
    }
    

    