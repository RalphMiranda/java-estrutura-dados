package br.com.ralph.tw.estruturadados.vetor;

import java.util.Arrays;

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
        if (this.posicao >= this.elementos.length) {
            this.elementos = Arrays.copyOf(this.elementos, this.elementos.length+1);
        }
        this.elementos[this.posicao] = elemento;
        posicao++;
    }

    public void inserirEm(int posicao, T elemento) {
        if (posicao > elementos.length-1) {
            throw new IllegalArgumentException(String.format("Posição [%d] inválida para o Vetor de tamanho %d",  posicao, elementos.length));
        }

        if (this.elementos[posicao] != null) {
            Object[] arrayFinal = Arrays.copyOfRange(this.elementos, posicao, this.elementos.length);
            Object[] arrayInicio = new Object[posicao + 1];

            System.arraycopy(this.elementos, 0, arrayInicio, 0, posicao);
            arrayInicio[posicao] = elemento;

            int novoTamanho = arrayFinal.length + arrayInicio.length;
            this.elementos = new Object[novoTamanho];
            System.arraycopy(arrayInicio, 0, this.elementos, 0, arrayInicio.length);
            System.arraycopy(arrayFinal, 0, this.elementos, arrayInicio.length, arrayFinal.length);
        } else { 
            this.elementos[posicao] = elemento;
        }
    }

    @SuppressWarnings("unchecked")
    public T recuperar(int posicao) {
        return (T)this.elementos[posicao];
    }

    @Override
    public String toString() {
        return "Vetor [elementos=" + Arrays.toString(elementos) + "]";
    }
}
