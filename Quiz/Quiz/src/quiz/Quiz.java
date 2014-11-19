/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.util.Scanner;

/**
 *
 * @author Greivin
 */
public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String pal="",pal2="",pal3="", pal4="", pal5="";
        
        
        Scanner oScanner=new Scanner(System.in);
        System.out.println("Digite una primer palabra");
        pal=oScanner.nextLine();
        System.out.println("Digite la segunda palabra");
        pal2=oScanner.nextLine();
        System.out.println("Digite la tercer palabra");
        pal3=oScanner.nextLine();
        System.out.println("Digite la cuarta palabra");
        pal4=oScanner.nextLine();
        System.out.println("Digite la quinta palabra");
        pal5=oScanner.nextLine();
        Ejercicio1 oEjercicio1=new Ejercicio1();
        System.out.println(oEjercicio1.Ordenar(pal, pal2, pal3, pal4, pal5));
        
        
    }
    
}
