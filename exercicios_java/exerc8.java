package exercicios_java;

import java.util.Scanner;

public class exerc8 {
	/*
	 * O custo ao consumidor de um carro novo � a s
	 * oma do custo de f�brica com a percentagem do distribuidor e dos impostos (aplicad
	 * os ao custo de f�brica). Supondo que a percentagem do distribuidor seja de 28% 
	 * e os impostos de 45%, escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor.
	 */
	public static void main(String[] args)
	{
		double custoConsumidor, custoFabricacao = 0;
		
		Scanner tec = new Scanner(System.in);
				System.out.printf("Custo de f�brica um carro novo � de: ");
				
		custoConsumidor=custoFabricacao+(custoFabricacao*0.28)+(custoFabricacao*0.45);
		System.out.printf("O custo do consumidor de um carro � de: "+ custoConsumidor);
		
		tec.close();
	}
	                 }
