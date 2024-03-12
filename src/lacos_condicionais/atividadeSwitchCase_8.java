package lacos_condicionais;

import java.util.Scanner;

public class atividadeSwitchCase_8 {
    public static void main(String[] args) {
        // Inicializando o saldo com R$ 1000.00
        float saldo = 1000.00f;
        
        // Criando um objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Pedindo ao usuário para inserir o tipo de operação
        System.out.println("Operação:");
        int operacao = scanner.nextInt();
        
        // Utilizando um laço condicional switch para determinar a operação a ser realizada
        switch (operacao) {
            case 1:
                // Operação de Saldo
                System.out.println("Operação - Saldo");
                System.out.println("Saldo: R$ " + saldo);
                break;
            case 2:
                // Operação de Saque
                System.out.println("Valor:");
                float valorSaque = scanner.nextFloat();
                if (valorSaque > saldo) {
                    System.out.println("Operação - Saque");
                    System.out.println("Saldo Insuficiente!");
                } else {
                    saldo -= valorSaque;
                    System.out.println("Operação - Saque");
                    System.out.println("Novo Saldo: R$ " + saldo);
                }
                break;
            case 3:
                // Operação de Depósito
                System.out.println("Valor:");
                float valorDeposito = scanner.nextFloat();
                saldo += valorDeposito;
                System.out.println("Operação - Depósito");
                System.out.println("Novo Saldo: R$ " + saldo);
                break;
            default:
                // Operação Inválida
                System.out.println("Operação Inválida!");
                break;
        }
        
        // Fechando o scanner para evitar vazamento de recursos
        scanner.close();
    }
}