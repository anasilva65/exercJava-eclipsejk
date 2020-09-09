package exercicios_java;

import java.util.Scanner;

public class exerc1 {
	/*
	 * 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, 
	 * meses e dias e mostre-a expressa apenas em dias.
	 */
	public static void main(String[] args) {
		int anos, meses, dias, idadeDias;
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Qual a sua idade em anos: ");
		anos = tec.nextInt();
		
		System.out.print("Em meses: ");
		meses = tec.nextInt();
		
		System.out.print("Em dias: ");
		dias = tec.nextInt();
		
		idadeDias = (anos * 365) + (meses * 30) + dias;
		
		System.out.println("Sua idade em dias: " + idadeDias);
		
		tec.close();
	}

}
