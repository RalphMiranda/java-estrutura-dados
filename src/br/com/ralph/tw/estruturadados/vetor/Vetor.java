package br.com.ralph.tw.estruturadados.vetor;

public class Vetor<T>{

    private Object[] elementos;
    private int posicao;

    public Vetor(int posicoes) {
        this.elementos = new Object[posicoes];
        posicao = 0;
    }

    public Vetor() {
        this.elementos = new Object[3];
        posicao = 0;
    }

    public void inserir(T elemento) {
        this.elementos[this.posicao] = elemento;
        posicao++;
    }

    public void inserirEm(int posicao, T elemento) {
        if (posicao > elementos.length-1) {
            throw new IllegalArgumentException(String.format("Posição [%d] inválida para o Vetor de tamanho %d",  posicao, elementos.length));
        }
        this.elementos[posicao] = elemento;
    }

    @SuppressWarnings("unchecked")
    public T recuperar(int posicao) {
        return (T)this.elementos[posicao];
    }

}
