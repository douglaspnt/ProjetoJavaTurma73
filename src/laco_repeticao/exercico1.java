package laco_repeticao;
import java.util.Scanner;

public class exercico1 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Pedindo ao usuário para inserir os números do intervalo
        System.out.println("Digite o primeiro número do intervalo:");
        int primeiroNumero = scanner.nextInt();
        
        System.out.println("Digite o último número do intervalo:");
        int ultimoNumero = scanner.nextInt();
        
        // Verificando se o intervalo é válido
        if (primeiroNumero >= ultimoNumero) {
            System.out.println("Intervalo inválido!");
            return; // Saindo do programa se o intervalo for inválido
        }
        
        // Imprimindo o intervalo
        System.out.println("No Intervalo entre " + primeiroNumero + " e " + ultimoNumero + ":");
        
        // Utilizando um laço for para iterar através do intervalo e encontrar os múltiplos de 3 e 5
        for (int i = primeiroNumero; i <= ultimoNumero; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " é múltiplo de 3 e 5");
            }
        }
        
        // Fechando o scanner para evitar vazamento de recursos
        scanner.close();
    }
}
