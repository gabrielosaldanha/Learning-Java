//Faça um Programa que converta metros para centímetros.
import java.util.Scanner;

public class MetrosParaCentimetros {
    public static void main(String[] args) {
        double metros, centimetros;
        
        System.out.print("Informe a quantidade de metros: ");
        Scanner scan = new Scanner(System.in);
        metros = scan.nextDouble();
        centimetros = metros * 100;
        
        System.out.println("A quantidade em centimetros é: "+
        centimetros);
    }
}
