/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Grafos;

/**
 *
 * @author SebasCarlosama
 */
public class Arista {

    private double peso;
    private Vertice desde;
    private Vertice hasta;

    /**
     * Constructor 1. Con peso.
     *
     * @param peso
     * @param desde
     * @param hasta
     */
    public Arista(double peso, Vertice desde, Vertice hasta) {
        this.peso = peso;
        this.desde = desde;
        this.hasta = hasta;
    }

    /**
     * Constructor 1. Sin peso.
     *
     * @param desde
     * @param hasta
     */
    public Arista(Vertice desde, Vertice hasta) {
        this.peso = 0;
        this.desde = desde;
        this.hasta = hasta;
    }

    /**
     * Propiedades Get y Set de los atributos
     */
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Vertice getDesde() {
        return desde;
    }

    public void setDesde(Vertice desde) {
        this.desde = desde;
    }

    public Vertice getHasta() {
        return hasta;
    }

    public void setHasta(Vertice hasta) {
        this.hasta = hasta;
    }

    /**
     * Metodo toString para impirmir el estado del objeto
     *
     * @return retorna una cade con informacion del estado del objeto.
     */
    @Override
    public String toString() {
        return "Arista { " + desde.getNombre() + " ---(" + peso + ")---> " + hasta.getNombre() + '}';
    }

}
