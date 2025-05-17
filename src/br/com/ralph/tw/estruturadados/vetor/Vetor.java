package br.com.ralph.tw.estruturadados.vetor;

import br.com.ralph.tw.estruturadados.modelos.Pessoa;

public class Vetor {

    private Pessoa[] pessoas;

    public Vetor(int posicoes) {
        pessoas = new Pessoa[posicoes];
    }

    public void inserirEm(int posicao, Pessoa pessoa) {
        pessoas[posicao] = pessoa;
    }

    public Pessoa recuperar(int posicao) {
        return pessoas[posicao];
    }

}
