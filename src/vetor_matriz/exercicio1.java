package vetor_matriz;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Vetor de números inteiros não ordenados e não repetidos
        int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        
        System.out.println("Vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        
        System.out.println("vetor:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println("\n");
        
        System.out.println("Digite o número que você deseja encontrar:");
        int numero = scanner.nextInt();
        
        boolean encontrado = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                System.out.println("\nO número " + numero + " está localizado na posição: " + i);
                encontrado = true;
                break;
            }
        }
        
        if (!encontrado) {
            System.out.println("\nO número " + numero + " não foi encontrado!");
        }
        
        scanner.close();
    }
}
