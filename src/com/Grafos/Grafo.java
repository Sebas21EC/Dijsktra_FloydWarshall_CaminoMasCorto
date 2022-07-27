/**
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Grafos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SebasCarlosama
 */
public class Grafo {

    private int[][] matriz_adyacencia;
    private double[][] matriz_peso;
    private int numero_vertices;
    private List<Vertice> lista_vertices;
    private List<Arista> lista_aristas;

    public Grafo(int numero_vertices) {
        matriz_adyacencia = new int[numero_vertices][numero_vertices];
        matriz_peso = new double[numero_vertices][numero_vertices];
        for (int i = 0; i < numero_vertices; i++) {
            for (int j = 0; j < numero_vertices; j++) {
                matriz_adyacencia[i][j] = 0;
                matriz_peso[i][j] = 0;
            }
        }
        for (int i = 0; i < numero_vertices; i++) {
            for (int j = 0; j < numero_vertices; j++) {
                if (j != i) {
                    matriz_peso[i][j] = 999999;
                }
            }
        }
        this.numero_vertices = 0;
        lista_aristas = new ArrayList<Arista>(numero_vertices * 2);
        lista_vertices = new ArrayList<Vertice>(numero_vertices);
    }

    public int[][] getMatriz_adyacencia() {
        return matriz_adyacencia;
    }

    public void setMatriz_adyacencia(int[][] matriz_adyacencia) {
        this.matriz_adyacencia = matriz_adyacencia;
    }

    public double[][] getMatriz_peso() {
        return matriz_peso;
    }

    public void setMatriz_peso(double[][] matriz_peso) {
        this.matriz_peso = matriz_peso;
    }

    public int getNumero_vertices() {
        return numero_vertices;
    }

    public void setNumero_vertices(int numero_vertices) {
        this.numero_vertices = numero_vertices;
    }

    public List<Vertice> getLista_vertices() {
        return lista_vertices;
    }

    public void setLista_vertices(List<Vertice> lista_vertices) {
        this.lista_vertices = lista_vertices;
    }

    public List<Arista> getLista_aristas() {
        return lista_aristas;
    }

    public void setLista_aristas(List<Arista> lista_aristas) {
        this.lista_aristas = lista_aristas;
    }

    public Vertice Buscar_vertice(String nombre_vertice) {

        for (int i = 0; i < numero_vertices; i++) {
            if ((lista_vertices.get(i).getNombre()).equals(nombre_vertice)) {
                return lista_vertices.get(i);
            }
        }
        return null;
    }

    public String Agregar_vertice(String nombre) {
        if (numero_vertices == matriz_adyacencia[0].length) {
            return "Ya no se puede seguir ingresando más vértices";
        }

        if (Buscar_vertice(nombre) == null) {
            Vertice vertice_nuevo = new Vertice(nombre);
            vertice_nuevo.setPosicion(numero_vertices);
            lista_vertices.add(vertice_nuevo);
            vertice_nuevo.setEtiqueta(new Etiqueta(vertice_nuevo));
            numero_vertices++;
            return "Vértice " + nombre + " ingresado correcto";
        } else {
            return "No se logro ingresar.\nYa existe un vertice con ese nombre.";
        }
    }

    public String Agregar_arista(String origen, String destino, double peso) {

        if (destino.equals(origen)) {
            return "No se pueden relacionar a si mismo";
        } else {

            Vertice vertice_origen = Buscar_vertice(origen);
            Vertice vertice_destino = Buscar_vertice(destino);
            if (vertice_origen == null || vertice_destino == null) {

                if (vertice_origen == null && vertice_destino == null) {
                    return "El vertice origen y destino no existe";
                } else {
                    if (vertice_origen == null) {
                        return "El vertice origen no existe";
                    } else {
                        return "El vertice destino no existe";
                    }
                }

            } else {

                if (matriz_adyacencia[vertice_origen.getPosicion()][vertice_destino.getPosicion()] == 1) {
                    return "Esta arista ya ha sido creada";
                } else {
                    if (vertice_destino == this.lista_vertices.get(0)) {
                        this.lista_vertices.get(0).getEtiqueta().setAntecesor(vertice_origen);
                        // this.lista_vertices.get(0).getEtiqueta().setIteracion(99999);
                    }
                    vertice_destino.getEtiqueta().setAntecesor(vertice_origen);
                    vertice_destino.getEtiqueta().setIteracion(0);
                    matriz_adyacencia[vertice_origen.getPosicion()][vertice_destino.getPosicion()] = 1;
                    matriz_peso[vertice_origen.getPosicion()][vertice_destino.getPosicion()] = peso;
                    Arista ari = new Arista(peso, vertice_origen, vertice_destino);
                    lista_aristas.add(ari);
                    return ari.toString() + " Ingresada correctamente";
                }
            }
        }
    }

