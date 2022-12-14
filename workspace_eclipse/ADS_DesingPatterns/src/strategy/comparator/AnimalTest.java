package strategy.comparator;

//import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
//import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

class AnimalTest {

	@Test
	void deveOrdenarListaDeAnimaisPeloNome() {
		
		List<Animal> listaDeAnimais = new ArrayList<>();
		
		Animal a1 = new Animal(1L, "Tartaruga");
		Animal a2 = new Animal(2L, "Coelho");
		Animal a3 = new Animal(3L, "Cachorro");
		Animal a4 = new Animal(4L, "Gato");
		Animal a5 = new Animal(5L, "Girafa");
		Animal a6 = new Animal(6L, "Gato");
		
		listaDeAnimais.add(a1);
		listaDeAnimais.add(a2);
		listaDeAnimais.add(a3);
		listaDeAnimais.add(a4);
		listaDeAnimais.add(a5);
		listaDeAnimais.add(a6);
		
		System.out.println("Nome: \n");
		
		System.out.println("Lista Original: ");
		listaDeAnimais.forEach(System.out::println);
		
		listaDeAnimais.sort(new ComparadorPorNome());
		System.out.println("\nLista ordenada por nome: ");
		listaDeAnimais.forEach(System.out::println);
		
	}
	
	@Test
	void deveOrdenarListaDeAnimaisPeloId() {
		
		List<Animal> listaDeAnimais = new ArrayList<>();
		
		Animal a1 = new Animal(1L, "Tartaruga");
		Animal a2 = new Animal(2L, "Coelho");
		Animal a3 = new Animal(3L, "Cachorro");
		Animal a4 = new Animal(4L, "Gato");
		Animal a5 = new Animal(5L, "Girafa");
		Animal a6 = new Animal(6L, "Gato");
		
		listaDeAnimais.add(a2);
		listaDeAnimais.add(a5);
		listaDeAnimais.add(a6);
		listaDeAnimais.add(a4);
		listaDeAnimais.add(a1);
		listaDeAnimais.add(a3);
		
		System.out.println("\nId: ");
		
		//listaDeAnimais.sort((an1, an2)-> an1.getId().compareTo(an2.getId()));
		//listaDeAnimais.sort(Comparator.comparing(Animal::getId));
		
		System.out.println("\nLista Original: ");
		listaDeAnimais.forEach(System.out::println);
		
		listaDeAnimais.sort(new ComparadorPorId());
		System.out.println("\nLista ordenada por nome: ");
		listaDeAnimais.forEach(System.out::println);
	}
	
}
