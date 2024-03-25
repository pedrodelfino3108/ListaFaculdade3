package exercicios3;

import java.util.Scanner;

public class Exercicio2Lista3 {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("qual é o comprimento da caixa?");
		int comprimento = sc.nextInt();

		System.out.println("qual é o largura da caixa?");
		int largura = sc.nextInt();

		System.out.println("qual é o altura da caixa?");
		int altura = sc.nextInt();

		int volume = comprimento*largura*altura;
		System.out.println("O volume da caixa é igual a: "+ volume);

	}

}