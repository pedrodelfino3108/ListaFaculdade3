package exercicios3;

import java.util.Scanner;

public class Exercicio10Lista3 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Digite a quantidade de votos válidos para o candidato A:");
        int votos1 = sc.nextInt();
        
        System.out.println("Digite a quantidade de votos válidos para o candidato B:");
        int votos2 = sc.nextInt();
        
        System.out.println("Digite a quantidade de votos válidos para o candidato C:");
        int votos3 = sc.nextInt();
        
        System.out.println("Digite a quantidade de votos nulos:");
        int nulos = sc.nextInt();
        
        System.out.println("Digite a quantidade de votos em branco:");
        int votosEmBranco = sc.nextInt();
        
        int totalEleitores = votos1 + votos2 + votos3 + nulos + votosEmBranco;
        
        double percentualValidos = ((double) (votos1 + votos2 + votos3) / totalEleitores) * 100;
        double percentualA = ((double) votos1 / totalEleitores) * 100;
        double percentualB = ((double) votos2 / totalEleitores) * 100;
        double percentualC = ((double) votos3 / totalEleitores) * 100;
        double percentualNulos = ((double) nulos / totalEleitores) * 100;
        double percentualEmBranco = ((double) votosEmBranco / totalEleitores) * 100;
        
        System.out.println("Número total de eleitores: " + totalEleitores);
        System.out.println("Percentual de votos válidos em: " + percentualValidos + "%");
        System.out.println("Percentual de votos válidos do candidato A em: " + percentualA + "%");
        System.out.println("Percentual de votos válidos do candidato B em: " + percentualB + "%");
        System.out.println("Percentual de votos válidos do candidato C em: " + percentualC + "%");
        System.out.println("Percentual de votos nulos em: " + percentualNulos + "%");
        System.out.println("Percentual de votos em branco em " + percentualEmBranco + "%");
	}
	
}
