package Exercicios.exercicio04;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a primerira nota: ");
		int n1 = scan.nextInt();
		
		System.out.print("Digite a segunda nota: ");
		int n2 = scan.nextInt();
		
		System.out.print("Digite a terceira nota: ");
		int n3 = scan.nextInt();
		
		System.out.print("Digite a quarta nota: ");
		int n4 = scan.nextInt();
		
		int media = (n1 + n2 + n3 + n4) / 4;
		
		System.out.println("A media é: " + media);

	}

}
