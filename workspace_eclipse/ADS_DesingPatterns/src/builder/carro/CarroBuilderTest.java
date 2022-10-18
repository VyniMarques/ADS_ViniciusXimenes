package builder.carro;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CarroBuiderTest {

	@Test
	void daveConstruirUmCarroPeloBuider
	() {
		//partes
		Porta portaMotorista = new Porta();
		Porta portaPassageiro = new Porta();
		Porta[] portas = {portaMotorista, portaPassageiro};
		Motor motorVTEC = new Motor();
		ComputadorBordo computadorSiemens = new ComputadorBordo();
		FreioABS freioBosch = new FreioABS();
		
		//buider
		CarroBuilder carroBuider = new CarroBuilder();
		carroBuider.buidPortas(portas);
		carroBuider.buidMotor(motorVTEC);
		carroBuider.buidComputadorBordo(computadorSiemens);
		carroBuider.buidFreioABS(freioBosch);
		
		//teste o carro construido
		
		Carro carroConstruido = carroBuider.getCarro();
		
		assertNotNull(carroConstruido);
		assertNotNull(carroConstruido.getPortas());
		assertNotNull(carroConstruido.getMotor());
		assertNotNull(carroConstruido.getComputadorBordo());
		assertNotNull(carroConstruido.getFreioABS());
	}

}