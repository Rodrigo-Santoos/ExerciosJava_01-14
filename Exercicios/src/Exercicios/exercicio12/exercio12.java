package Exercicios.exercicio12;

import java.util.Scanner;

public class exercio12 {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com a altura: ");
		double altura = scan.nextDouble();
		
		double pesoIdeal = (72.7 * altura) -58;
		
		System.out.println("O peso ideal é :" + pesoIdeal);

	}

}
