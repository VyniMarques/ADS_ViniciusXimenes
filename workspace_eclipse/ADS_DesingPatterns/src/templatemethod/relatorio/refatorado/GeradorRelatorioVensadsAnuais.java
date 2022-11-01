package templatemethod.relatorio.refatorado;

import java.util.List;

import templatemethod.relatorio.intro.ServicoDeRelatorio;

public class GeradorRelatorioVensadsAnuais extends GeradorRelatorioTemplate{

	private Integer ano;
	
	public GeradorRelatorioVensadsAnuais(Integer ano) {
		this.ano = ano;
	}

	@Override
	public List<String> getConteudo() {
		List<String> vendasAnual = ServicoDeRelatorio.getInstance().getVendasAnual(this.ano);
		return vendasAnual;
	}
	
}
