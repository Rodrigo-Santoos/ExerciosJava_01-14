package Exercicios.exercicio06;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o raio do circulo: ");
		double raio = scan.nextDouble();
		
		double area = Math.PI * Math.pow (raio, 2);
		
		System.out.println("A area do circulo �: " + area);
	}

}
