//Faça um Programa que peça dois números e imprima a soma.
import java.util.Scanner;

public class ImprimeSoma {
 
    public static void main (String[] args) {
        
        double num, num2;
        
        System.out.print("Informe um número: ");
        Scanner scan = new Scanner(System.in);
        num = scan.nextDouble();
        
        System.out.print("\nInforme outro número: ");
        scan = new Scanner(System.in);
        num2 = scan.nextDouble();
        
        double soma = num + num2;
        
        System.out.println("\nA soma entre os dois números é "+soma);
    }
}
