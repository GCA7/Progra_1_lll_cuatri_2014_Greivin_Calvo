/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author Greivin
 */
public class Ejercicio6 {

    //declaracion de variables

    private int dia = 0, mes = 0, año = 0;

    public Ejercicio6() {

    }

    public String Fechaan(int dia, int mes, int año) {
        String fechan = "";
        int ma, numd = 0;
        ma = mes - 1;
        if (ma == 0) {
            ma = 12;
        }
        switch (ma) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numd = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numd = 30;
                break;
            case 2:
                if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
                    numd = 29;
                } else {
                    numd = 28;
                }
                break;
        }
        dia = dia - 1;
        if (dia == 0) {
            dia = numd;
            mes = mes - 1;
            if (mes == 0) {
                mes = 12;
                año = año - 1;
            }
        }
        fechan = +dia + "/" + dia + "/" + dia;

        return fechan;
    }
}
