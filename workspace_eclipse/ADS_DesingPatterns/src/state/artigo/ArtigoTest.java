package state.artigo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArtigoTest {

	@Test
	void deveArtigoTransitarDeRascunhoAteAprovado() {
		GerenteDeSeguranca gerenteDeSeguranca = GerenteDeSeguranca.getInstance();
		
		Artigo artigo = new Artigo();
		
		assertTrue(artigo.getEstado() instanceof EstadoRascunho);
		
		//1. Rascunho > Revisando
		gerenteDeSeguranca.setUsuarioCorrente("AUTOR");
		artigo.publicar();
		
		assertTrue(artigo.getEstado() instanceof EstadoRevisando);
		
		//2. Revisando > Aprovado
		gerenteDeSeguranca.setUsuarioCorrente("MODERADOR");
		artigo.publicar();
		
		assertTrue(artigo.getEstado() instanceof EstadoAprovado);
		
		// Imprime o Historico
		artigo.getLogHistorico().forEach(System.out::println);
		
		/*
		Artigo artigo = new artigo();
		
		assertEquals("RASCUNHO", artigo.getEstado());
		
		//1. Rascunho > Revisando
		gerenteDeSeguranca.setUsuarioCorrente("AUTOR");
		artigo.publicar();
		
		assertEquals("REVISANDO", artigo.getEstado());
		
		//2. Revisando > Aprovado
		gerenteDeSeguranca.setUsuarioCorrente("MODERADOR");
		artigo.publicar();
		
		assertEquals("APROVADO", artigo.getEstado());
		
		
		// Imprime o Historico
		artigo.getLogHitorico().forEach(System.out::println);
		*/

	}
	
	@Test
	void deveArtigoTransitarDeRascunho_Revisando_Rascunho() {
		GerenteDeSeguranca gerenteDeSeguranca = GerenteDeSeguranca.getInstance();
		
		Artigo artigo = new Artigo();
		
		assertTrue(artigo.getEstado() instanceof EstadoRascunho);
		
		//1. Rascunho > Revisando
		gerenteDeSeguranca.setUsuarioCorrente("AUTOR");
		artigo.publicar();
				
		assertTrue(artigo.getEstado() instanceof EstadoRevisando);
				
		//2. Revisando > Rascunho
		gerenteDeSeguranca.setUsuarioCorrente("MODERADOR");
		artigo.reprovar();
				
		assertTrue(artigo.getEstado() instanceof EstadoRascunho);
				
		// Imprime o Historico
		artigo.getLogHistorico().forEach(System.out::println);
		
	}
	
}
