//Faça um Programa que pergunte quanto você ganha por hora e o 
//número de horas trabalhadas no mês. 
//Calcule e mostre o total do seu salário no referido mês.
import java.util.Scanner;

public class CalculaSalario {
    public static void main (String[] args) {
        double vhora, htrabalhadas, salario;
        
        System.out.print("Informe quanto você ganha por hora: ");
        Scanner scan = new Scanner(System.in);
        vhora = scan.nextDouble();
        
        System.out.print("Informe quantas horas você trabalhou: ");
        scan = new Scanner(System.in);
        htrabalhadas = scan.nextDouble();
        
        salario = vhora * htrabalhadas;
        
        System.out.println("Seu salário será de R$"+salario);
        
    }
}
