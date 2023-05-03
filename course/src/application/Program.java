package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Triangule;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		
		Triangule x, y;
		x = new Triangule();
		y = new Triangule();
		
		System.out.println("Enter the measures of triangule X: ");
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
System.out.println("Enter the measures of triangule Y: ");
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.area();
		
		double areaY = y.area();
		
		System.out.printf("Triangule X area: %.4f%n", areaX);
		System.out.printf("Triangule Y area: %.4f%n", areaY);
		
		if (areaX > areaX){
			System.out.println("Larger area: X");
		}
		else {
			System.out.println("Larger area: Y");
		}
		
	
		sc.close();
	}
	

}
