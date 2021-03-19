package Exercicios.exercicio13;

import java.util.Scanner;

public class exercio13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Entre com o valor/hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Entre com as horas trabalhadas no mes: ");
		double horas = scan.nextDouble();
		
		double salarioBruto = valorHora  * horas;
		double inss = (salarioBruto / 100) * 8;
		double sindicato = (salarioBruto / 100) * 5;
		double ir = (salarioBruto / 100) * 11;
		double totalDescontos = inss + sindicato + ir ;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Salario Bruto: " + salarioBruto);
		System.out.println("Valor do INSS: " + inss);
		System.out.println("Valor sindicato: " + sindicato);
		System.out.println("Valor Imposto de Renda: " +ir);
		System.out.println("Valor do Desconto: " + totalDescontos);
		System.out.println("Valor Salario Liquido: " + salarioLiquido);
		

	}

}
