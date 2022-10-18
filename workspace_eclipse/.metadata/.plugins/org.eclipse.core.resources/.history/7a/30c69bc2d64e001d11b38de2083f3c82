package strategy.frete;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraFreteTest {

	@Test
	void deveCalcularFreteParaDHL() {
		CalculadoraFrete calculadora = new CalculadoraFrete();
		double valorObtido = calculadora.calculadorValor("dhl", 10.00);
		double valorEsperado = 100.00;
		assertEquals(valorObtido, valorEsperado);
		
		
	}

	@Test
	void deveCalcularFreteParaSedex() {
		CalculadoraFrete calculadora = new CalculadoraFrete();
		double valorObtido = calculadora.calculadorValor("sedex", 30.00);
		double valorEsperado = 90.00;
		assertEquals(valorObtido, valorEsperado);

	}
	
	@Test
	void deveCalcularFreteParaJadLog() {
		CalculadoraFrete calculadora = new CalculadoraFrete();
		double valorObtido = calculadora.calculadorValor("jadlog", 10.00);
		double valorEsperado = 0.00;
		assertEquals(valorObtido, valorEsperado);
	}
	
	@Test
	void deveLancarExceptionParaServicoDesconhecido() {
		assertNotEquals(servico, "sedex");
	}
	
	
}
