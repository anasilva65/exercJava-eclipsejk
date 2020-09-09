package exercicios_java;

import java.util.Scanner;

public class exerc3 {
	/*
	 * .3 Faça um sistema que leia o tempo de duração de um evento em uma 
	 * fabrica expressa em segundos e mostre-o expresso em horas, minutos e segundos.
	 */
	public static void main(String[] args) 
	{
		int duracao, horas, minutos, segundos;
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Digite a duração do evento em segundos: ");
		duracao = tec.nextInt();
		
		horas = duracao / 3600;
		minutos = (duracao % 3600) / 60;
		segundos = (duracao % 3600) % 60;
		
		System.out.printf("O evento durou %d hora(s) %d minutos(s) %d segundo(s)", horas, minutos, segundos);
		
		tec.close();
	}
}
