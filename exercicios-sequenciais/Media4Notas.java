//Faça um Programa que peça as 4 notas bimestrais e mostre a média.
import java.util.Scanner;

public class Media4Notas {
    
    public static void main(String[] args) {
        double nota1, nota2, nota3, nota4;
        
        System.out.print("Informe a primeira nota bimestral: ");
        Scanner scan = new Scanner(System.in);
        nota1 = scan.nextDouble();
        
        System.out.print("Informe a segunda nota bimestral: ");
        scan = new Scanner(System.in);
        nota2 = scan.nextDouble();
        
        System.out.print("Informe a terceira nota bimestral: ");
        scan = new Scanner(System.in);
        nota3 = scan.nextDouble();
        
        System.out.print("Informe a quarta nota bimestral: ");
        scan = new Scanner(System.in);
        nota4 = scan.nextDouble();
        
        double media = (nota1+nota2+nota3+nota4) / 4;
        
        System.out.println("A média das notas é: "+media);
    }
}
