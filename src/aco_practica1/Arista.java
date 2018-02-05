/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aco_practica1;

/**
 *
 * @author usuario
 */
class Arista {
   
    private Nodo next;
    private int peso;

    public Arista(Nodo next, int peso) {
        this.next = next;
        this.peso = peso;
    }

    public Nodo getNext() {
        return next;
    }

    public int getPeso() {
        return peso;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return " voy a Nodo " + next + ", con peso " + peso;
    }
    
    
}
