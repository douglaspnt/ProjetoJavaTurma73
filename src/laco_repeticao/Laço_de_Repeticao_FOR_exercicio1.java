package laco_repeticao;

import java.util.Scanner;

public class Laço_de_Repeticao_FOR_exercicio1 {
	
	

	public static void main(String[] args) {
		
		int primeiroIntervalo;

		
		int  segundoIntervalo;
		
		int numeroAserIncrementado;
		
		Scanner leia = new Scanner(System.in);
		
			System.out.println("Digite o primeiro número do intervalo:");
		primeiroIntervalo = leia.nextInt();
			System.out.println("Digite o último número do intervalo \n");
        segundoIntervalo = leia.nextInt();
        
      
    
        
        if ( primeiroIntervalo >= segundoIntervalo ) {
        	        	
        	System.out.println("Intervalo inválido!");
        }
       
        for ( numeroAserIncrementado = primeiroIntervalo; numeroAserIncrementado <= segundoIntervalo; numeroAserIncrementado++  ) {
    	
    	if ( numeroAserIncrementado %3==0 && numeroAserIncrementado %5==0 ) {
    		
    		System.out.println(numeroAserIncrementado);
            
    		
    	}
    	
    	
    	
    	
    }
        	
        }
        }
        



