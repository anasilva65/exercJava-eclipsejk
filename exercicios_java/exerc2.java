package exercicios_java;

import java.util.Scanner;

public class exerc2 {
	/*Faça um sistema que leia a idade de uma pessoa expressa 
    em dias e mostre-a expressa em anos, meses e dias.
   */
	public static void main(String[] args) 
	{
	int anos, meses, dias, idadeDias;
	Scanner tec = new Scanner(System.in);
	
	System.out.print("Digite a sua idade: ");
	idadeDias = tec.nextInt();
	
	 anos=idadeDias;
     meses=(idadeDias*12);
	 dias=(idadeDias*365);
	 System.out.printf("A sua idade  é: " + anos+ " anos, "+ meses + " meses e " + dias, " dias");
		
		tec.close();
     }
}
