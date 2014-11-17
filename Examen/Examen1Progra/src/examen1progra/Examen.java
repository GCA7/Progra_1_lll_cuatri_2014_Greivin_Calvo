/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1progra;

/**
 *
 * @author Greivin
 */
public class Examen {
    
    private String alfa [];
    private String mayusculas[];
    private String num [];
   
    
    public void CrearMatriz (){
        alfa= new String[26];
    }
    
    public void CrearMatrizMayu (){
        mayusculas= new String[26];
    }
    public void CrearMatriz2 (){
        num= new String [9];
    }
   
    public void guardarAlfa()
    {
        num[0]="1";
        num[1]="2";
        num[2]="3";
        num[3]="4";
        num[4]="5";
        num[5]="6";
        num[6]="7";
        num[7]="8";
        num[8]="9";
        
       alfa[0]="a"; 
       mayusculas[0]="A";
       alfa[1]="b";
       mayusculas[1]="B";
       alfa[2]="c";
       mayusculas[2]="C";
       alfa[3]="d";
       mayusculas[3]="D";
       alfa[4]="e";
       mayusculas[4]="E";
       alfa[5]="f";
       mayusculas[5]="F";
       alfa[6]="g";
       mayusculas[6]="G";
       alfa[7]="h";
       mayusculas[7]="H";
       alfa[8]="i";
       mayusculas[8]="I";
       alfa[9]="j";
       mayusculas[9]="J";
       alfa[10]="k";
       mayusculas[10]="K";
       alfa[11]="l";
       mayusculas[11]="L";
       alfa[12]="m";
       mayusculas[12]="M";
       alfa[13]="n";
       mayusculas[13]="N";
       alfa[14]="o";
       mayusculas[14]="O";
       alfa[15]="p";
       mayusculas[15]="P";
       alfa[16]="q";
       mayusculas[16]="Q";
       alfa[17]="r";
       mayusculas[17]="R";
       alfa[18]="s";
       mayusculas[18]="S";
       alfa[19]="t";
       mayusculas[19]="T";
       alfa[20]="u";
       mayusculas[20]="U";
       alfa[21]="v";
       mayusculas[21]="V";
       alfa[22]="w";
       mayusculas[22]="W";
       alfa[23]="x";
       mayusculas[23]="X";
       alfa[24]="y";
       mayusculas[24]="Y";
       alfa[25]="z";
       mayusculas[25]="Z";
    }
    
    public String cambio(String palabra, int brin) {
        int al=0,r=0;
        String cambio = " ",cambio2="",cambio3="",cambio4="";
        String acum = "", acum2 = "", acum3 = "", acum4 ="";
        for (int i = 0; i < palabra.length(); i++) {
            acum="";
       
            acum += palabra.charAt(i);
            for (int j = 0; j < alfa.length&&j<mayusculas.length||j<num.length; j++) {
                    
                acum2 = alfa[j];
                acum3 = mayusculas[j];
                
                if (acum2.equals(acum)) {
                    al = j + brin;
                    cambio += alfa[al];
                    cambio3+=cambio;
                    cambio="";
                }if(j<num.length-1){ 
                if(acum.equals(num[j])){
                    al = j + brin;
                    cambio2 += num[al];
                    cambio3+=cambio2;
                    cambio2="";
                }
                
                }else{
                if(acum3.equals(acum)){
                    al = j + brin;
                    cambio4 += mayusculas[al];
                    cambio3+=cambio4;
                    cambio4="";
                }
                
                    
                }    
            }
                    
        }
        
        
        return cambio3;

    }
}

