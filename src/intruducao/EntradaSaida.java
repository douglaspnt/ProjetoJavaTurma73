package intruducao;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {

		//variaves
		String nome;
		int idade;
		
		//entrada de dados 
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o seu nome: ");
		nome= leia.next();
		
		System.out.println("Insira sua idade: ");
		idade = leia.nextInt();
		
		//contatenacao: juntar um texto com 1 ou mais variaveis/constantes
		// saida de dados
		System.out.println("Bom dia, " + nome);
		System.out.println("A sua idade é, " + idade + " anos ");
		
	}

}
