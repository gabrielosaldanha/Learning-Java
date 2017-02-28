//Faça um Programa que peça um número e então mostre a mensagem:
//O número informado foi <número>.
import java.util.Scanner;
    
public class NumeroInformado {
    
    public static void main(String[] args) {
        System.out.print("Informe um número: ");
        Scanner scan = new Scanner(System.in);
        double numeroInformado = scan.nextInt();
        System.out.println("O número informado foi "+numeroInformado);
    }
}
