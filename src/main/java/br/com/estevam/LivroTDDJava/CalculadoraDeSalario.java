package br.com.estevam.LivroTDDJava;


public class CalculadoraDeSalario {
	
	public double calculaSalario(Funcionario funcionario){
		if (funcionario.getSalario() > 3000){
			return funcionario.getSalario() * 0.8;
		}
		return funcionario.getSalario() * 0.9;
	}
}
