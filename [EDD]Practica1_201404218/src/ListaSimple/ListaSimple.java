/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaSimple;

/**
 *
 * @author David Tórtola
 */
public class ListaSimple {

    private NodoSimple inicio;
    private int tamaño;

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

    //Agrega un nodo al final de la lista
    public void add(Object valor) {
        NodoSimple nuevo = new NodoSimple();
        nuevo.setValor(valor);

        if (isEmpty()) {
            inicio = nuevo;
        } else {
            NodoSimple auxiliar = inicio;
            while (auxiliar.getSiguiente() != null) {
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo);
        }
        tamaño++;
    }

    public void agregarAlInicio(Object valor) {
        NodoSimple nuevo = new NodoSimple();
        nuevo.setValor(valor);

        if (isEmpty()) {
            inicio = nuevo;
        } else {
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
            while (aux != null) {

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
        while (aux != null && match != true) {
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
