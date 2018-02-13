package aco_practica1;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ACO_Practica1 {

    public static void main(String[] args) {
        
        System.out.println("===== CASO 1 ======");
        Path path = Paths.get("grafo1.txt");
        Grafo g1 = new Grafo(path);
        Kruskal kruskal = new Kruskal(g1);
        Grafo result = kruskal.execMST();
        System.out.println("===== RESULTADO ======");
        kruskal.mostrarConjuntos(result.getnNodos());
        result.mostrarGrafo();
        
        System.out.println("===== CASO 2 ======");
        path = Paths.get("grafo2.txt");
        Grafo g2 = new Grafo(path);
        Kruskal kruskal2 = new Kruskal(g2);
        result = kruskal2.execMST();
        System.out.println("===== RESULTADO ======");
        kruskal2.mostrarConjuntos(result.getnNodos());
        result.mostrarGrafo();
        
        System.out.println("===== CASO 3 ======");
        path = Paths.get("grafo3.txt");
        Grafo g3 = new Grafo(path);
        Kruskal kruskal3 = new Kruskal(g3);
        result = kruskal3.execMST();
        System.out.println("===== RESULTADO ======");
        kruskal3.mostrarConjuntos(result.getnNodos());
        result.mostrarGrafo();
    }
    
}
