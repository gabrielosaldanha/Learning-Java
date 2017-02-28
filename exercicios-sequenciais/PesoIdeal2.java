/*Tendo como dados de entrada a altura e o sexo de uma pessoa, 
construa um algoritmo que calcule seu peso ideal, 
utilizando as seguintes fórmulas:
  a. Para homens: (72.7*h) - 58
  b. Para mulheres: (62.1*h) - 44.7 (h = altura)
  c. Peça o peso da pessoa e informe se ela está dentro, 
  * acima ou abaixo do peso.
*/
import java.util.Scanner;

public class PesoIdeal2 {
    public static void main(String[] args) {
        double altura, pesoIdeal = 0, pesoAtual;
        String sexo;
        
        System.out.print("Informe a altura da pessoa: ");
        Scanner scan = new Scanner(System.in);
        altura = scan.nextDouble();
        
        System.out.print("Informe o sexo da pessoa F para feminino"+
        " M para masculino: ");
        scan = new Scanner(System.in);
        sexo = scan.nextLine();
        switch (sexo) {
            case "f":
                pesoIdeal = (62.1 * altura - 44.7);
                break;
            case "F":
                pesoIdeal = (62.1 * altura - 44.7);
                break;
            case "m":
                pesoIdeal = (72.7 * altura - 58);
                break;
            case "M":
                pesoIdeal = (72.7 * altura - 58);
                break;
            default:
                System.out.println("Você digitou o sexo corretamente?");
                break;
        }
        /*
        if (sexo == "f" || sexo == "F") {
            pesoIdeal = (62.1 * altura - 44.7);
        }else if (sexo == "m" || sexo == "M") {
            pesoIdeal = (72.7 * altura - 58);
        }else {
            System.out.println("Você informou o sexo corretamente?");
        }  */  
        
        
        System.out.println("Informe seu peso: ");
        scan = new Scanner(System.in);
        pesoAtual = scan.nextDouble();
        
        String statusPeso;
        
        if (pesoIdeal > pesoAtual) {
            statusPeso = "abaixo do peso ideal";
        }else if (pesoIdeal < pesoAtual) {
            statusPeso = "acima do peso ideal";
        }else {
            statusPeso = "dentro do peso ideal";
        }
        
        System.out.println("A pessoa está: "+statusPeso);
    }
}
