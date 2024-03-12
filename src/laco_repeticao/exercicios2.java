package laco_repeticao;

import java.util.Scanner;

public class exercicios2 {
    public static void main(String[] args) {
        // Criando um objeto Scanner para receber entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Inicializando variáveis de contagem e soma para calcular a média de idade
        int totalBackend = 0;
        int totalMulheresFrontend = 0;
        int totalHomensMobileMais40 = 0;
        int totalNaoBinariosFullStackMenos30 = 0;
        int totalPessoas = 0;
        int somaIdades = 0;
        
        // Pedindo ao usuário para inserir as informações dos colaboradores
        char continuar = 'S';
        
        while (continuar == 'S') {
            System.out.println("Idade:");
            int idade = scanner.nextInt();
            
            System.out.println("Identidade de Gênero:");
            int identidadeGenero = scanner.nextInt();
            
            System.out.println("Pessoa Desenvolvedora:");
            int pessoaDesenvolvedora = scanner.nextInt();
            
            // Atualizando as contagens e somas de acordo com as informações inseridas
            if (pessoaDesenvolvedora == 1) {
                totalBackend++;
            }
            
            if ((identidadeGenero == 1 || identidadeGenero == 4) && pessoaDesenvolvedora == 2) {
                totalMulheresFrontend++;
            }
            
            if ((identidadeGenero == 2 || identidadeGenero == 5) && pessoaDesenvolvedora == 3 && idade > 40) {
                totalHomensMobileMais40++;
            }
            
            if (identidadeGenero == 3 && pessoaDesenvolvedora == 4 && idade < 30) {
                totalNaoBinariosFullStackMenos30++;
            }
            
            totalPessoas++;
            somaIdades += idade;
            
            // Perguntando ao usuário se deseja continuar a leitura dos dados de um novo colaborador
            System.out.println("Deseja continuar (S/N)?");
            continuar = scanner.next().charAt(0);
        }
        
        // Exibindo os resultados
        System.out.println("O número de pessoas desenvolvedoras Backend: " + totalBackend);
        System.out.println("O número de Mulheres Cis e Trans desenvolvedoras Frontend: " + totalMulheresFrontend);
        System.out.println("O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + totalHomensMobileMais40);
        System.out.println("O número de Não Binários desenvolvedores FullStack menores de 30 anos: " + totalNaoBinariosFullStackMenos30);
        System.out.println("O número total de pessoas que responderam à pesquisa: " + totalPessoas);
        
        double mediaIdade = (double) somaIdades / totalPessoas;
        System.out.println("A média de idade das pessoas que responderam à pesquisa: " + mediaIdade);
        
        // Fechando o scanner para evitar vazamento de recursos
        scanner.close();
    }
}
