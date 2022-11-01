package templatemethod.relatorio.intro;

import org.junit.jupiter.api.Test;

class GeradorRelatorioVendasMensaisTest {

	@Test
	void deveGerarRelatorioVendasMnsais() {
		GeradorRelatorioVendasMensais gerador = new GeradorRelatorioVendasMensais();
		
		String pagina= gerador.criarPagina(2022, 10);
		
		System.out.println(pagina);
	}

}
