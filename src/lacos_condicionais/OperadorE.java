package lacos_condicionais;

import java.util.Scanner;

public class OperadorE {

	public static void main(String[] args) {

//		int idade;
//		boolean carteiraM;
//
//		Scanner leia = new Scanner(System.in);
//		
//		System.out.println( " Digite a sua idade ");
//		idade = leia.nextInt();
//		
//		System.out.println( " Voce tem carteira de habilitacao ? (true/false)");
//		carteiraM = leia.nextBoolean();
//		
//		if ( idade >= 18 && carteiraM == true) {
//			System.out.println("Pode dirigir!");}
//			
//			else {
//				System.out.println("Nao Pode dirigir!");}

		float nota1, nota2, media;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite primeira nota");
		nota1 = leia.nextFloat();

		System.out.println("Digite segunda nota");
		nota2 = leia.nextFloat();

		media = (nota1 + nota2) / 2;

		if (media >= 6) {
			System.out.println("PARABENS APROVADO");
		}

		else if (media >= 5) {
			System.out.println("ESTA DE EXAME");
		}

		else {
			System.out.println("ESTA REPROVADO ");
		}
	}

}
