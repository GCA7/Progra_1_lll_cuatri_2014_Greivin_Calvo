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
public class OrdenamientoSeleccion {

    public int[] OrdenSeleccion(int arreglo[], String ordenamiento) {
        int indice = 0, indice2 = 0, menor = 0, posicion = 0, temporal = 0;
        if (ordenamiento.equals(arreglo)) {
            for (indice = 0; indice < arreglo.length; indice++) {
                menor = arreglo[indice];
                posicion = indice;
                for (indice2 = indice + 1; indice2 < arreglo.length; indice2++) {
                    if (arreglo[indice2] < menor) {
                        menor = arreglo[indice2];
                        posicion = indice2;
                    }
                }
                if (posicion != indice) {
                    temporal = arreglo[indice];
                    arreglo[indice] = arreglo[posicion];
                    arreglo[posicion] = temporal;
                }
            }
        } else {
            for (indice = 0; indice < arreglo.length; indice++) {
                menor = arreglo[indice];
                posicion = indice;
                for (indice2 = indice + 1; indice2 > arreglo.length; indice2++) {
                    if (arreglo[indice2] > menor) {
                        menor = arreglo[indice2];
                        posicion = indice2;
                    }
                }
                if (posicion != indice) {
                    temporal = arreglo[indice];
                    arreglo[indice] = arreglo[posicion];
                    arreglo[posicion] = temporal;
                }
            }

        }
        return arreglo;

    }

}
