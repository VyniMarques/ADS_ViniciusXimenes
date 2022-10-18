package builder.pizzaria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PizzaBuilderTest {

	@Test
	void deveInvalidarPizzaComTamanhoErrado() {
		try {
		Pizza pizza = new PizzaBuilder()
				.setSize(9)
				.addCheese()
				.addPepperoni()
				.getPizza();
		
		fail("Devia ter lançado exception");
		
						
	}catch(IllegalStateException e) {
		e.printStackTrace();
		
		}
	}
	
	@Test
	void deveInvalidarPizzaSemIngrediente() {
		try {
			Pizza pizza = new PizzaBuilder()
					.setSize(1)
					.getPizza();
			
		fail("Devia ter lançado exception");
			
							
		}catch(IllegalStateException e) {
			e.printStackTrace();
		}
	}	
	
	
}
