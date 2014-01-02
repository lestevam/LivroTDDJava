package br.com.estevam.LivroTDDJava;

import org.junit.Test;

import static org.junit.Assert.*;
import br.com.estevam.LivroTDDJava.Funcionario.Cargo;

public class CalculadoraDeSalarioTest {
	
	@Test
	public void deveCalcularSalarioParaDesenvolvedoresComSalarioAbaixoDoLimite(){
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
		Funcionario desenvolvedor = new Funcionario("Mauricio", 1500.00, Cargo.DESENVOLVEDOR);
		double salario = calculadora.calculaSalario(desenvolvedor);
		assertEquals(1500.00 * 0.9, salario, 0.00001);
	}
	
	@Test
	public void deveCalcularSalarioParaDesenvolvedoresComSalarioAcimaDoLimite(){
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
		Funcionario desenvolvedor = new Funcionario("Mauricio", 4000.00, Cargo.DESENVOLVEDOR);
		double salario = calculadora.calculaSalario(desenvolvedor);
		assertEquals(4000.00 * 0.8, salario, 0.00001);
	}
	
	@Test
	public void deveCalcularSalarioParaDBAsComSalarioAbaixoDoLimite(){
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
		Funcionario desenvolvedor = new Funcionario("Mauricio", 500.00, Cargo.DBA);
		double salario = calculadora.calculaSalario(desenvolvedor);
		assertEquals(500.00 * 0.85, salario, 0.00001);
	}

}
