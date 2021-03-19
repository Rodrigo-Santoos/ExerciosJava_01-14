package Exercicios.exercicio09;

import java.util.Scanner;

public class exercio09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite a temperatura em Farenheit: ");
		double temper = scan.nextDouble();
		
		double celsius = (5 * (temper -32) /9);
		
		System.out.println("A temperatura " + temper + " F é igual a " + celsius + " C" );

	}

}
