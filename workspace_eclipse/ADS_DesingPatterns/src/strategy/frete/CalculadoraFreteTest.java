package strategy.frete;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraFreteTest {

	@Test
	void deveCalcularFreteParaDHL() {
		CalculadoraFrete calculadora = new CalculadoraFrete();
		
		Fretavel servicoFreteDHL = new ServicoFreteDHL();
		
		double valorEsperado = 100.0;
		double valorRetornado = calculadora.calcular(servicoFreteDHL, 15.0);
		
		assertEquals(valorEsperado, valorRetornado);
		
	}

	@Test
	void deveCalcularFreteParaSedex() {
		CalculadoraFrete calculadora = new CalculadoraFrete();
		
		Fretavel servicoFreteSedex = new ServicoFreteSedex();
		
		double valorEsperado = 90.00;
		double valorRetornado = calculadora.calcular(servicoFreteSedex, 30.0);
		
		assertEquals(valorEsperado, valorRetornado);

	}
	
	@Test
	void deveCalcularFreteParaJadLog() {
		CalculadoraFrete calculadora = new CalculadoraFrete();
		
		Fretavel servicoFreteJadLog = new ServicoFreteJadLog();
		
		double valorEsperado = 0.00;
		double valorRetornado = calculadora.calcular(servicoFreteJadLog, 10.0);
		
		assertEquals(valorEsperado, valorRetornado);
		
	}
	
	@Test
	void deveCalcularFreteParaFedEx() {
		CalculadoraFrete calculadora = new CalculadoraFrete();
		
		Fretavel servicoFreteFedEx = new ServicoFreteFedEx();
		
		double valorEsperado = 45.00;
		double valorRetornado = calculadora.calcular(servicoFreteFedEx, 22.0);
		
		assertEquals(valorEsperado, valorRetornado);
		
	}
	
	/* Não faz mais sentido
	@Test
	void deveLancarExceptionParaServicoDesconhecido() {
		assertNotEquals(servico, "sedex");
	}
	*/
}
