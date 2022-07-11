/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
*/
package Repeticao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int mv=0,mc=0,idade;
		Scanner ler = new Scanner(System.in);
		System.out.print("\nDigite sua idade:");
		idade=ler.nextInt();
		while(idade!=-99)
		{
			if(idade<21)
			{	
				mv++;
			}
			if(idade>50)
				mc++;
			System.out.print("\nDigite sua idade:");
			idade=ler.nextInt();
		}
		System.out.println("\nO total de pessoas com menos de 21 é: "+mv);
		System.out.println("\nO total de pessoas com mais de 50 é: "+mc);
	}

}
