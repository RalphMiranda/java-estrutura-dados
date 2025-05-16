package br.com.ralph.tw.estruturadados.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.ralph.tw.estruturadados.modelos.Pessoa;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;
        
        do {
            System.out.println("\n --------- \n");
            System.out.println("1. Gerenciamento de memória");
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
    }
}
