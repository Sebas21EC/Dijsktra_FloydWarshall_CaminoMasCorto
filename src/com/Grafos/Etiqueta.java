/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Grafos;

/**
 *
 * @author SebasCarlosama
 */
public class Etiqueta {

    private double iteracion;
    private Vertice antecesor;
    private Vertice actual;
    private boolean permanente;

    public Etiqueta(Vertice actual) {
        this.actual = actual;
        iteracion = 0;
        antecesor = null;
        permanente = false;
    }

    public double getIteracion() {
        return iteracion;
    }

    public void setIteracion(double iteracion) {
        this.iteracion = iteracion;
    }

    public Vertice getAntecesor() {
        return antecesor;
    }

    public void setAntecesor(Vertice antecesor) {
        this.antecesor = antecesor;
    }

    public Vertice getActual() {
        return actual;
    }

    public void setActual(Vertice actual) {
        this.actual = actual;
    }

    public boolean isPermanente() {
        return permanente;
    }

    public void setPermanente(boolean permanente) {
        this.permanente = permanente;
    }

    @Override
    public String toString() {
        return actual.getNombre() + " : [" + (antecesor != null ? antecesor.getNombre() : "null") + "," + iteracion + "]";
    }

}
