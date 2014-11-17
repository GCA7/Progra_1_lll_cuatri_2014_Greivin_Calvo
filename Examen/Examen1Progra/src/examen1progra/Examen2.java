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
public class Examen2 {

    private int candi;
    private String acum = "";
    private String acum0 = " ";

    public String impresion(int cantidad) {
        int i = 0;
        
        while (cantidad >= 5000) {
            i++;
        
            cantidad = cantidad - 5000;
            while(cantidad < 5000) {
                return i + " billete(s) de 5000 colones" + "\n";
            }
        }
        
        while (cantidad >= 2000) {
            i=0;
            i++;
            cantidad = cantidad - 2000;
            while(cantidad < 2000) {
                return i + " billete(s) de 2000 colones" + "\n";

            }
        }
        
        while (cantidad >= 1000) {
            i=0;
            i++;
            cantidad = cantidad - 1000;
            while (cantidad < 1000) {
                return i + " billete(s) de 1000" + "\n";
            }
        }
        
        while(cantidad >= 500) {
            i=0;
            i++;
            cantidad = cantidad - 500;
            while (cantidad < 500) {
                return i + " moneda(s) de 500 colones" + "\n";
            }
        }
        
        while (cantidad >= 100) {
            i=0;
            i++;
            cantidad = cantidad - 100;
            while (cantidad < 100) {
                return i + " moneda(s) de 100" + "\n";
            }
        }
        
        while (cantidad >= 50) {
            i=0;
            i++;
            cantidad = cantidad - 50;
            while (cantidad < 50) {
                return i + " moneda(s) de 50" + "\n";
            }
        }
        
        while (cantidad >= 25) {
            i=0;
            i++;
            cantidad = cantidad - 25;
            while (cantidad < 25) {
                return i + " moneda(s) de 25" + "\n";
            }
        }
        return null;
    }

    public String Imprimir(int cantidad) {
        if (cantidad == 10000) {
            return "El total es de diez mil colones";
        } else {
            if (cantidad == 9000) {
                return "El total es de nueve mil colones";
            } else {
                if (cantidad == 8000) {
                    return "El total es de ocho mil colones";
                } else {
                    if (cantidad == 7000) {
                        return "El total es de siete mil colones";
                    } else {
                        if (cantidad == 6000) {
                            return "El total es de seis mil colones";
                        } else {
                            if (cantidad == 5000) {
                                return "El total es de cinco mil colones";
                            } else {
                                if (cantidad == 4000) {
                                    return "El total es de cuatro mil colones";
                                } else {
                                    if (cantidad == 3000) {
                                        return "El total es de tres mil colones";
                                    } else {
                                        if (cantidad == 2000) {
                                            return "El total es de dos mil colones";
                                        } else {
                                            if (cantidad == 1000) {
                                                return "El total es de mil colones";
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;

    }

}

