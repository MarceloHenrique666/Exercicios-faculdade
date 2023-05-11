package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import util.Funcionario;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Funcionario> list = new ArrayList<>();

		System.out.println("Quantos funcionários serão cadastrados? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println();
			System.out.println("Funcionário #" + (i + 1) + ": ");

			System.out.print("Id: ");
			Integer id = sc.nextInt();
				while (hasId(list, id)) {
					System.out.println("Id já existe, tente novamente: ");
				}
			
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Salário: ");
			Double salario = sc.nextDouble();

			Funcionario func = new Funcionario(id, nome, salario);
			

			list.add(func);

		}
		 
		System.out.println();
		System.out.println("Entre com o id do funcionario que terá o salário aumentado: ");
		Integer idSalario = sc.nextInt();

		//Integer pos = positionId(list, idsalario);
		Funcionario func = list.stream().filter(x -> x.getId() == idSalario).findFirst().orElse(null);
		
		if (func /*pos */ == null) {
			System.out.println("Esse id não existe! ");
		} else {
			System.out.print("Entre com a porcentagem: ");
			double porcentagem = sc.nextDouble();
			func.aumentarSalario(porcentagem); /*
														 * Comando ultilizado para pegar a posição encontrada pelo
														 * método auxiliar e passar a função de aumentar salário
														 */
		}

		System.out.println();
		System.out.println("Lista de funcionários: ");

		for (Funcionario e : list) {
			System.out.println(e);
		}

		sc.close();

	}

	static Integer positionId(List<Funcionario> list, int id) {

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;

	}
	
	static boolean hasId(List<Funcionario> list, int id) {
		
	 Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
	 return func != null;
	}

}
