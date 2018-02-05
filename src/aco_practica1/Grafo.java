package aco_practica1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Grafo {
    
    private int nNodos;
    private Set<Nodo> nodos;

    public Grafo(Path path){
        

        try {
            BufferedReader br = Files.newBufferedReader(path, Charset.forName("UTF-8"));
            String line = null;
            line = br.readLine();
            nNodos = Integer.parseInt(line);
            nodos = new HashSet<>();
            while( (line = br.readLine()) != null){
                String param[] = line.split(" ");
                
                System.out.println("Soy " + param[0] + " voy a " + param[1] + " con peso " + param[2]);
            }
        } catch (IOException ex) {
            Logger.getLogger(Grafo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
}
