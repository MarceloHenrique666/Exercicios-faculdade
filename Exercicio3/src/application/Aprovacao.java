package application;

import java.util.Scanner;

import entities.Aluno;

public class Aprovacao {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Digite aqui o seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Entre com a primeira nota: ");
		double nota1 = sc.nextDouble();
		
		System.out.println("Entre com a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		System.out.println("Entre com a terceira nota: ");
		double nota3 = sc.nextDouble();
		
		System.out.println("Nota final: " + Aluno.notaFinal(nota1, nota2, nota3));
		
		if (Aluno.notaFinal(nota1, nota2, nota3) > 60 ) {
			
			System.out.println("Aprovado! ");
		} else {
			
			System.out.println("Você foi reprovado! ");
		}
		
		
		sc.close();

	}

}
