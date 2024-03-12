package lacos_condicionais;

import java.util.Scanner;

public class atividade2ifeelse {
    public static void main(String[] args) {
        // Criando um objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Pedindo ao usuário para inserir o nome do doador, idade e se é a primeira doação
        System.out.println("Digite o Nome do doador:");
        String nomeDoador = scanner.nextLine();
        
        System.out.println("Digite a Idade do doador:");
        int idadeDoador = scanner.nextInt();
        
        System.out.println("Primeira doação de sangue? (true/false)");
        boolean primeiraDoacao = scanner.nextBoolean();
        
        // Fechando o scanner para evitar vazamento de recursos
        scanner.close();
        
        // Verificando se o doador está apto para doar sangue de acordo com as regras
        if (idadeDoador >= 18 && idadeDoador <= 69) {
            if (idadeDoador >= 60 && idadeDoador <= 69) {
                if (primeiraDoacao) {
                    System.out.println(nomeDoador + " não está apto para doar sangue!");
                } else {
                    System.out.println(nomeDoador + " está apto para doar sangue!");
                }
            } else {
                System.out.println(nomeDoador + " está apto para doar sangue!");
            }
        } else {
            System.out.println(nomeDoador + " não está apto para doar sangue!");
        }
    }
}
