package Exercicios.exercicio14;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com o tamanho do arquivo: ");
		double tamArquivo = scan.nextDouble();
		
		System.out.print("Entre com a verlocidade da internet: ");
		double velocidade = scan.nextDouble();
		
		double tempo = tamArquivo / velocidade;
		
		System.out.println("Tempo de download: " + tempo);

	}

}
