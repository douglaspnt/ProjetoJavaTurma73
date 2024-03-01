package vetor_matriz;

import java.util.Scanner;

public class exemplo_Vetor {

	public static void main(String[] args) {

		String cachorros[] = new String [3];
		
		Scanner leia = new Scanner(System.in);
		int indice; 
		
		//0["laika"] - 1["Sandy"] - 2["Spike"]
		
		//guardar nomes
		for( indice= 0; indice < 3; indice++) {
			
			System.out.println("Digite o nome:" );
			cachorros[indice] = leia.nextLine();
		}
			//lista os nome 
		for( indice= 0; indice < cachorros.length; indice++) {
				System.out.println("Cachorros [" + indice + "]: "  + cachorros[indice]);
				//acessar o vetor
				
			}
			
		}
		}
	


