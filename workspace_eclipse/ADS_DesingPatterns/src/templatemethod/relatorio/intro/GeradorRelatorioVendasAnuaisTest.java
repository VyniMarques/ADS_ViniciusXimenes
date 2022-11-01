package templatemethod.relatorio.intro;

import org.junit.jupiter.api.Test;

class GeradorRelatorioVendasAnuaisTest {

	@Test
	void tesdeveGerarRelatorioVendasAnuais() {
		GeradorRelatorioVendasAnuais gerador = new GeradorRelatorioVendasAnuais();
		
		String pagina = gerador.criarPagina(2022);
		
		System.out.println(pagina);
	}

}
