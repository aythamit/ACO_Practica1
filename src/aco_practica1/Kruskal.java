package aco_practica1;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Kruskal {
    private int[] conjunto;
    private Grafo grafo;
    private int[] pesos;

    public Kruskal(Grafo grafo, int[] pesos) {
        this.grafo = grafo;
        this.pesos = pesos;
    }
    
    private void ordenarAristas() {
         grafo.getAristas().sort(new Comparator<Arista>() {
             @Override
             public int compare(Arista a1, Arista a2) {
                 return a1.getPeso() - a2.getPeso();
             }
         });
    }
    
    private void inicializarConjunto() {
        conjunto = new int[grafo.getnNodos()];
        for (int i = 0; i < grafo.getnNodos(); i++) {
            conjunto[i] = 0;
        }
    }
}
