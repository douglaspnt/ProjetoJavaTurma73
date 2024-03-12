package lacos_condicionais;

import java.util.Scanner;

public class atividadeSwitchCase_5 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Pedindo ao usuário para inserir o código do produto e a quantidade comprada
        System.out.println("Código do Produto:");
        int codigoProduto = scanner.nextInt();
        
        System.out.println("Quantidade:");
        int quantidade = scanner.nextInt();
        
        // Fechando o scanner para evitar vazamento de recursos
        scanner.close();
        
        // Declarando variáveis para o nome do produto e o preço unitário
        String nomeProduto = "";
        double precoUnitario = 0.0;
        
        // Usando um laço condicional switch para determinar o nome do produto e o preço unitário com base no código do produto
        switch (codigoProduto) {
            case 1:
                nomeProduto = "Cachorro Quente";
                precoUnitario = 10.00;
                break;
            case 2:
                nomeProduto = "X-Salada";
                precoUnitario = 15.00;
                break;
            case 3:
                nomeProduto = "X-Bacon";
                precoUnitario = 18.00;
                break;
            case 4:
                nomeProduto = "Bauru";
                precoUnitario = 12.00;
                break;
            case 5:
                nomeProduto = "Refrigerante";
                precoUnitario = 8.00;
                break;
            case 6:
                nomeProduto = "Suco de laranja";
                precoUnitario = 13.00;
                break;
            default:
                System.out.println("Código de produto inválido!");
                return; // Encerra o programa se o código do produto for inválido
        }
        
        // Calculando o valor total da conta
        double valorTotal = quantidade * precoUnitario;
        
        // Imprimindo o nome do produto e o valor total da conta
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Valor total: R$ " + String.format("%.2f", valorTotal));
    }
}
