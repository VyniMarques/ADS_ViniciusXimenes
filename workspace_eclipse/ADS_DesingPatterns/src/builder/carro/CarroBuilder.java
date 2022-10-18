package builder.carro;

public class CarroBuilder {
	
	private Carro carro;
	
	public CarroBuilder() {
		carro = new Carro();
	}
	
	public void buidPortas(Porta[] portas) {
		carro.setPortas(portas);
	}
	
	public void buidMotor(Motor m) {
		carro.setMotor(m);
	}
	
	public void buidComputadorBordo (ComputadorBordo cb) {
		carro.setComputadorBordo(cb);
	}
	
	public void buidFreioABS(FreioABS f) {
		carro.setFreioABS(f);
	}

	public Carro getCarro() {
		validarPortas();
		validarMotor();
		return carro;
	}

	private void validarPortas() {
		if (carro.getPortas() == null) {
			throw new IllegalStateException("carro deve ter portas");
		}
		int numeroDePortas = carro.getPortas().length;
		if(numeroDePortas != 2 && numeroDePortas != 4) {
			throw new IllegalStateException("Numero de portas invalido" + numeroDePortas);
		}
		
	}
	
	private void validarMotor() {
		if(carro.getMotor() == null) {
			throw new IllegalStateException("O carro deve ter um motor");
			}	
	}
	

}