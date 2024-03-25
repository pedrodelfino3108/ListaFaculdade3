package exercicios3;

import java.util.Scanner;

public class Exercicio3Lista3 {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Qual o valor de A?");
		int valor1 = sc.nextInt();

		System.out.println("Qual o valor de B?");
		int valor2 = sc.nextInt();
		
		double diferença = valor1 - valor2; 
		double quadradoDiferença = diferença * diferença;		


		System.out.println("O quadrado da diferenç entre "+valor1+" e "+valor2+" é "+quadradoDiferença);

	}

}