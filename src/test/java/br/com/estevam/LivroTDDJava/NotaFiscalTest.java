package br.com.estevam.LivroTDDJava;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class NotaFiscalTest {
	
	@Test
	public void deveEnviarNFGerada(){
		AcaoAposGerarNota acao1 = Mockito.mock(AcaoAposGerarNota.class);
		AcaoAposGerarNota acao2 = Mockito.mock(AcaoAposGerarNota.class);
		
		List<AcaoAposGerarNota> acoes = Arrays.asList(acao1, acao2);
		
		GeradorDeNotaFiscal gerador = new GeradorDeNotaFiscal(acoes);
		Pedido pedido = new Pedido("Mauricio", 1000, 1);
		NotaFiscal nf = gerador.gera(pedido);
		
		Mockito.verify(acao1).executa(nf);
		Mockito.verify(acao2).executa(nf);
	}

}
