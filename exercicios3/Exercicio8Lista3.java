package exercicios3;

import java.util.Scanner;

public class Exercicio8Lista3 {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	
    System.out.println("Digite o valor de A:");
    int a = sc.nextInt();
    
    System.out.println("Digite o valor de :");
    int b = sc.nextInt();
    
    System.out.println("Digite o valor de C:");
    int c = sc.nextInt();
    
    System.out.println("Digite o valor de D:");
    int d = sc.nextInt();
    
    int produto = a + c;
    
    int soma = b + c;
    
    System.out.println("O produto de A e C é: " + produto);
    System.out.println("A soma de B e D é: " + soma);
		
		
	}
}
