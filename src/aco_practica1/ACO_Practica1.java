package aco_practica1;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ACO_Practica1 {

    public static void main(String[] args) {
        
        System.out.println("===== CASO 1: GENERAL ======");
        Path path = Paths.get("grafo1.txt");
        Grafo g1 = new Grafo(path);
        Kruskal kruskal = new Kruskal(g1);
        Grafo result = kruskal.execMST();
        System.out.println("===== RESULTADO ======");
        kruskal.mostrarConjuntos(result.getnNodos());
        result.mostrarGrafo();
        
        System.out.println("===== CASO 2: GRAFO CON CAMINOS PARALELOS ======");
        path = Paths.get("grafo2.txt");
        Grafo g2 = new Grafo(path);
        Kruskal kruskal2 = new Kruskal(g2);
        result = kruskal2.execMST();
        System.out.println("===== RESULTADO ======");
        kruskal2.mostrarConjuntos(result.getnNodos());
        result.mostrarGrafo();
        
        System.out.println("===== CASO 3: GRAFO INCOMPLETO ======");
        path = Paths.get("grafo3.txt");
        Grafo g3 = new Grafo(path);
        Kruskal kruskal3 = new Kruskal(g3);
        result = kruskal3.execMST();
        System.out.println("===== RESULTADO ======");
        kruskal3.mostrarConjuntos(result.getnNodos());
        result.mostrarGrafo();
        
        System.out.println("===== CASO 4: GRAFO COMPLETO ======");
        path = Paths.get("grafo4.txt");
        Grafo g4 = new Grafo(path);
        Kruskal kruskal4 = new Kruskal(g4);
        result = kruskal4.execMST();
        System.out.println("===== RESULTADO ======");
        kruskal4.mostrarConjuntos(result.getnNodos());
        result.mostrarGrafo();
        
        System.out.println("===== CASO 5: GRAFO COMPLETO CON BUCLES ======");
        path = Paths.get("grafo5.txt");
        Grafo g5 = new Grafo(path);
        Kruskal kruskal5 = new Kruskal(g5);
        result = kruskal5.execMST();
        System.out.println("===== RESULTADO ======");
        kruskal5.mostrarConjuntos(result.getnNodos());
        result.mostrarGrafo();
    }
    
}
