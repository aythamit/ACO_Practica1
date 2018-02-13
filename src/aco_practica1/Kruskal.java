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
            conjunto[i] = -1;
        }
    }
    
    private int buscar(int v) {
        int i = v - 1;
        while (conjunto[i] > -1) {
            i = conjunto[i];
        }
        return i;
    }
    
    private void fusionar(int a, int b) {
        if(conjunto[a] == conjunto[b]) {
            conjunto[a] -= 1;
            conjunto[b] = a;
        } else {
            if(conjunto[a] < conjunto[b]) {
                conjunto[b] = a;
            }else {
                conjunto[a] = b;
            }
        }
    }
    
    public Grafo execMST() {
        ordenarAristas();
        System.out.println("GRAFO ORDENADO : ");
        grafo.mostrarGrafo();
        int nNodos = grafo.getnNodos();
        Grafo mst = new Grafo(nNodos);
        inicializarConjunto();
        
        while(mst.getAristas().size() < mst.getnNodos() - 1 
                && ! grafo.getAristas().isEmpty()) {
            Arista arista = grafo.getAristas().get(0);
            grafo.getAristas().remove(0);
            
            int uconj = buscar(arista.getNodoInicial());
            int vconj = buscar(arista.getNodoSiguiente());
            if(uconj != vconj) {
                fusionar(uconj, vconj);
                mst.setAristas(arista.getNodoInicial(), arista.getNodoSiguiente(), 
                        arista.getPeso());
            }
        }
        for (int i : conjunto) {
            System.out.println(i);
        }
        return mst;
    }
}

