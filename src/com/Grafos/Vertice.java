/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Grafos;

/**
 *
 * @author SebasCarlosama
 */
public class Vertice {

    private String nombre;
    private int posicion;
    private Etiqueta etiqueta;



    public Vertice(String nombre) {

        this.nombre = nombre;
        this.posicion = -1;
        etiqueta=null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean equals(Vertice vertice) { //true si 2 vertices son iguales
        return nombre.equals(vertice.nombre);
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
        public Etiqueta getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(Etiqueta etiqueta) {
        this.etiqueta = etiqueta;
    }

    @Override
    public String toString() {
        return "Vertice{" + " nombre:" + nombre + ", posicion:" + posicion +", etiqueta "+etiqueta.toString()+ '}';
    }

}
