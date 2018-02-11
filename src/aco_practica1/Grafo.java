package aco_practica1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Grafo {

    private int nNodos;
    private int[][] pesos;
    private ArrayList<Arista> aristas;

    public Grafo(Path path) {
        aristas = new ArrayList<>();
        try {
            BufferedReader br = Files.newBufferedReader(path, Charset.forName("UTF-8"));
            String line;
            line = br.readLine();
            nNodos = Integer.parseInt(line);
            initializeNodes();
            while ((line = br.readLine()) != null) {
                String param[] = line.split(" ");
                int nodoInicial = Integer.parseInt(param[0]) - 1;
                int nodoFinal = Integer.parseInt(param[1]) - 1;
                int peso = Integer.parseInt(param[2]);
                pesos[nodoInicial][nodoFinal] = peso;
                pesos[nodoFinal][nodoInicial] = peso;
            }
        } catch (IOException ex) {
            Logger.getLogger(Grafo.class.getName()).log(Level.SEVERE, null, ex);
        }
        mostrarGrafo();
        construirAristas();
    }

    public Grafo() {
        nNodos = 0;
        aristas = new ArrayList<>();
        initializeNodes();
    }
    

    private void initializeNodes() {
        pesos = new int[nNodos][nNodos];
        for (int i = 0; i < nNodos; i++) {
            for (int j = 0; j < nNodos; j++) {
                pesos[i][j] = -1;
            }
        }

    }

    public int[][] getMatrizPesos() {
        return pesos;
    }

    public ArrayList<Arista> getAristas() {
        return aristas;
    }

    public void mostrarGrafo() {
        for (int i = 0; i < nNodos; i++) {
            for (int j = 0; j < nNodos; j++) {
                if (pesos[i][j] >= 0) {
                    System.out.println("Del nodo " + (i + 1) + " voy al nodo " + (j + 1) + " con peso " + pesos[i][j] + " \n");
                }
            }
        }
    }

    private void construirAristas() {
        for (int i = 0; i < nNodos; i++) {
            for (int j = 0; j < i; j++) {
                if (pesos[i][j] >= 0) {
                    aristas.add(new Arista(i, j, pesos[i][j]));
                }
            }
        }
    }

    public int getnNodos() {
        return nNodos;
    }
}
