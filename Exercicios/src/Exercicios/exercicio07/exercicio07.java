package Exercicios.exercicio07;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o tamanho do lado do quadrado: ");
		double lado = scan.nextDouble();
		
		// area = lado * lado
		double area = Math.pow(lado, 2);
		
		System.out.println("A area do quadrado é:" + area);
		System.out.println("O dobreo da area do quadrado é: " + (area * 2));

	}

}
