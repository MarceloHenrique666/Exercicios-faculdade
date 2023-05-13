package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

import util.Contas;

public class Program {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
                
                int conta = 0;
                double x = 0, y = 0;
                
                
                try {
                    
                    
		System.out.println("Digite um número: ");
		 x = sc.nextDouble();
		
		System.out.println("digite auqi outro número: ");
		 y = sc.nextDouble();
		
                
                
		sc.nextLine();

		
		
                } catch (InputMismatchException e) {
                       //System.out.println("Valor inválido!! ");
                       
                JOptionPane.showMessageDialog(null , "Resposta inválida!! ");
		}
                
                
                try{
                    
                   System.out.println();
		System.out.println("Informe o tipo de operação você deseja fazer (digitar o número que representa: ");
		System.out.println("adicao (1) | subtracao (2) | multiplicacao (3) | divisao (4)");
		 conta = sc.nextInt();
                    
                 if (conta < 1 || conta > 4) {
				throw new InputMismatchException();
                 }
                 
                } catch (Exception e) {
                    
                    JOptionPane.showMessageDialog(null , "Resposta inválida!! ");
                    
                }
               
                
		Contas contas = new Contas();
		

		if (conta == 1 ) {
			System.out.println(contas.somar(x, y));
		} else if (conta == 2) {
			System.out.println(contas.subtrair(x, y));
		} else if (conta == 3) {
			System.out.println(contas.multiplicar(x, y));
		} else if (conta == 4){
			System.out.println(contas.dividir(x, y));
		}
		
		
		sc.close();
		
	}
	
	

}
