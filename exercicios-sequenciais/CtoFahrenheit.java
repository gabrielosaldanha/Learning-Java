//Faça um Programa que peça a temperatura em graus Celsius, 
//transforme e mostre em graus Farenheit (fahrenheit = (celsius*1.8)+32)
import java.util.Scanner;

public class CtoFahrenheit {
    public static void main(String[] args) {
        
        double celsius, fahrenheit;
        
        System.out.print("Informe a temperatura em graus Celsius: ");
        Scanner scan = new Scanner(System.in);
        celsius = scan.nextDouble();
        fahrenheit = (celsius*1.8) + 32;
        System.out.println("A temperatura em graus Fahrenheit é: "+
                           fahrenheit);
    }
}
