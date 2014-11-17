/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase10;

/**
 *
 * @author Greivin
 */
public class OrdenamientoInsercion {
    
    public int[]OrdenInsercion(int arreglo[], String ordenamiento){
        int i,j,temporal;
        int indice, indice2,auxiliar;
        for (indice = 0;  indice< arreglo.length; indice++) {
            auxiliar=arreglo[indice];
            for (indice2 = 0;  indice2>= 0&&arreglo[indice]<auxiliar; indice2--) {
                arreglo[indice2+1]=arreglo[indice2];
                arreglo[indice2]=auxiliar;
            }
        }
        return arreglo;
    }
}
