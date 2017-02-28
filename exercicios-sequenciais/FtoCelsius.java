//Faça um Programa que peça a temperatura em graus Farenheit, 
//transforme e mostre a temperatura em graus Celsius.
//C = (5 * (F-32) / 9).
import java.util.Scanner;

public class FtoCelsius {
    public static void main(String[] args) {
        double fahrenheit, celsius;
        
        System.out.print("Informe a temperatura em graus Farenheit: ");
        Scanner scan = new Scanner(System.in);
        fahrenheit = scan.nextDouble();
        celsius = (5 * (fahrenheit-32) / 9);
        System.out.println("A temperatura em Celsius é: "+celsius);
    }
}
