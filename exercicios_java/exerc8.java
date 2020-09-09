package exercicios_java;

import java.util.Scanner;

public class exerc8 {
	/*
	 * O custo ao consumidor de um carro novo é a s
	 * oma do custo de fábrica com a percentagem do distribuidor e dos impostos (aplicad
	 * os ao custo de fábrica). Supondo que a percentagem do distribuidor seja de 28% 
	 * e os impostos de 45%, escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor.
	 */
	public static void main(String[] args)
	{
		double custoConsumidor, custoFabricacao = 0;
		
		Scanner tec = new Scanner(System.in);
				System.out.printf("Custo de fábrica um carro novo é de: ");
				
		custoConsumidor=custoFabricacao+(custoFabricacao*0.28)+(custoFabricacao*0.45);
		System.out.printf("O custo do consumidor de um carro é de: "+ custoConsumidor);
		
		tec.close();
	}
	                 }
