/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aco_practica1;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author usuario
 */
public class ACO_Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Path path = Paths.get("grafo1.txt");
        Grafo g1 = new Grafo(path);
    }
    
}