    public String Visitar_vertices() {
        String respuesta = "";
        for (int i = 0; i < numero_vertices; i++) {
            respuesta += lista_vertices.get(i).toString() + "\n";
        }
        return respuesta;
    }

    public String Visitar_aristas() {
        String respuesta = "";
        for (int i = 0; i < lista_aristas.size(); i++) {
            System.out.println("");
            respuesta += lista_aristas.get(i).toString() + "\n";
        }
        return respuesta;
    }

    public String Visitar_matriz_adyacencia() {
        String respuesta = "origen\\destino\t";
        for (int i = 0; i < matriz_adyacencia[0].length; i++) {
            respuesta += (char) (65 + i) + "\t";
        }
        respuesta += "\n";
        for (int m = 0; m < matriz_adyacencia.length; m++) {
            respuesta += (char) (65 + m) + "\t";
            for (int n = 0; n < matriz_adyacencia.length; n++) {
                respuesta += matriz_adyacencia[m][n] + "\t";
            }
            respuesta += "\n";
        }
        return respuesta;
    }

    public String Visitar_matriz_peso() {
        String respuesta = "origen'\'destino\t";
        for (int i = 0; i < matriz_peso[0].length; i++) {
            respuesta += (char) (65 + i) + "\t";
        }
        respuesta += "\n";
        for (int m = 0; m < matriz_peso.length; m++) {
            respuesta += (char) (65 + m) + "\t";
            for (int n = 0; n < matriz_peso.length; n++) {
                respuesta += matriz_peso[m][n] + "\t";
            }
            respuesta += "\n";
        }
        return respuesta;
    }

    public String Algoritmo_dijkstra(Vertice raiz) {

        for (Vertice v : this.getLista_vertices()) {

            for (Arista lista_arista : this.getLista_aristas()) {
                if (v.getEtiqueta().getActual() == lista_arista.getHasta()) {
                    v.getEtiqueta().setAntecesor(lista_arista.getDesde());
                    v.getEtiqueta().setIteracion(999999);
                    v.getEtiqueta().setPermanente(false);
                    break;
                }/* else {
                    v.getEtiqueta().setAntecesor(null);
                    v.getEtiqueta().setIteracion(0);
                }*/

            }
            // System.out.println("for a");
        }

        raiz.getEtiqueta().setAntecesor(null);
        raiz.getEtiqueta().setIteracion(0);
        int tamanio = this.getLista_vertices().size();
        Cola cola = new Cola(tamanio);
        cola.Encolar(raiz.getEtiqueta());

        for (int i = 0; i < tamanio; i++) {
            if (raiz != this.getLista_vertices().get(i)) {
                cola.Encolar(this.getLista_vertices().get(i).getEtiqueta());
            }
        }

        cola = cola.Ordenar_cola(cola);
        Cola cola_solucion = new Cola(tamanio);
        Etiqueta auxiliar_1;
        double peso;
        while (!cola.Vacio()) {
            auxiliar_1 = (Etiqueta) cola.Desencolar();
            cola = cola.Ordenar_cola(cola);
            for (Arista a : this.getLista_aristas()) {
                if (a.getDesde() == auxiliar_1.getActual()) {
                    if (!a.getHasta().getEtiqueta().isPermanente()) {
                        peso = a.getHasta().getEtiqueta().getIteracion();
                        if (peso > (a.getPeso() + auxiliar_1.getIteracion())) {
                            a.getHasta().getEtiqueta().setIteracion(auxiliar_1.getIteracion() + a.getPeso());
                            a.getHasta().getEtiqueta().setAntecesor(auxiliar_1.getActual());
                        }
                    }
                }
            }
            auxiliar_1.getActual().getEtiqueta().setPermanente(true);
            cola_solucion.Encolar(auxiliar_1);
            cola = cola.Ordenar_cola(cola);

        }
        String r = "-- ";
        Vertice[] vertices = new Vertice[tamanio];
        Etiqueta e;
        int cont = 0;
        while (!cola_solucion.Vacio()) {
            e = ((Etiqueta) cola_solucion.Desencolar());
            vertices[cont++] = e.getActual();
            r += e.toString() + "\n";

        }

        Vertice v_auxiliar;
        String resultado = "";
        String recorrido = "";
        for (int i = 0; i < this.getNumero_vertices(); i++) {
            v_auxiliar = vertices[i];
            resultado += "{" + raiz.getNombre() + "-" + v_auxiliar.getNombre() + "} : ";
            while (v_auxiliar.getEtiqueta().getAntecesor() != null) {
                recorrido = " --> " + v_auxiliar.getNombre() + recorrido;
                v_auxiliar = v_auxiliar.getEtiqueta().getAntecesor();
            }
            resultado = resultado + raiz.getNombre() + recorrido;
            resultado += "\n";
            recorrido = "";
        }

        return r + "\nRecorrido:\n" + resultado;
    }

