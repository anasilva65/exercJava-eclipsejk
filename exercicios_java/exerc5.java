package exercicios_java;

import java.util.Scanner;

public class exerc5 {
	/*
	 *  Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
	 *	aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
	 *	respectivamente.
	 */
	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		float n1, n2, n3, media;
		
		System.out.print("Digite a 1� nota: ");
		n1 = kb.nextFloat();
		
		System.out.print("Digite a 2� nota: ");
		n2 = kb.nextFloat();
		
		System.out.print("Digite a 3� nota: ");
		n3 = kb.nextFloat();
		
		media = (n1*2) + (n2*3) + (n3*5) / 10;

		System.out.printf("\nA sua m�dia �: %.1f", media);
		
		kb.close();
	}

}
