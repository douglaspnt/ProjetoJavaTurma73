package lacos_condicionais;

import java.util.Scanner;

public class atividade1_ifelse {
	
	public static void main(String[] args) {
		
	
	int DigiteA;
	
    int DigiteB;
    
    int DigiteC;

    Scanner scanner = new Scanner(System.in);

	System.out.println( "Digite o número A" );
	DigiteA = scanner.nextInt();
	
	System.out.println("Digite o número B");
	DigiteB = scanner.nextInt();
	
	System.out.println("Digite o número C");
	DigiteC = scanner.nextInt();
	
	int soma = DigiteA + DigiteB;
			

	if ( soma > DigiteC ) {
		System.out.println(soma + " A Soma de A + B é Maior do que C" );
	}

	else if ( soma < DigiteC ) {
		System.out.println("A Soma de A + B é Menor do que C") ;
	}

	else  {
		System.out.println("A Soma de A + B é Igual a C");
	}
}

}


