//Faça um Programa que calcule a área de um quadrado, 
//em seguida mostre o dobro desta área para o usuário.
import java.util.Scanner;

public class AreaQuadrado {
    public static void main (String[] args) {
        double area, lado;
        System.out.print("Informe o lado do quadrado: ");
        Scanner scan = new Scanner(System.in);
        lado = scan.nextDouble();
        area = lado * lado;
        System.out.println("O dobro da área do quadrado é: "+(area*2));
    }
}
