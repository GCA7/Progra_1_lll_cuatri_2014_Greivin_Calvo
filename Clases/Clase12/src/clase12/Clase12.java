/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase12;

/**
 *
 * @author Greivin
 */
public class Clase12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        NodoDeLista nodoDeLista1=new NodoDeLista();
        nodoDeLista1.setMatricula("01");
        nodoDeLista1.setDueño("Greivin Calvo");
        nodoDeLista1.setMarca("Hummer");
        
        NodoDeLista nodoDeLista2=new NodoDeLista();
        nodoDeLista2.setMatricula("02");
        nodoDeLista2.setDueño("Marito Mortadela");
        nodoDeLista2.setMarca("Vaca");
        
        Lista oLista=new Lista();
        oLista.Insertar(nodoDeLista1);
        oLista.Insertar(nodoDeLista2);
        oLista.Imprimir();
    }
    
    
}
