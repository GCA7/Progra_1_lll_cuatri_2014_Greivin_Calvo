/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaarreglos;

/**
 *
 * @author Greivin
 */
public class Ejercicio2 {
    int[] vector1=new int[4];
    int[] vector2=new int[4];
    int[] vector3=new int[4];

    public void V1 (int vec1)
    {
        for (int i = 0; i < vector1.length; i++) {
            if(vector1[i]==0){
                vector1[i]= vec1;
                break;
            }
        }
    }
    public void V2 ( int vec2)
    {
        for (int i = 0; i < vector2.length; i++) {
            if( vector2[i]==0){
                vector2[i]= vec2;
                break;
            }
        }
    }
    public void V3 (int vec3)
    {
        for (int i = 0; i < vector3.length; i++) {
            if(vector3[i]==0){
                vector3[i]= vec3;
                break;
            }
        }
    }
    
    public int carga1 ()
    {
        int acum=0;
        for (int i = 0; i < 4; i++) {
            vector3[i]=vector1[i]+vector2[i];
            acum+=vector3[i];
        }
        return acum;
    }
}
