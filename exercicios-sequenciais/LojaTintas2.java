/*
Faça um Programa para uma loja de tintas. O programa deverá pedir 
o tamanho em metros quadrados da área a ser pintada. 
Considere que a cobertura da tinta é de 1 litro para cada 6
metros quadrados e que a tinta é vendida em latas de 18 litros, 
que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.

Informe ao usuário as quantidades de tinta a serem compradas e os 
respectivos preços em 3 situações:

Comprar apenas latas de 18 litros;
Comprar apenas galões de 3,6 litros;
Misturar latas e galões, de forma que o preço seja o menor.

Acrescente 10% de folga e sempre arredonde os valores para cima, 
isto é, considere latas cheias.
*/
import java.util.Scanner;

public class LojaTintas2 {
    public static void main(String[] args) {
        double area, qntLitros, pLata = 80.0, pGalao = 25.0;
        double qntLatas = 0, qntGaloes, precoEconomico;
        double precoGaloes, precoLatas;
        
        System.out.print("Informe a área em metros quadrados a ser"+
                           " pintada: ");
        Scanner scan = new Scanner(System.in);
        area = scan.nextDouble();
        area += area * 0.1;
        qntLitros = area / 6;        
        qntGaloes = qntLitros / 3.6;
        qntLatas = qntLitros / 18;
        
        //Comprando só galões:
        if (qntGaloes % 3.6 != 0) {
            precoGaloes = ((int)qntGaloes + 1) * 25;
        }else {
            precoGaloes = ((int)qntGaloes * 25);
        }
        System.out.println("\nComprando apenas galões você precisará "+
                           "pagar R$"+precoGaloes);
        
        
        //Comprando só Latas:
        if (qntLatas % 18 != 0) {
            precoLatas = ((int)qntLatas + 1) * 80;
        } else {
            precoLatas = (int)qntLatas * 80;
        }
        
        System.out.println("\nComprando apenas latas você precisará "+
                           "pagar R$"+precoLatas);
        
        
        
        qntLatas = 0; //Zerando para mix abaixo
        
        //Comprando mix de latas e galões                
        while (qntGaloes >= 4) {
            qntGaloes -= 4;
            qntLatas += 1;
        }
        precoEconomico = ((qntLatas * 80) + (qntGaloes * 25));
        
        System.out.println("\nPara pagar menos será necessário "+
        "comprar "+(int)qntGaloes+" galões e "+qntLatas+" latas."+
        "\n\nIsso custará R$"+precoEconomico);
        
        
        
        
    }
}
