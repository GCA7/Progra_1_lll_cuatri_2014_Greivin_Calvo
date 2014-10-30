/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaarreglos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Greivin
 */
public class PracticaArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int opcion=0;
        Scanner teclado= new Scanner(System.in);
        
        do{
            System.out.println("Digite la opcion del ejercicio a evaluar");
            System.out.println("Ejercicio 1");
            System.out.println("Ejercicio 2");
            System.out.println("Ejercicio 3");
            System.out.println("Ejercicio 4");
            System.out.println("Salir");
            opcion=teclado.nextInt();
            switch(opcion){
                case 1:
                    Ejercicio1 oEjercicio1=new Ejercicio1();
                    double Acum=0;
                    for (int i = 0; i < 8; i++) {
                    teclado= new Scanner(System.in);
                        System.out.println("Digite los valores"+(i+1));
                        oEjercicio1.vectores(teclado.nextDouble());
                        
                    }
                    System.out.println("El acumulado es de"+" "+oEjercicio1.Acumulado());
                    System.out.println("La secuencia que da resultado mayor a 36 son"+" "+oEjercicio1.SumaAcumulado());
                    System.out.println("La cantidad de valores mayores a 50 son"+" "+oEjercicio1.Mayores());
                    break;
                    
                case 2:
                    Ejercicio2 oEjercicio2= new Ejercicio2();
                    int vec1=0, vec2=0, vec3=0;
                    for (int i = 0; i < 4; i++) {
                        teclado= new Scanner(System.in);
                        System.out.println("Digite los numeros que desea");
                        oEjercicio2.V1(teclado.nextInt());
                    }
                    for (int i = 0; i < 4; i++) {
                        teclado= new Scanner(System.in);
                        System.out.println("Digite los segundos numeros que desea");
                        oEjercicio2.V2(teclado.nextInt());
                    }
                    System.out.println("El resultado de la suma es"+" "+oEjercicio2.carga1());
                    
                        break;
                    
                case 3:
                   double cursoa = 0, cursob = 0;
                   Ejercicio3 oEjercicio3=new Ejercicio3();
                    for (int i = 0; i < 5; i++) {
                        teclado= new Scanner(System.in);
                        System.out.println("Digite las notas del curso A"+(i+1));
                        oEjercicio3.Clases(teclado.nextDouble());    
                        }
                    for (int i = 0; i < 5; i++) {
                        teclado= new Scanner(System.in);
                        System.out.println("Digite las notas del curso B"+(i+1));
                        oEjercicio3.Clases2(teclado.nextDouble());
                    }
                    System.out.println(oEjercicio3.Prom());
                       break; 
                    
                case 4:
                    double num=0;
                    Ejercicio4 oEjercicio4= new Ejercicio4();
                    for (int i = 0; i < 10; i++) {
                        teclado= new Scanner(System.in);
                        System.out.println("Digite los números"+(i+1));
                        oEjercicio4.Ordenado(teclado.nextDouble());   
                    }
                    System.out.println(oEjercicio4.MenMan());
                break;
            }
        
    }while(opcion!=5);
    }
}


