package strategy.frete;

public class ServicoFreteFedEx implements Fretavel{

	@Override
	public double calcularValor(double pesoEmKg) {
		if(pesoEmKg < 20.00) {
			return 0.00;
		}else if(pesoEmKg < 39.9 && pesoEmKg > 20.1) {
			return 45.00;
		}else
			return 75.00;
	}
	
}
