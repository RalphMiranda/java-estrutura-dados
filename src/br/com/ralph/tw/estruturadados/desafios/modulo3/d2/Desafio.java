package br.com.ralph.tw.estruturadados.desafios.modulo3.d2;

/* Defina a classe genérica Imprimir, que implemente um método exibiArray, que exibe o conteúdo do array de acordo com o tipo da classe.

Entrada de dados

1, 2, 3
"Olá", "Mundo"
Saída esperada

1
2
3
Olá
Mundo
Obs: Devido a limitações, a classe não pode ser pública. */
public class Desafio {

    public static void main(String[] args) {
        Imprimir<Integer> imprimirInt = new Imprimir<Integer>();
        Integer[] arrayInteger = {1, 2, 3};
        imprimirInt.exibiArray(arrayInteger);

        Imprimir<String> imprimirString = new Imprimir<String>();
        String[] arrayString = {"Olá", "Mundo"};
        imprimirString.exibiArray(arrayString);
    }

}

class Imprimir<T> {
    public void exibiArray(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
