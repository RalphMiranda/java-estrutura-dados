package br.com.ralph.tw.estruturadados.main;

import java.util.Scanner;

import br.com.ralph.tw.estruturadados.modelos.Pessoa;
import br.com.ralph.tw.estruturadados.vetor.Vetor;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;
        
        do {
            System.out.println("\n --------- \n");
            System.out.println("1. Gerenciamento de memória");
            System.out.println("2. Vetor");
            System.out.println("0. Sair");
            System.out.print("Selecione uma opção: ");
            try {
                opcao = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                opcao = -1;
            }
            
            switch (opcao) {
                case 1:
                    fazerGerenciamentoDeMemoria();
                    break;
                case 2:
                    fazerVetor();
                    break;

                case 0: break;
            
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            
        } while (opcao != 0);

        scanner.close();
    }

    private static void fazerGerenciamentoDeMemoria() {
        System.out.println(" --- Gerenciamento de memória --- ");
        int a = 3;
        System.out.println(String.format("a: %d", a));
        int b = a;
        System.out.println(String.format("b: %d", b));
        System.out.println(" ----- ");
        System.out.println(String.format("a: %d", a));
        b = 2;
        System.out.println(String.format("b: %d", b));
        System.out.println(String.format("a == b: %b", a == b));

        System.out.println(" ***** ");

        Pessoa p1 = new Pessoa(1, "José");
        System.out.println(String.format("p1: %s: ", p1));
        Pessoa p2 = p1;
        System.out.println(String.format("p2: %s: ", p2));
        System.out.println(" ----- ");
        p2.setNome("João");
        System.out.println(String.format("p1: %s: ", p1));
        System.out.println(String.format("p2: %s: ", p2));
        System.out.println(String.format("p1 == p2: %b", p1 == p2));
        System.out.println(" ----- ");
        Pessoa p3 = new Pessoa(1, "José");
        System.out.println(String.format("p1: %s: ", p1));
        System.out.println(String.format("p3: %s: ", p3));
        System.out.println(String.format("p1 == p3: %b", p1 == p3));
        System.out.println(String.format("p1 equals p3: %b", p1.equals(p3)));
        System.out.println(" ----- ");
    }

    private static void fazerVetor() {
        System.out.println(" --- Vetor --- ");
        Pessoa[] vetorPessoas = new Pessoa[3];
        vetorPessoas[0] = new Pessoa(1, "José");
        System.out.println(String.format("vetorPessoas[0].getNome(): %s ",vetorPessoas[0].getNome()));
        //System.out.println(String.format("vetorPessoas[1].getNome(): %s ",vetorPessoas[1].getNome())); // NullPointerException
        System.out.println(" ----- ");
        int[] inteiros = new int[3];
        System.out.println(String.format("inteiros[0]: %s", inteiros[0])); // 0
        //System.out.println(String.format("inteiros[4]: %s", inteiros[4])); // java.lang.ArrayIndexOutOfBoundsException
        System.out.println(" ----- ");
        Vetor vetor = new Vetor(3);
        vetor.inserirEm(0, new Pessoa(1,"José"));
        System.out.println(String.format("vetor.recuperar(0): %s", vetor.recuperar(0)));
        System.out.println(String.format("vetor.recuperar(4): %s", vetor.recuperar(4)));
    }
}
