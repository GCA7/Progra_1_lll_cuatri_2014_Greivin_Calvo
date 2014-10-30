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
public class Ejercicio3 {
    
    private int[][] Valores;
    
    public void CrearMatriz (int fi, int co)
    {
        Valores= new int [fi][co];
    }
    public void CargarMatriz ()
    {
        Scanner teclado= new Scanner(System.in);
        for (int j = 0; j < Valores[0].length; j++) {
            for (int i = 0; i < Valores.length; i++) {
                Valores[i][j]= teclado.nextInt();
            }
        }
    }
     public String Impreso ()
    {
     String impresion="";
        for (int i = 0; i < Valores.length; i++) {
            for (int j = 0; j < Valores[0].length; j++) {
               
                impresion +=Valores[j][i]+" ";      
            }
            impresion+="\n";       
        }
        return impresion;
    }
    
    public String Vértices (int fi, int co)
    {
       String impresion="", impresion2="",impresion3="",impresion4="";
        for (int i = 0; i < Valores.length; i++) {
            for (int j = 0; j < Valores.length; j++) {
                if(i==0&&j==0){
              impresion+=Valores[0][0];
                }
                if(i==0&&j==1){
              impresion2+=Valores[0][Valores[0].length-1];
                }
                if(i==1&&j==0){
              impresion3+=Valores[Valores.length-1][0];
                }
                if(i==1&&j==1)
              impresion4+=Valores[Valores.length-1][Valores[Valores.length-1].length-1];
            }
        }
        return impresion+" "+impresion3+"\n"+impresion2+" "+impresion4;
    }
}
