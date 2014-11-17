/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicamatriz;

import java.util.Scanner;

/**
 *
 * @author Greivin
 */
public class PracticaMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner oScanner=new Scanner(System.in);
        /**Ejercicio1 oEjercicio1=new Ejercicio1();
        System.out.println("Digite el largo de las filas");
        int filas=oScanner.nextInt();
        System.out.println("Digite el ancho de las columnas");
        int columnas=oScanner.nextInt();
        oEjercicio1.IniciarMatriz(filas, columnas);
        oEjercicio1.Llenar();
       System.out.println(oEjercicio1.ImpresionTriangularSuperior());
        Ejercicio2 oEjercicio2=new Ejercicio2();
        System.out.println(oEjercicio2.ImpresionPorFila());
        System.out.println(oEjercicio2.DiagonalSuperior());*/
        Ejercicio3 oEjercicio3=new Ejercicio3();
        System.out.println(oEjercicio3.ImpresionPorFila());
    }
    
}
