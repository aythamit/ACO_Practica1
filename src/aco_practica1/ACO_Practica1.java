package aco_practica1;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ACO_Practica1 {

    public static void main(String[] args) {
        
        Path path = Paths.get("grafo1.txt");
        Grafo g1 = new Grafo(path);
        Kruskal kurskal = new Kruskal(g1);
        kurskal.execMST();
    }
    
}
