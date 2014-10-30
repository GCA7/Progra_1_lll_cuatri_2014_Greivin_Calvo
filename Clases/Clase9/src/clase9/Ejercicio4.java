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
public class Ejercicio4 {

    private int Elemento[][];

    public void CrearMatriz(int fi, int co) {
        Elemento = new int[fi][co];
    }

    public void CargarMatriz() {
        Scanner teclado = new Scanner(System.in);
        for (int j = 0; j < Elemento[0].length; j++) {
            for (int i = 0; i < Elemento.length; i++) {
                Elemento[i][j] = teclado.nextInt();
            }
        }
    }

    public void Maelemento() {
        
        for (int i = 0; i < Elemento.length; i++) {
            for (int j = 0; j < Elemento.length; j++) {
               
              
            }

        }
    }
}
