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
public class Ejercicio3 {
    
    
     int[][] matrizA=new int[4][7];
    
    public String ImpresionPorFila()
    {
        int temporal=0;
        String temporal2="";
      for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
                temporal=i+j;
                matrizA[i][j]=temporal;
                temporal2+=matrizA[i][j];
                temporal=0;
            }
            temporal2+="\n";
        }   
      return temporal2;
    }
}
