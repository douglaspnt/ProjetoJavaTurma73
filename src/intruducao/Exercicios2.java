package intruducao;

import java.util.Scanner;

public class Exercicios2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// entrada de 

		float nota1;		
		float nota2;
		float nota3;
		float nota4;
		
		 System.out.print("Nota 1: ");
	        nota1 = scanner.nextFloat();
	        
	        System.out.print("Nota 2: ");
	        nota2 = scanner.nextFloat();
	        
	        System.out.print("Nota 3: ");
	        nota3 = scanner.nextFloat();
	        
	        System.out.print("Nota 4: ");
	        nota4 = scanner.nextFloat();
	        
	        float mediaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
	        
	        System.out.println("\nMédia final: " + mediaFinal);
	        
	        scanner.close();
	        
	}

}
