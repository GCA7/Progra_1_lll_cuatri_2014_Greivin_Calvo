/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Greivin
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaracion de variables
        int n=0;
        double a=0;
        char c = 0;
        //se le piden al usuario los datos y se almacenan en sus respectivas variables y se muestra el resultado
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el valor de N");
        n=Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el valor de A");
        a=Double.parseDouble(teclado.nextLine());
        System.out.println("Digite el valor de C");
        c= teclado.nextLine().charAt(0);
        //creacion de la instancia
    Ejercicio1 oEjercicio1=new Ejercicio1(n, a, c);
        System.out.println("N:"+n+"  A:"+a+"  C:"+oEjercicio1.Letra());
        System.out.println("El resultado de la suma es "+oEjercicio1.suma());
        System.out.println("La diferencia es de"+oEjercicio1.resta());
        
     
        //Segundo ejercicio
        //declaracion de variables
        int x,y;
        double m,n1;
        //se le piden los datos al usuario
        System.out.println("Digite el valor de X");
        x=Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el valor de Y");
        y=Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el valor de M");
        m=Double.parseDouble(teclado.nextLine());
        System.out.println("Digite el valor de N");
        n1=Double.parseDouble(teclado.nextLine());
        //creacion de la instancia
        Ejercicio2 oEjercicio2= new Ejercicio2(x, y, m, n1);
        System.out.println("La suma correspondiente de X+Y es"+oEjercicio2.suma(x, y));
        System.out.println("La resta correspondiente de X-Y es"+oEjercicio2.resta(x, y));
        System.out.println("La division correspondiente de X/Y es"+oEjercicio2.division(x, y));
        System.out.println("La multiplicacion correspondiente de X*Y es"+oEjercicio2.division(x, y));
        //resultados de los metodos
        System.out.println("La suma correspondiente de M+N es"+oEjercicio2.suma2());
        System.out.println("La resta correspondiente de M-N es"+oEjercicio2.resta2());
        System.out.println("La division correspondiente de M/N es"+oEjercicio2.division2());
        System.out.println("La multiplicacion correspondiente de M*N es"+oEjercicio2.multiplicacion2());
        //Ejercicio3
        //Declaracion de variables
        double n3;
        // se le solicitan los datos al usuario
        System.out.println("Digite el valor de N3");
        n3=Double.parseDouble(teclado.nextLine());
        //creacion de la instancia
        Ejercicio3 oEjercicio3 = new Ejercicio3(n3);
        System.out.println("La operacion realizada es de"+oEjercicio3.formula());
        //Ejercicio4
        //Declaracion de variables
        int a1,b1,c1,d1;
        //se le solicitan los datos al usuario
        System.out.println("Digite el valor de A");
        a1=Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el valor de B");
        b1=Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el valor de C");
        c1=Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el valor de D");
        d1=Integer.parseInt(teclado.nextLine());
        System.out.println("A:"+a1+"  B:"+b1+"  C:"+c1+"  D:"+d1);
        //creacionde la instancia
        Ejercicio4 oEjercicio4= new Ejercicio4(a1, b1, c1, d1);
        System.out.println("Los nuevos valores al realizar el cambio son"+ "  B:"+oEjercicio4.cambio()+"  C:"+oEjercicio4.cambio2()+"  A:"+oEjercicio4.cambio3()+"  D:"+oEjercicio4.cambio4());
    
        //Ejercicio5 
        //Declaracion de variables
        int ne5;
        //se le solicitan los datos al usuario
         System.out.println("Digite un valor");
        ne5=Integer.parseInt(teclado.nextLine());
        //creacion de la instancia
        Ejercicio5 oEjercicio5= new Ejercicio5(ne5);
        System.out.println("El valor es"+" "+oEjercicio5.parimpar());
        //Ejercicio6
        //Declaracion de variables
        int NpN;
        //se le solicitan los datos al usuario
        System.out.println("Digite un valor");
        NpN=Integer.parseInt(teclado.nextLine());
        //creacion de la instancia
        Ejercicio6 oEjercicio6 = new Ejercicio6(NpN);
        System.out.println("El valor digitado es"+"  "+oEjercicio6.tiponumero());
        //Ejercicio7
        //Declaracion de variables*/
        int Be;
        //se le solicitan los datos al usuario
        System.out.println("Digite un valor");
        Be=Integer.parseInt(teclado.nextLine());
        //creacion de la instancia
        Ejercicio7 oEjercicio7 = new Ejercicio7(Be);
        System.out.println("El valor digitado es"+" "+oEjercicio7.posinega()+" "+"es"+" "+oEjercicio7.parim()+" "+" "+oEjercicio7.multiplo()+" "+"y"+" "+oEjercicio7.mayormenor());
}
    
}