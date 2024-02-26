package intruducao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		//variaves
		
		float Salario;
		float Abono;
		float NovoSalario;
	
		//Entrada
		System.out.println ("Digite Seu Salario: ");
		Salario = leia.nextFloat();
		System.out.println ("Digite Seu Abono: ");
		Abono = leia.nextFloat();
		NovoSalario = Salario + Abono;
		System.out.println ("Digite Seu Abono: "+ NovoSalario);
		
	}

}
