package Repeticao;

import java.util.Scanner;

public class ExemploWhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n1,n2;
		
		System.out.println("\nDigite um numero: ");
		n1=ler.nextInt();
		System.out.println("\nDigite o segundo numero: ");
		n2=ler.nextInt();
		while(n2!=0)
		{
			System.out.println("A divisão é: "+ n1/n2);	
			System.out.println("\nDigite um numero: ");
			n1=ler.nextInt();
			System.out.println("\nDigite o segundo numero: ");
			n2=ler.nextInt();
		}
		System.out.println("Erro não existe divisão por ZERO!!! \n FIM DO PROGRAMA");

	}

}
