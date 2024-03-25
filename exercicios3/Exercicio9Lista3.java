package exercicios3;

import java.util.Scanner;

public class Exercicio9Lista3 {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	
    System.out.println("Digite o valor do salário mensal:");
    double salario = sc.nextDouble();
    
    System.out.println("Digite o percentual de reajuste:");
    double reajuste = sc.nextDouble();
    
    double novoSalario = salario * (1 + reajuste / 100);
    
    System.out.println("O novo salário é: " + novoSalario);

	}
}
