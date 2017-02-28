/*
Faça um programa que peça o tamanho de um arquivo para 
download (em MB) e a velocidade de um link de Internet (em Mbps), 
calcule e informe o tempo aproximado de download do arquivo
usando este link (em minutos).
*/

import java.util.Scanner;

public class VeloDownload {
    public static void main(String[] args) {
        
        double tamanhoMB, veloMbps, teSeg, teMin;
        
        System.out.print("Informe o tamanho do Download em MB: ");
        Scanner scan = new Scanner(System.in);
        tamanhoMB = scan.nextDouble();
        
        System.out.print("Informe a velocidade da internet em Mbps: ");
        scan = new Scanner(System.in);
        veloMbps = scan.nextDouble();
        
        teSeg = tamanhoMB / veloMbps;
        teMin = teSeg / 60;
        
        System.out.println("O tempo estimado de Download é de "+
                           teMin+" minutos");
        
        
    }
}
