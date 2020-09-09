package exercicios_java;

import java.util.Scanner;

public class exerc4 {
	/*
	 * 4. Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte express�o: 
	 *	D = R + S / 2
	 *	, onde
	 *	R = (A + B)²
	 *	S = (B + C)²
     *
	 */
	public static void main(String[] args) 
	{
		double A, B, C, D, R, S;
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Digite o A: ");
		A = tec.nextInt();
		
		System.out.print("Digite o B: ");
		B = tec.nextInt();
		
		System.out.print("Digite o C: ");
		C = tec.nextInt();
		
		R = Math.pow((A + B), 2);
		S = Math.pow((B + C), 2);
		D = (R + S) / 2; 

		System.out.println("O resultado é: " + D);
		
		tec.close();
	}

}
