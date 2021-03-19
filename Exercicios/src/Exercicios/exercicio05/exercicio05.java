package Exercicios.exercicio05;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite a quantidade em metros: ");
		double metros = scan.nextDouble();
		
		//1m = 100 cm
		
		double cm = metros * 100 ;
		
		System.out.println(metros + " m é igual a " + cm + " centimetros");

	}

}
