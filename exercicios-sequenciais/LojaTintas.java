/*
Faça um programa para uma loja de tintas. O programa deverá pedir o 
tamanho em metros quadrados da área a ser pintada. 

Considere que a cobertura da tinta é de 1 litro para cada 3
metros quadrados e que a tinta é vendida em latas de 18 litros, 
que custam R$ 80,00. Informe ao usuário a quantidades de 
latas de tinta a serem compradas e o preço total.
*/

import java.util.Scanner;

public class LojaTintas {
    public static void main(String[] args) {
        
        double area, qntLitros, totalPagar;
        int qntLatas = 0;
        
        System.out.print("Informe a área em metros quadrados a ser"+
                         " pintada: ");
        Scanner scan = new Scanner(System.in);
        area = scan.nextDouble();
        
        qntLitros = area / 3;
        if ((qntLitros % 18) > 0) {
            qntLatas = (int)(qntLitros / 18) + 1;
        }else if (qntLitros % 18 == 0) {
            qntLatas = (int)(qntLitros / 18);
        }
        
        totalPagar = qntLatas * 80;
        System.out.println(qntLitros);
        System.out.println(qntLatas);
        System.out.println(totalPagar);
    }
}
