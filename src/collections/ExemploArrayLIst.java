package collections;

import java.util.ArrayList;

public class ExemploArrayLIst {

	public static void main(String[] args) {
		
		// Criando a Collection
		
		ArrayList<Double> notas = new ArrayList<Double>(); 

		notas.add(7.0);
		notas.add(5.0);
		notas.add(4.0);
		notas.add(10.0);
		notas.add(4.0);
		
		System.out.println("\nNotas cadastradas: " + notas);
		
		System.out.println("\nA nota 5 existe na lista? " + notas.contains(5d));
		
		System.out.println("\nNa posição 1 da lista, a nota é: " + notas.get(1));
	}

}
