/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.Scanner;

/**
 *
 * @author Greivin
 */
public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean validar=true;
        int num=0, opcion=0, numc, Mes = 0, Año = 0;
        int dia=0, mes=0, año=0;
        char continuar;
        String l;
        
        Scanner teclado=new Scanner(System.in);
        Ejercicio1 oEjercicio1= new Ejercicio1();
        do{
            System.out.println("Digite una opcion");
            System.out.println("1: Calendario");
            System.out.println("2: Calcular numero");
            System.out.println("3: Calificacion de Letra");
            System.out.println("4: Días del mes");
            System.out.println("5: Numeros Romanos");
            System.out.println("6: Fecha Anterior");
            System.out.println("7: Día de la semana");
            System.out.println("8: Semana");
            opcion=Integer.parseInt(teclado.nextLine());
            
            switch(opcion){
                case 1:
                    System.out.println("Digite un numero del mes");
                    teclado=new Scanner(System.in);
                    num=Integer.parseInt(teclado.nextLine());
                    System.out.println("El mes correspondiente es" +" "+ oEjercicio1.Mes(num));
                    break;
                case 2:
                    Ejercicio2 oEjercicio2= new Ejercicio2();
                    System.out.println("Digite un numero");
                    teclado=new Scanner(System.in);
                    numc=Integer.parseInt(teclado.nextLine());
                    System.out.println("El resultado de la operacion del numero es"+" "+ oEjercicio2.calNumero(numc));
                    break;
                case 3:
                    Ejercicio3 oEjercicio3= new Ejercicio3();
                    System.out.println("Digite una letra");
                    teclado= new Scanner(System.in);
                    l=teclado.nextLine();
                    System.out.println("La calificacion de la letra es"+" "+oEjercicio3.Letra(l));
                    break;
                case 4:
                    Ejercicio4 oEjercicio4= new Ejercicio4();
                    System.out.println("Digite un numero del mes");
                    teclado= new Scanner(System.in);
                    Mes=Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el año");
                    teclado= new Scanner(System.in);
                    Año=Integer.parseInt(teclado.nextLine());
                    System.out.println("El mes"+" "+Mes+" "+"del año"+" "+Año);
                    System.out.println("El mes tiene"+" "+ oEjercicio4.Mesaño(Mes, Año));
                    break;
                case 5:
                    Ejercicio5 oEjercicio5= new Ejercicio5();
                    int random2 = oEjercicio5.ramdom();
                    System.out.println("El número ramdom es: " + random2 + " El número romano es: " + oEjercicio5.romanos(random2));
                    break;
                case 6:
                    Ejercicio6 oEjercicio6= new Ejercicio6();
                    System.out.println("Digite un dia del mes");
                    teclado= new Scanner (System.in);
                    dia=Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite un mes");
                    teclado= new Scanner(System.in);
                    mes=Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite un Año");
                    teclado= new Scanner (System.in);
                    año=Integer.parseInt(teclado.nextLine());
                    System.out.println("La fecha actual es"+dia+" "+mes+" "+año);
                    System.out.println("La fecha anterior es"+" "+ oEjercicio6.Fechaan(dia, mes, año));
                    break;
                case 7:
                    int dsem = 0, me, añ;
                    Ejercicio7 oEjercicio7= new Ejercicio7();
                    System.out.println("Digite un día de la semana");
                    teclado= new Scanner(System.in);
                    dsem=Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite un mes");
                    teclado= new Scanner(System.in);
                    me=Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite un año");
                    teclado= new Scanner(System.in);
                    añ=Integer.parseInt(teclado.nextLine());
                    System.out.println("La fecha digitada es"+  dsem+" "+me+" "+añ);
                    System.out.println("El dia de la semana es"+" "+oEjercicio7.DiaSem(dsem, me, añ));
                case 8:
                    int di=0 ,diac=0;
                    Ejercicio8 oEjercicio8= new Ejercicio8();
                    System.out.println("Digite el día de la semana que fue el día 1, representado de la siguiente manera:"+"/n"+
                            "Lunes=1, Martes=2, Miercoles=3, Jueves=4, Viernes=5, Sabado=6, Domingo=7");
                    teclado= new Scanner(System.in);
                    di=Integer.parseInt(teclado.nextLine());
                    System.out.println("Digite el dia actual de la semana");
                    teclado= new Scanner(System.in);
                    diac=Integer.parseInt(teclado.nextLine());
                    System.out.println("El día de la semana es"+"/n"+" "+oEjercicio8.Dias(di, diac));
            default:
                
                break;
        }
            System.out.println("Desea continuar con otra operacion S/N");
            continuar = teclado.nextLine().charAt(0);
            if((continuar == 'S')|| (continuar == 's')){
                validar = true;
                
            }else{
                validar=false;
            }
        }while(validar);
        }
    }
    

