package intruducao;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float salarioBruto;
        float adicionalNoturno;
        float horasExtras;
        float descontos;
        
        System.out.print("Salário Bruto: ");
        salarioBruto = scanner.nextFloat();
        
        System.out.print("Adicional Noturno: ");
        adicionalNoturno = scanner.nextFloat();
        
        System.out.print("Horas Extras: ");
        horasExtras = scanner.nextFloat();
        
        System.out.print("Descontos: ");
        descontos = scanner.nextFloat();
        
        float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
        
        System.out.println("\nSalário Líquido: " + salarioLiquido);
        
        scanner.close();
    }
}
