/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamatriz;

import java.util.Random;

/**
 *
 * @author Greivin
 */
public class Ejercicio1 {
    
    
    int[][] matrizA=new int[0][0];
    
    public void IniciarMatriz (int filas, int columnas){
        matrizA=new int[filas][columnas];
        
    }
    public void Llenar ()
    {
        Random oRandom= new Random();
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                matrizA[i][j]=(int)(oRandom.nextInt(6)+10);
            }
        }
    }
    
    public String ImpresionPorFila()
    {
        String temporal="";
      for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                temporal=String.valueOf(matrizA[i][j]);
            }
        }   
      return temporal;
    }
    
    public String ImpresionTriangularSuperior()
    {
        String temporal="";
      for (int i = 1; i < matrizA.length; i++) {
            for (int j = 1; j < matrizA[0].length; j=j+i) {
                temporal=String.valueOf(matrizA[i][j]);
            }
        }   
      return temporal;
    }
    
    public String ImpresionTriangularInferior()
    {
        String temporal="";
      for (int i = 1; i < matrizA.length-2; i++) {
            for (int j = 1; j < matrizA[0].length; j=j+i) {
                temporal=String.valueOf(matrizA[i][j]);
            }
        }   
      return temporal;
    }
}