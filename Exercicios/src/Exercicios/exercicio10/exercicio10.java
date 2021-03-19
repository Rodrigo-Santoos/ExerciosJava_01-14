package Exercicios.exercicio10;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.print("Digite a temperatura em Celsius: ");
		double celsius = scan.nextDouble();
		
		double F = (celsius * 1.8) + 32;
		
		System.out.println("A temperatura " + celsius + " C é igual a " + F + " F");
		

	}

}
