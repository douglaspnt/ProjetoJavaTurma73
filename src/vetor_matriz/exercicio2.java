package vetor_matriz;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando uma matriz para armazenar as notas dos participantes
        double[][] notas = new double[10][4];
        
        // Lendo as notas dos participantes
        System.out.println("Entre com as notas dos 10 participantes durante 4 bimestres:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Participante " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print("Bimestre " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }
        
        // Calculando e armazenando as médias dos participantes em um vetor
        double[] medias = new double[10];
        for (int i = 0; i < 10; i++) {
            double soma = 0;
            for (int j = 0; j < 4; j++) {
                soma += notas[i][j];
            }
            medias[i] = soma / 4;
        }
        
        // Exibindo as médias dos participantes
        System.out.println("\nMédias dos participantes:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Participante %d: %.1f\n", (i + 1), medias[i]);
        }
        
        scanner.close();
    }
}
