package util;

public class Funcionario {

	private Integer id;
	private String nome;
	private Double salario;

	
	
		public Funcionario() {
		
	}

		public Funcionario(Integer id, String nome, Double salario) {
			
			this.id = id;
			this.nome = nome;
			this.salario = salario;
		}
	
		public void aumentarSalario(double porcentagem) {
			
			salario = salario + salario * porcentagem / 100;
			
		}

		public int getId() {
			return id;
		}


		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getSalario() {
			return salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}

		@Override
		public String toString() {
			return id + ", " + nome + ", " + String.format("%.2f", salario);
		}
	
	
}
