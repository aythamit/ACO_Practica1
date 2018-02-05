
package aco_practica1;

import java.util.Set;

    public class Nodo{
      
      
      private int idNodo;
      private Set<Arista> arista;

    public Nodo(int idNodo) {
        this.idNodo = idNodo;
        //this.arista = arista;
    }

    public int getIdNodo() {
        return idNodo;
    }

    public Set<Arista> getArista() {
        return arista;
    }

    public void setIdNodo(int idNodo) {
        this.idNodo = idNodo;
    }

    public void setArista(Set<Arista> arista) {
        this.arista = arista;
    }

    @Override
    public String toString() {
        String aux="Soy Nodo: " + idNodo;
        for(Arista it : arista){
            aux += it.toString() + " \n";
        }
        return aux;
    }
    
    
    
    };
