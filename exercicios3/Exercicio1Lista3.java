package exercicios3;

import java.util.Scanner;

public class Exercicio1Lista3 {

	public static void main(String[]args) {

	Scanner scanner = new Scanner(System.in);


	System.out.println("Qual o valor de A?");	

	int valor1 = scanner.nextInt();

	System.out.println("\n");

	

	System.out.println("Qual o valor de B?");	

	int valor2 = scanner.nextInt();

	System.out.println("\n");

		

	int primeiraA = valor1+valor2;

	int primeiraM = valor1*valor2;

	

	System.out.println("A soma é A+B éigual a "+ primeiraA);

	System.out.println("A multiplicação A*B é igual a "+ primeiraM);

	System.out.println("\n");
	

	System.out.println("Qual o valor de C?");	

	int valor3 = scanner.nextInt();

	System.out.println("\n");


	int segundaA = valor1+valor3;

	int segundaM = valor1*valor3;


	System.out.println("A soma A+C é igual a "+ segundaA);

	System.out.println("A multiplicação A*C é igual a "+ segundaM);

	System.out.println("\n");

	

	System.out.println("Qual o valor de D?");	

	int valor4 = scanner.nextInt();

	System.out.println("\n");

	

	int terceiraA = valor1+valor4;

	int terceiraM = valor1*valor4;

	

	System.out.println("A soma A+D é igual a "+ terceiraA);

	System.out.println("A multiplicação A*D é igual a "+ terceiraM);

	System.out.println("\n");

	

	int quartaA = valor2+valor3;

	int quartaM = valor2*valor3;

	

	System.out.println("A soma B+C é igual a "+ quartaA);

	System.out.println("A multiplicação B*C é igual a "+ quartaM);

	System.out.println("\n");

	

	int quintaA = valor2+valor4;

	int quintaM = valor2*valor4;

	

	System.out.println("A soma B+D é igual a "+ quintaA);

	System.out.println("A multiplicação B*D é igual a "+ quintaM);

	System.out.println("\n");

	

	int sextaA = valor3+valor4;

	int sextaM = valor3*valor4;

	

	System.out.println("A soma C+D é igual a "+ sextaA);

	System.out.println("A multiplicação C*D é igual a "+ sextaM);

	System.out.println("\n");

	

	}

}

