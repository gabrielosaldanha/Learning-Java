//Faça um Programa que peça o raio de um círculo, 
//calcule e mostre sua área
import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        double area, raio, pi = 3.14;
        
        System.out.print("Informe o raio do circulo: ");
        Scanner scan = new Scanner(System.in);
        raio = scan.nextDouble();
        area = (raio*raio)*pi;
        System.out.println("\n A área deste circulo é: "+area);
    }
}
