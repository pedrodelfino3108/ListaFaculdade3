package exercicios3;

import java.util.Scanner;

public class Exercicio6Lista3 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Digite o valor de A:");
        double a = sc.nextDouble();
        
        System.out.println("Digite o valor de B:");
        double b = sc.nextDouble();
        
        System.out.println("Digite o valor de C:");
        double c = sc.nextDouble();
        
        double soma = (a * a) + (b * b) + (c * c);
        
        System.out.println("A soma dos quadrados de A, B e C é: " + soma);
	}
}
