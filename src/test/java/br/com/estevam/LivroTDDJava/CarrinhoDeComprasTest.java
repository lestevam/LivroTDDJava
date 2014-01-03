package br.com.estevam.LivroTDDJava;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CarrinhoDeComprasTest {

	private CarrinhoDeCompras carrinho;
	
	@Before
	public void inicializa(){
		this.carrinho = new CarrinhoDeCompras();
	}
	
	@Test
	public void deveRetornarZeroSeCarrinhoVazio(){
		assertEquals(0.0, carrinho.maiorValor(), 0.0001);
	}
	
	@Test
	public void deveRetornarValorDoItemSeCarrinhoCom1Elemento(){
		carrinho = new CarrinhoDeComprasBuilder().comItens(900.00).cria();
		assertEquals(900.00, carrinho.maiorValor(), 0.00001);
	}
	
	@Test
	public void deveRetornarMaiorValorSeCarrinhoContemMuitosElementos(){
		carrinho.adiciona(new Item("Geladeira", 1, 900.00));
		carrinho.adiciona(new Item("Fogão", 1, 1500.00));
		carrinho.adiciona(new Item("Máquina de Lavar", 1, 750.00));
		assertEquals(1500.00, carrinho.maiorValor(), 0.00001);
	}
	
}
