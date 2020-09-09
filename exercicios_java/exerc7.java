package exercicios_java;

import java.util.Scanner;

public class exerc7 {
	/*
	 * Um sistema de equações lineares do tipo: , pode ser resolvido segundo mostrado abaixo : 
Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y.
	 */
	public static void main(String[] args)
	{
	Scanner kb = new Scanner(System.in);

	double a,b,c,d,e,f,x,y; 

	System.out.print("Entre com o valor de A: ");
	a = kb.nextDouble();
	
	System.out.print("Entre com o valor de B: ");
	b = kb.nextDouble();
	
	System.out.print("Entre com o valor de C: ");
	c = kb.nextDouble();
	
	System.out.print("Entre com o valor de D: ");
	d = kb.nextDouble();
	
	System.out.print("Entre com o valor de E: ");
	e = kb.nextDouble();
	
	System.out.print("Entre com o valor de F: ");
	f = kb.nextDouble();

	x = (c*e - b*f)/(a*e - b*d);
	y = (a*f - c*d)/(a*e - b*d);

	System.out.printf("\nValor de X: " +x);
	System.out.printf("\nValor de Y: " +y);
	kb.close();
	}
}

