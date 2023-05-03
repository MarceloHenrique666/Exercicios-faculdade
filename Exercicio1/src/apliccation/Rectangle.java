package apliccation;

import java.util.Scanner;

import entites.Operacoes;

public class Rectangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Operacoes operacoes = new Operacoes();
		
		
		System.out.println("Enter values for witdh: ");
		double width = sc.nextDouble();
		
		System.out.println("Enter values for height: ");
		double height = sc.nextDouble();
		
		System.out.println("Area: " + operacoes.Area(width, height));
		System.out.println("Perímetro: " + operacoes.Perimetro(width, height));
		System.out.println("Diagonal: " + operacoes.Diagonal(width, height));
		

		
		sc.close();

	}

}
