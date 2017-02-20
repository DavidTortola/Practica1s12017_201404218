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
public class ListaCircular {

    private int tamaño;
    private NodoSimple inicio;
    private NodoSimple fin;

    public void ListaSimple() {
        this.setInicio(null);
        this.setTamaño(0);
    }

    //Devuelve true si la lista está vacía
    public boolean isEmpty() {
        if (this.getInicio() == null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @return the tamaño
     */
    public int getTamaño() {
        return tamaño;
    }

    /**
     * @param tamaño the tamaño to set
     */
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    /**
     * @return the inicio
     */
    public NodoSimple getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(NodoSimple inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the fin
     */
    public NodoSimple getFin() {
        return fin;
    }

    /**
     * @param fin the fin to set
     */
    public void setFin(NodoSimple fin) {
        this.fin = fin;
    }

    //Agrega un nodo al final de la lista
    public void add(Object valor) {

        NodoSimple nuevo = new NodoSimple();
        nuevo.setValor(valor);

        if (isEmpty()) {
            inicio = nuevo;
            inicio.setSiguiente(inicio);
        } else {

            NodoSimple auxiliar = inicio;

            while (auxiliar.getSiguiente() != inicio) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
            nuevo.setSiguiente(inicio);
        }
        tamaño++;
    }

    public void agregarAlInicio(Object valor) {

        NodoSimple nuevo = new NodoSimple();
        nuevo.setValor(valor);

        if (isEmpty()) {
            inicio = nuevo;
            inicio.setSiguiente(inicio);
        } else {

            NodoSimple auxiliar = inicio;

            while (auxiliar.getSiguiente() != inicio) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        tamaño++;
    }

    public void borrarLista() {
        inicio = null;
        tamaño = 0;
    }

    //Imprime en consola el valor de la lista
    public void imprimirLista() {

        if (!isEmpty()) {

            NodoSimple aux = inicio;
            int index = 0;
            System.out.println("Los elementos en la lista son: ");
            while (aux.getSiguiente() != inicio) {

                System.out.println(index + ".- " + aux.getValor().toString());
                aux = aux.getSiguiente();
                index++;

            }
        }
    }

    //Busca en la lista un valor
    public boolean buscar(Object valor) {
        NodoSimple aux = inicio;

        boolean match = false;

        if (valor == aux.getValor()) {
            match = true;
        } else {
            aux = aux.getSiguiente();
        }

        while (aux != inicio && match != true) {
            if (valor == aux.getValor()) {
                match = true;
            } else {
                aux = aux.getSiguiente();
            }
        }
        return match;
    }

    //Obtiene la posición de un objeto por referencia
    public int getPosicion(Object valor) throws Exception {
        if (buscar(valor)) {
            NodoSimple aux = inicio;
            int contador = 0;
            while (valor != aux.getValor()) {
                contador++;
                aux = aux.getSiguiente();
            }
            return contador;
        } else {
            throw new Exception("El valor no existe en la lista.");
        }
    }
    
        //Devuelve el valor de la posición que recibe
    public Object getValor(int posicion) throws Exception {
        if (posicion >= 0 && posicion < tamaño) {
            if (posicion == 0) {
                return inicio.getValor();
            } else {
                NodoSimple aux = inicio;
                for (int index = 0; index < posicion; index++) {
                    aux = aux.getSiguiente();
                }

                return aux.getValor();

            }
        } else {
            throw new Exception("Posicion no existe en la lista.");
        }
    }
    

}
