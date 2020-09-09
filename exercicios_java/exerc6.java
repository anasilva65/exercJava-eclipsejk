package exercicios_java;

import java.util.Scanner;

public class exerc6 {
	/*
	 *  Construa um programa em c que, tendo como dados de entrada dois pontos 
	 *	quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é:
	 *	d = 1/2((x2 - x1)² + (y2 - y1))²
	 */
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		double x1, x2, y1, y2, d;
		
		System.out.print("Digite o X1: ");
		x1 = kb.nextDouble();
		
		System.out.print("Digite o X2: ");
		x2 = kb.nextDouble();
		
		System.out.print("Digite o Y1: ");
		y1 = kb.nextDouble();
		
		System.out.print("Digite o Y2: ");
		y2 = kb.nextDouble();
		
		
		d = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));

		System.out.printf("\nA distância entre eles é: %.2f", d);
		
		kb.close();
	}

}
