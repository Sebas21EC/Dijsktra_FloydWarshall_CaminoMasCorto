/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.Grafos;

/**
 *
 * @author SebasCarlosama
 */
public class Cola {

    private int tamanio_cola;
    private int numero_elementos;
    private int inicio;
    private int fin;
    private Object[] cola;

    public Cola(int tamanio) {
        this.cola = new Object[tamanio];
        this.tamanio_cola = tamanio;
        this.numero_elementos = 0;
        this.inicio = 0;
        this.fin = 0;
    }

    public int getNumeroElementos() {
        return numero_elementos;
    }

    public Object[] getCola() {
        return cola;
    }

    public void Encolar(Object objeto) {
        if (fin == tamanio_cola) {
            fin = 0;
        }
        cola[fin++] = objeto;
        numero_elementos++;

    }

    public Object Desencolar() {

        numero_elementos--;
        if (inicio == tamanio_cola) {
            inicio = 0;
        }

        return cola[inicio++];
    }

    public boolean Vacio() {
        return numero_elementos == 0;
    }

    public boolean Lleno() {
        return numero_elementos == tamanio_cola;
    }

    public Cola Ordenar_cola(Cola cola) {
        Cola cola_retorno = new Cola(cola.getNumeroElementos());
        Cola cola_aux = new Cola(cola.getNumeroElementos());
        Etiqueta e_menor;
        Etiqueta e_aux;

        while (!cola.Vacio()) {
            e_menor = (Etiqueta) cola.Desencolar();
            while (!cola.Vacio()) {
                e_aux = (Etiqueta) cola.Desencolar();
                if (e_menor.getIteracion() > e_aux.getIteracion()) {
                    cola_aux.Encolar(e_menor);
                    e_menor = e_aux;

                } else {
                    cola_aux.Encolar(e_aux);
                }
            }

            cola_retorno.Encolar(e_menor);
            while (!cola_aux.Vacio()) {
                cola.Encolar(cola_aux.Desencolar());
            }
        }
        return cola_retorno;
    }

}
