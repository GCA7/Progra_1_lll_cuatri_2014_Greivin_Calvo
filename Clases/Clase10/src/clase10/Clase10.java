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
public class Clase10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        OrdenamientoSeleccion oOrdenamientoSeleccion = new OrdenamientoSeleccion();
        int[] arreglito = {8, 5, 2, 6, 0};
        int[] temporal = oOrdenamientoSeleccion.OrdenSeleccion(arreglito,"A");
        for (int i = 0; i < temporal.length; i++) {
            System.out.print(temporal[i]);
        }
        System.out.println();

        OrdenamientoBurbuja oOrdenamientoBurbuja = new OrdenamientoBurbuja();
        temporal = oOrdenamientoBurbuja.Ordenamiento(arreglito,"A");
        for (int i = 0; i < temporal.length; i++) {
            System.out.print(temporal[i]);
        }
        System.out.println();
    }
}
