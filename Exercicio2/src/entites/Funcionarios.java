package entites;

public class Funcionarios {
	
	public String nome;
	public double salario;
	public double taxa;
	public double imposto;
	
	public double salarioLiquido(double salario, double taxa) {
		
		double salLiq = salario - taxa;
		return salLiq;
		
	}
	
	public double aumentoSalario(double salario, double porcentagem) {
	
	double aumento = salario + salario * (porcentagem / 100);
	return aumento;
	}

}
