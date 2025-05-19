package br.com.ralph.tw.estruturadados.desafios.modulo3.d1;

import java.util.Scanner;

/* O código abaixo, executa a seguinte ação:

Lê do console um valor inteiro e salva em uma variável n;
Exibe o conteúdo de um array a.
O seu objetivo é adicionar no trecho de código liberado, as seguintes ações:

Criação de um array a, para n elementos;
Lê no console n valores inteiros e atribuí-los ao array a, seguindo a sequência natural do array. Ou seja, o primeiro valor lido deve ser atribuído ao elemento de índice 0 e assim por diante.
Entrada de dados

5
10
20
30
40
50
Saída esperada

10
20
30
40
50 */
public class Desafio {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        scan.close();

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
