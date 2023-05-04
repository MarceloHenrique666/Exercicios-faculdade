package application;

import java.util.Scanner;

import util.ConversorMoeda;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ConversorMoeda conversor = new ConversorMoeda();
		
		System.out.println("Qual o valor do dólar? ");
		double valor = sc.nextDouble();
		
		System.out.println("Quantos dólares serão comprados? ");
		double quantidade = sc.nextDouble();
		
		System.out.println("Valor a ser pago em reais: " + conversor.converterMoeda(valor, quantidade));		
		
		sc.close();
		
		

	}

}
