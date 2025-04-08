package main;

import animais.Cachorro;
import animais.Cobra;
import animais.Passaro;

public class Main {

	public static void main(String[] args) {
		
		// Criando um objeto da classe Cachorro com seus atributos
		Cachorro cachorro1 = new Cachorro("Rosvald", "Pastor-Alemão", 3, 27.84f, "Medio");
		
		// Criando um objeto da classe Cobra com seus atributos
		Cobra cobra1 = new Cobra("Snake", "Jiboia", 2, 4.21f, false);
		
		// Criando um objeto da classe Passaro com seus atributos
		Passaro passaro1 = new Passaro("Josias", "Corvo", 1, 0.85f, "Grave");

		
		
		// Exibindo informações do cachorro e valores dos serviços
		cachorro1.exibirInfos();
		System.out.println("Valor Banho: " +cachorro1.banho());
		System.out.println("Valor Tosa: " +cachorro1.tosa());
		System.out.println("Valor Consulta: " +cachorro1.consulta());
		
		
		// Exibindo informações da cobra e valores dos serviços
		cobra1.exibirInfos();
		System.out.println("Valor Banho: " +cobra1.banho());
		System.out.println("Valor Tosa: " +cobra1.tosa());
		System.out.println("Valor Consulta: " +cobra1.consulta());
		
		
		// Exibindo informações do passaro e valores dos serviços
		passaro1.exibirInfos();
		System.out.println("Valor Banho: " +passaro1.banho());
		System.out.println("Valor Tosa: " +passaro1.tosa());
		System.out.println("Valor Consulta: " +passaro1.consulta());
		
	}

}
