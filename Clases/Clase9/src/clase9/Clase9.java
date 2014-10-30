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
public class Clase9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int columnas, filas;
        int fi, co;
        int f, c;
        Scanner teclado=new Scanner(System.in);
        Ejercicio1 oEjercicio1= new Ejercicio1();
        oEjercicio1.CrearMatriz(2, 5);
        oEjercicio1.CargarMatriz();
        System.out.print(oEjercicio1.Imprimir());
        
        
        Ejercicio2 oEjercicio2 = new Ejercicio2();
        System.out.println("Digite la cantidad de filas que desea");
        teclado= new Scanner(System.in);
        filas=teclado.nextInt();
        System.out.println("Digite la cantidad de columnas que desea");
        teclado= new Scanner(System.in);
        columnas=teclado.nextInt();
        oEjercicio2.CrearMatriz(filas, columnas);
        oEjercicio2.CargarMatriz();
        System.out.println(oEjercicio2.Impresion());
        System.out.println(oEjercicio2.CambiarFilas());
        
        
        Ejercicio3 oEjercicio3 = new Ejercicio3();
        System.out.println("Digite la cantidad de filas deseada");
        teclado = new Scanner(System.in);
        fi=teclado.nextInt();
        System.out.println("Digite la cantidad de columnas deseada");
        teclado= new Scanner(System.in);
        co=teclado.nextInt();
        oEjercicio3.CrearMatriz(fi, co);
        oEjercicio3.CargarMatriz();
        System.out.println(oEjercicio3.Impreso());
        System.out.println(oEjercicio3.Vértices(fi,co));
        
        
        Ejercicio4 oEjercicio4= new Ejercicio4();
        System.out.println("Digite la cantaidad de filas deseada");
        teclado= new Scanner(System.in);
        f=teclado.nextInt();
        System.out.println("Digite la cantaida de columnas deseada");
        teclado= new Scanner(System.in);
        c=teclado.nextInt();
    }
    
}
