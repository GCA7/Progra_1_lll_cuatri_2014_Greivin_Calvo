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
public class NodoDeLista {
    
    
    private String matricula;
    private String dueño;
    private String marca;
    private NodoDeLista siguiente;
    public NodoDeLista()
    {    
        dueño="";
        marca="";
        matricula="";
        siguiente=null;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public NodoDeLista getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDeLista siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
