package apllication;

import java.util.Scanner;

import entites.Funcionarios;

public class Teste {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Funcionarios func = new Funcionarios();
		
		System.out.println("Digite aqui o seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite aqui o seu salário bruto: ");
		double salario = sc.nextDouble();
		
		System.out.println("Digite aqui a taxa: ");
		double taxa = sc.nextDouble();
		
		
		
		
		System.out.println(nome + ", " + func.salarioLiquido(salario, taxa));
		
		System.out.println("Digite aqui a porcentagem de aumento: ");
		double porcentagem = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("Salário atualizado: " + func.aumentoSalario(salario, porcentagem));
		
		sc.close();
		
		
	}

}
