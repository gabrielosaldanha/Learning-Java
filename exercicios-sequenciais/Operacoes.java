/*Faça um Programa que peça 2 números inteiros e um número real.
 * Calcule e mostre:
    a. o produto do dobro do primeiro com metade do segundo .
    b. a soma do triplo do primeiro com o terceiro.
    c. o terceiro elevado ao cubo. */
import java.util.Scanner;

public class Operacoes {
    public static void main(String[] args) {
        int num1, num2;
        double real3;
        
        System.out.print("Informe o primeiro número: ");
        Scanner scan = new Scanner(System.in);
        num1 = scan.nextInt();
        
        System.out.print("Informe o primeiro número: ");
        scan = new Scanner(System.in);
        num2 = scan.nextInt();
        
        System.out.print("Informe o primeiro número: ");
        scan = new Scanner(System.in);
        real3 = scan.nextDouble();
        
        double produto = ((num1*2)*(num2/2));
        double soma = ((num1*3)+real3);
        double elevado3 = (real3*real3*real3);
        
        System.out.println(produto);
        System.out.println(soma);
        System.out.println(elevado3);
        }
}
