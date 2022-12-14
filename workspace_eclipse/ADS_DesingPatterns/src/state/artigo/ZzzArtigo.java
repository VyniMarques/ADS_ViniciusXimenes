package state.artigo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ZzzArtigo {

	private String estado;
	
	private List<String> logHistorico = new ArrayList<>();
	
	public ZzzArtigo() {
		this.estado = "RASCUNHO"; // Estado Inicial
	}
    
	public void publicar() {
		GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance();
		
		if("RASCUNHO".equals(this.estado)) {
			if(seguranca.ehUsuarioAutor()) {
				this.estado = "REVISANDO";
				this.logHistorico.add("Transitado para REVISANDO em " + LocalDateTime.now());
				return;
			}else {
				throw new RuntimeException("Usuario não tem permissão para publicar");
			}
		}
		
		if("REVISANDO".equals(this.estado)) {
			if(seguranca.ehUsuarioModerador()) {
				this.estado = "APROVADO";
				this.logHistorico.add("Transitado para APROVADO em " + LocalDateTime.now());
				return;
			}else {
				throw new RuntimeException("Usuario não tem permissão para publicar");
			}
		}
		
		if("APROVADO".equals(estado)) {
			// Não faz nada
			return;
		}
		
	}
	
	public void reprovar() {
		GerenteDeSeguranca seguranca = GerenteDeSeguranca.getInstance();
		
		if("RASCUNHO".equals(this.estado)) {
			// Não faz nada
			return;
		}
		
		if("REVISANDO".equals(this.estado)) {
			if(seguranca.ehUsuarioModerador()) {
				this.estado = "RASCUNHO";
				this.logHistorico.add("Transitado para APROVADO em " + LocalDateTime.now());
				return;
			}else {
				throw new RuntimeException("Usuario não tem permissão para publicar");
			}
		}
		
		if("APROVADO".equals(estado)) {
			// Não faz nada
			return;
		}
	}
	
	// Getters...
	public String getEstado() {
		return estado;
	}

	public List<String> getLogHitorico() {
		return logHistorico;
	}
	
}
