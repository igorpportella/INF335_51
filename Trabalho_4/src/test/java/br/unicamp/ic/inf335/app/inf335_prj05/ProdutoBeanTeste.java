package br.unicamp.ic.inf335.app.inf335_prj05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProdutoBeanTeste {
	
	private ProdutoBean prod1 = new ProdutoBean("1", "p1", "prod1", 10.0, "novo");
	private ProdutoBean prod2 = new ProdutoBean("2", "p2", "prod2", 20.0, "velho");

	@Test
	void testcompareTo() {
		int teste1 = prod1.compareTo(prod1);
		int esperado1 = 0;
		
		int teste2 = prod1.compareTo(prod2);
		int esperado2 = -1;
		
		int teste3 = prod2.compareTo(prod1);
		int esperado3 = 1;
		
		assertEquals(teste1, esperado1);
		assertEquals(teste2, esperado2);
		assertEquals(teste3, esperado3);
		
	}

}
