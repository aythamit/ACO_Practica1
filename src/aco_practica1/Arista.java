package aco_practica1;

public class Arista {

    private int nodoInicial;
    private int nodoSiguiente;
    private int peso;

    public Arista(int nodoInicial, int nodoSiguiente, int peso) {
        this.nodoInicial = nodoInicial;
        this.nodoSiguiente = nodoSiguiente;
        this.peso = peso;
    }

    public int getNodoInicial() {
        return nodoInicial;
    }

    public int getNodoSiguiente() {
        return nodoSiguiente;
    }

    public int getPeso() {
        return peso;
    }

    public void setNodoInicial(int nodoInicial) {
        this.nodoInicial = nodoInicial;
    }

    public void setNodoSiguiente(int nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
