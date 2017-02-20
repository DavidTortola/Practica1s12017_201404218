/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaCircular;

/**
 *
 * @author David Tórtola
 */
public class NodoSimple {

    //DECLARACIÓN DE VARIABLES
    private Object valor;
    private NodoSimple siguiente;

    //CONSTRUCTOR
    public void NodoSimple() {
        this.setValor(null);
        this.setSiguiente(null);
    }

    /**
     * @return the valor
     */
    public Object getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Object valor) {
        this.valor = valor;
    }

    /**
     * @return the siguiente
     */
    public NodoSimple getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoSimple siguiente) {
        this.siguiente = siguiente;
    }
    
}
