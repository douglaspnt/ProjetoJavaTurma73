package laco_repeticao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
	
		String nome1, nome2, nome3;
		
		int contador;
		
        Scanner leia = new Scanner(System.in);
        
        // contador++ => contador = contador + 1
        // 0
        // 1
        // 2
        // 3 = nao e executado
        
        for(contador = 0; contador <= 2; contador++ ) {
        	
     
        	System.out.println("Digite o " + (contador +1 ) + "º nome: ");
            nome1 = leia.nextLine();
            System.out.println("O " + (contador +1) + "º nome: " + nome1 + "\n");
        	
    
            
            
        }
        
        
        System.out.println("Sai do loop");
     
        
    }

	}


