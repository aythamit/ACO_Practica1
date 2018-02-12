package aco_practica1;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ACO_Practica1 {

    public static void main(String[] args) {
        
        /*Path path = Paths.get("grafo1.txt");
        Grafo g1 = new Grafo(path);
        Kruskal kurskal = new Kruskal(g1);
        Grafo result1 = kurskal.execMST();
        System.out.println("===== RESULTADO ======");
        result1.mostrarGrafo();*/
        
        Path path = Paths.get("grafo2.txt");
        Grafo g2 = new Grafo(path);
        Kruskal kurskal2 = new Kruskal(g2);
        Grafo result2 = kurskal2.execMST();
        System.out.println("===== RESULTADO ======");
        result2.mostrarGrafo();
    }
    
}
