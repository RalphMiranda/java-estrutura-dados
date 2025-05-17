package br.com.ralph.tw.estruturadados.desafios;

import java.util.Scanner;

/* Defina uma classe chamada Aluno, que contenha os atributos encapsulados nome (texto) e matricula (inteiro) e que 
sobrescreva o método equals da classe Object, permitindo a comparação entre dois objetos da classe.

Entrada de dados

Carlos Silva
12345
Carlos Silva
12345
Saída esperada

true */
public class Desafio {

    public static void main(String []args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();

        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()) {
            a1.setNome(scanner.nextLine());
            a1.setMatricula(Integer.valueOf(scanner.nextLine()));
            
            a2.setNome(scanner.nextLine());
            a2.setMatricula(Integer.valueOf(scanner.nextLine()));
            
            System.out.println(a1.equals(a2));
        }

        scanner.close();
    }
}

class Aluno {
    private String nome;

    private int matricula;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}
