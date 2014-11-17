/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1progra;

import java.util.Scanner;

/**
 *
 * @author Greivin
 */
public class Examen1Progra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String palabra="";
        int brin=0;
        char letra = 0;
        int cantidad=0;
        int opcion;
        
        Scanner teclado=new Scanner(System.in);
        
        do{
            System.out.println("Digite la opcion del ejercicio a evaluar");
            System.out.println("Ejercicio 1");
            System.out.println("Ejercicio 2");
            System.out.println("Salir");
            opcion=teclado.nextInt();
            switch(opcion){
                case 1:
                     Examen oExamen= new Examen();
                     oExamen.CrearMatriz();
                     oExamen.CrearMatrizMayu();
                     oExamen.CrearMatriz2();
                     oExamen.guardarAlfa();
                     System.out.println("Digite una palabra");
                     teclado= new Scanner(System.in);
                     palabra=teclado.next();
                     System.out.println("Digite el numero de bricos que desea");
                     teclado= new Scanner(System.in);
                     brin=teclado.nextInt();
                     oExamen.cambio(palabra, brin);
                     System.out.println("El cambio de la palabra es"+oExamen.cambio(palabra, brin));
                    break;
                case 2:
                    Examen2 oExamen2= new Examen2();
                    System.out.println("Digite una cantidad");
                    teclado= new Scanner(System.in);
                    cantidad=teclado.nextInt();
                    System.out.println(oExamen2.impresion(cantidad));
                    System.out.println(oExamen2.Imprimir(cantidad));
                    break;
                case 3:
                    break;
    }
        }while(opcion!=3);
}
}
