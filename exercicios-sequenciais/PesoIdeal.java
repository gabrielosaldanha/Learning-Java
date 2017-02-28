//Tendo como dados de entrada a altura de uma pessoa, 
//construa um algoritmo que calcule seu peso ideal, 
//usando a seguinte fórmula: (72.7*altura) - 58
import java.util.Scanner;

public class PesoIdeal {
    public static void main(String[] args) {
        double altura;
        
        System.out.print("Informe a altura da pessoa: ");
        Scanner scan = new Scanner(System.in);
        altura = scan.nextDouble();
        
        double pesoIdeal = (72.7 * altura) - 58;
        
        System.out.println("O peso ideal é: "+pesoIdeal+" kg");
    }
}
