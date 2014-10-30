/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase9;

import java.util.Scanner;

/**
 *
 * @author Greivin
 */
public class Ejercicio1 {
    
    private int[][] Matriz1;
    
    public void CrearMatriz (int fila, int columna)
    {
        Matriz1= new int[fila][columna];
        }
    public void CargarMatriz ()
    {
        Scanner teclado= new Scanner(System.in);
        for (int j = 0; j < Matriz1[0].length; j++) {
            for (int i = 0; i < Matriz1.length; i++) {
             Matriz1[i][j]=teclado.nextInt();
        }
        }
        
    }
    public String Imprimir(){
        
    String impresion="";
        for (int i = 0; i < Matriz1.length; i++) {
            for (int j = 0; j < Matriz1[0].length; j++) {
                impresion +=Matriz1[i][j] +" ";
            }
            impresion +="\n";
        }
        return impresion;
    }
    
}
