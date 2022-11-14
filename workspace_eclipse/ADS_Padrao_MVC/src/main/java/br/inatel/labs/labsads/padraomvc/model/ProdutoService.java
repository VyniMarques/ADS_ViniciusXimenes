package br.inatel.labs.labsads.padraomvc.model;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

	private List<Produto> listaDeProdutos = new ArrayList<>();
	
	@PostConstruct
	private void setup() {
		Produto p1 = new Produto(1L, "Furadeira", 300.00);
		Produto p2 = new Produto()
	}
	
	
}