    public String Algoritmo_FloydWarshall() {
        int tamanio = lista_vertices.size();
        Vertice[][] matriz_vertice = new Vertice[tamanio][tamanio];
        double[][] matriz_distancias = this.matriz_peso.clone();
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                matriz_vertice[j][i] = this.getLista_vertices().get(i);
                //matriz_vertice[j][i].setPosicion(i);
                //.out.print(matriz_vertice[j][i].getNombre() + "\t");
            }
            // System.out.println("");
        }

        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                for (int k = 0; k < tamanio; k++) {
                    if (matriz_distancias[j][k] > matriz_distancias[i][k] + matriz_distancias[j][i]) {
                        matriz_distancias[j][k] = matriz_distancias[i][k] + matriz_distancias[j][i];
                        matriz_vertice[j][k] = this.lista_vertices.get(i);
                    }
                }
            }
        }

        String cadena_matriz_distancias = "Matriz de distancias:\n";
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                cadena_matriz_distancias += matriz_distancias[i][j] + "\t";
                //System.out.print(matriz_vertice[i][j].getNombre() + "\t");
            }
           // System.out.println("");
            cadena_matriz_distancias += "\n";
        }

        String cadena_matriz_vertices = "\nMatriz vertices:\n";
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                cadena_matriz_vertices += matriz_vertice[i][j].getNombre() + "\t";
               // System.out.print(matriz_distancias[i][j] + "\t");
            }
            //System.out.println("");
            cadena_matriz_vertices += "\n";
        }

        //Imprimir recorridos.
        Vertice v_auxiliar;
        String recorrido = "\n";
        int auxiliar_j = 0;
        for (int i = 0; i < tamanio; i++) {
            //v_auxiliar=grafo.getLista_vertices().get(i);
            recorrido += "Recorrido para " + this.getLista_vertices().get(i).getNombre() + "\n";
            for (int j = 0; j < tamanio; j++) {
                auxiliar_j = j;
                recorrido += this.getLista_vertices().get(i).getNombre() + "-->";
                recorrido += this.getLista_vertices().get(j).getNombre() + " : ";
                v_auxiliar = matriz_vertice[i][j];
                recorrido += this.getLista_vertices().get(i).getNombre();
                while (!this.getLista_vertices().get(auxiliar_j).getNombre().equals(v_auxiliar.getNombre())) {
                    recorrido += "-" + v_auxiliar.getNombre();
                    v_auxiliar = matriz_vertice[i][v_auxiliar.getPosicion()];
                    // System.out.print(v_auxiliar.getNombre() + "-" + v_auxiliar.getPosicion());
                    // System.out.println(""); 
                    auxiliar_j = v_auxiliar.getPosicion();
                }
                if (matriz_distancias[i][j] < 99999) {
                    recorrido += "-" + this.getLista_vertices().get(j).getNombre();
                }
                recorrido += "\n";
                //System.out.println("salto");
            }
        }
        return cadena_matriz_distancias + cadena_matriz_vertices + recorrido;

    }

}
