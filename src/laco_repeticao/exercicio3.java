package laco_repeticao;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        int soma = 0; // Variável para armazenar a soma dos números múltiplos de 3
        int count = 0; // Variável para contar quantos números múltiplos de 3 foram digitados
        
        int numero;
        do {
            System.out.println("Digite um número:");
            numero = scanner.nextInt();
            
            if (numero % 3 == 0 && numero != 0) {
                soma += numero;
                count++;
            }
        } while (numero != 0);
        
        // Calculando e exibindo a média dos números múltiplos de 3
        double media = count > 0 ? (double) soma / count : 0;
        System.out.println("A média de todos os números múltiplos de 3 é: " + media);
        
        // Fechando o scanner para evitar vazamento de recursos
        scanner.close();
    }
}
