package br.com.estevam.LivroTDDJava;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaiorPrecoTest {

	@Test
	public void deveRetornarZeroSeCarrinhoVazio(){
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		assertEquals(0.0, carrinho.maiorValor(), 0.0001);
	}
	
	@Test
	public void deveRetornarValorDoItemSeCarrinhoCom1Elemento(){
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Item("Geladeira", 1, 900.00));
		assertEquals(900.00, carrinho.maiorValor(), 0.00001);
	}
	
	@Test
	public void deveRetornarMaiorValorSeCarrinhoContemMuitosElementos(){
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(new Item("Geladeira", 1, 900.00));
		carrinho.adiciona(new Item("Fogão", 1, 1500.00));
		carrinho.adiciona(new Item("Máquina de Lavar", 1, 750.00));
		assertEquals(1500.00, carrinho.maiorValor(), 0.00001);
	}
	
}
