/*Faça um Programa que pergunte quanto você ganha por hora e o número 
de horas trabalhadas no mês. Calcule e mostre o total do seu salário no 
referido mês, sabendo-se que são descontados 11% para o Imposto de 
Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos
dê:
a. salário bruto.
b. quanto pagou ao INSS.
c. quanto pagou ao sindicato.
d. o salário líquido.
e. calcule os descontos e o salário líquido, conforme a tabela abaixo:

+ Salário Bruto : R$
- IR (11%) : R$
- INSS (8%) : R$
- Sindicato ( 5%) : R$
= Salário Liquido : R$
*/
import java.util.Scanner;

public class Impostos {
    
    public static void main(String[] args) {
        
        double vHora, hTrabalhada, sBruto, ir, inss, iSind, sLiquido;
        
        System.out.print("Informe quanto você ganha por hora: ");
        Scanner scan = new Scanner(System.in);
        vHora = scan.nextDouble();
        
        System.out.print("Informe quantas horas você trabalhou: ");
        scan = new Scanner(System.in);
        hTrabalhada = scan.nextDouble();
        
        sBruto = vHora * hTrabalhada;
        ir = sBruto * 0.11;
        inss = sBruto * 0.08;
        iSind = sBruto * 0.05;
        sLiquido = sBruto - (ir+inss+iSind);
        
        System.out.println("+ Salário Bruto : R$"+sBruto);
        System.out.println("- IR (11%) : R$"+ir);
        System.out.println("- INSS (8%) : R$"+inss);
        System.out.println("- Sindicato ( 5%) : R$"+iSind);
        System.out.println("= Salário Liquido : R$"+sLiquido);
        
    }
        
}

