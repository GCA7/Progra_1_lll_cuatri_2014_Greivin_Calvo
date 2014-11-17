/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicauno;

import java.util.Scanner;

/**
 *
 * @author Greivin
 */
public class Practicauno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Snombre=" ";
        Scanner oScanner= new Scanner(System.in);
        Ejercicio1 oEjercicio1=new Ejercicio1();
        System.out.println(oEjercicio1.Alrevez(Snombre));
        
        Ejercicio3 oEjercicio3=new Ejercicio3();
        System.out.println(oEjercicio3.EliminarEspacios(Snombre));
        Ejercicio2 oEjercicio2=new Ejercicio2();
       // System.out.println(oEjercicio2.Impresion(oScanner.nextLine()));
        Ejercicio4 oEjercicio4=new Ejercicio4();
        System.out.println(oEjercicio4.Numeros(Snombre));
        
        Ejercicio5 oEjercicio5= new Ejercicio5();
        //System.out.println(oEjercicio5.Muestra100(oScanner.nextLine()));
        
        Ejercicio6 oEjercicio6=new Ejercicio6();
        System.out.println(oEjercicio6.PalabraNueva(oScanner.nextLine()));
    }
    
}
