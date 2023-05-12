package br.unicamp.ic.inf335.app.inf335_prj05;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URL;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class AnuncioBeanTeste {

	private ProdutoBean prod1 = new ProdutoBean("1", "p1", "prod1", 10.0, "novo");
	private ProdutoBean prod2 = new ProdutoBean("2", "p2", "prod2", 20.0, "velho");
	
	private ArrayList<URL> urls = new ArrayList<URL>();
	
	private AnuncioBean anun1 = new AnuncioBean(prod1, urls, 0.0);
	private AnuncioBean anun2 = new AnuncioBean(prod2, urls, 1.0);
	
	@Test
	void testgetValor() {
		Double teste1 = anun1.getValor();
		Double esperado1 = 10.0;
		
		Double teste2 = anun2.getValor();
		Double esperado2 = 0.0;
		
		assertEquals(teste1, esperado1);
		assertEquals(teste2, esperado2);
	}

}
