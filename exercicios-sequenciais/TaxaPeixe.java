/*João Papo-de-Pescador, homem de bem, comprou um microcomputador 
para controlar o rendimento diário de seu trabalho. Toda vez que ele 
traz um peso de peixes maior que o estabelecido pelo regulamento de 
pesca do estado de São Paulo (50 quilos) deve pagar uma multa de 
R$ 4,00 por quilo excedente. João precisa que você faça um programa que 
leia a variável peso (peso de peixes) e verifique se há excesso. 

Se houver, gravar na variável excesso e na variável multa o valor da 
multa que João deverá pagar. Caso contrário mostrar tais variáveis
com o conteúdo ZERO.
*/
import java.util.Scanner;

public class TaxaPeixe {
    public static void main(String[] args) {
        double pesoPescado, multa = 4, pesoExcedente, totalMulta;
        
        System.out.print("Informe o peso pescado hoje: ");
        Scanner scan = new Scanner(System.in);
        pesoPescado = scan.nextDouble();
        
        pesoExcedente = pesoPescado - 50;
        
        if (pesoExcedente <= 0) {
            totalMulta = 0;
        }else {
            totalMulta = (multa * pesoExcedente);
        }
        
        System.out.println("Você deverá pagar uma taxa de R$"+
                           totalMulta);
    }
}
