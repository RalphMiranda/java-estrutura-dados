package br.com.ralph.tw.estruturadados.vetor;

public class Vetor<T>{

    private Object[] elementos;

    public Vetor(int posicoes) {
        this.elementos = new Object[posicoes];
    }

    public void inserirEm(int posicao, T elemento) {
        this.elementos[posicao] = elemento;
    }

    @SuppressWarnings("unchecked")
    public T recuperar(int posicao) {
        return (T)this.elementos[posicao];
    }

}
