package aco_practica1;

import java.util.Comparator;

public class Kruskal {
    private int[] conjunto;
    private Grafo grafo;

    public Kruskal(Grafo grafo) {
        this.grafo = grafo;
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
    
    public void mostrarAristas() {
        for (Arista arista : grafo.getAristas()) {
            System.out.println("Soy el nodo " + arista.getNodoInicial() + " voy a " 
                    + arista.getNodoSiguiente() + " con peso " + arista.getPeso());
        }
    }
    
    public Grafo execMST() {
        ordenarAristas();
        mostrarAristas();
        int nNodos = grafo.getnNodos();
        Grafo mst = new Grafo();
        inicializarConjunto();
        return mst;
    }
}
