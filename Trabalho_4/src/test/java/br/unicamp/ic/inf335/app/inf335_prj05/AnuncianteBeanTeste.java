package br.unicamp.ic.inf335.app.inf335_prj05;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URL;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class AnuncianteBeanTeste {
	
	private ProdutoBean prod1 = new ProdutoBean("1", "p1", "prod1", 10.0, "novo");
	private ProdutoBean prod2 = new ProdutoBean("2", "p2", "prod2", 20.0, "velho");
	private ProdutoBean prod3 = new ProdutoBean("3", "p3", "prod3", 40.0, "novo");
	private ProdutoBean prod4 = new ProdutoBean("4", "p4", "prod4", 80.0, "velho");
	
	private ArrayList<URL> urls = new ArrayList<URL>();
	
	private AnuncioBean anun1 = new AnuncioBean(prod1, urls, 0.0); // 10.0
	private AnuncioBean anun2 = new AnuncioBean(prod2, urls, 1.0); //  0.0
	private AnuncioBean anun3 = new AnuncioBean(prod3, urls, 0.2); // 32.0
	private AnuncioBean anun4 = new AnuncioBean(prod4, urls, 0.8); // 16.0
	
	private ArrayList<AnuncioBean> anuncios = new ArrayList<AnuncioBean>();
	
	private AnuncianteBean anunciante1 = new AnuncianteBean("nome1", "12345", anuncios);

	@Test
	void testAddAnuncio() {
		assertEquals(anunciante1.getAnuncios().size(), 0);
		anunciante1.addAnuncio(anun1);
		assertEquals(anunciante1.getAnuncios().size(), 1);
		anunciante1.addAnuncio(anun2);
		anunciante1.addAnuncio(anun3);
		anunciante1.addAnuncio(anun4);
		assertEquals(anunciante1.getAnuncios().size(), 4);
	}
	
	@Test
	void testRemoveAnuncio() {
		anunciante1.addAnuncio(anun1);
		anunciante1.addAnuncio(anun2);
		anunciante1.addAnuncio(anun3);
		anunciante1.addAnuncio(anun4);
		
		assertEquals(anunciante1.getAnuncios().size(), 4);
		anunciante1.removeAnuncio(0);
		assertEquals(anunciante1.getAnuncios().size(), 3);
		anunciante1.removeAnuncio(0);
		anunciante1.removeAnuncio(0);
		anunciante1.removeAnuncio(0);
		assertEquals(anunciante1.getAnuncios().size(), 0);
	}
	
	@Test
	void testValorMedioAnuncios() {
		assertEquals(anunciante1.valorMedioAnuncios(), 0.0);
		anunciante1.addAnuncio(anun1);
		assertEquals(anunciante1.valorMedioAnuncios(), 10.0);
		anunciante1.addAnuncio(anun2);
		assertEquals(anunciante1.valorMedioAnuncios(), 5.0);
		anunciante1.addAnuncio(anun3);
		assertEquals(anunciante1.valorMedioAnuncios(), 14.0);
		anunciante1.addAnuncio(anun4);
		assertEquals(anunciante1.valorMedioAnuncios(), 14.5);
	}
}
