package Repeticao;

import java.util.Scanner;

public class ExemploFor {

	public static void main(String[] args) {
		
		int n1, n2, soma=0;
		Scanner ler = new Scanner(System.in);
		System.out.print("Escolha qual é a tabuada de inicio: ");
		n1=ler.nextInt();
		System.out.print("Escolha qual é a tabuada de fim: ");
		n2=ler.nextInt();
		
		for(int y=1;y<=10;y++)
		{
			System.out.println("\nTABUADA DO "+y+"\n");
		
			for(int x=1;x<=10;x++)
			{
				System.out.println(y+" X "+x+" = "+y*x);
			
			}
		}
		for(int x=1;x<=10;x++)
		{
			System.out.println("\nDigite um numero");
			n1=ler.nextInt();
			if(n1%2==0)
				soma=soma+n1;
			
		}
		System.out.println("\nOs valores somados são: "+soma);
		
	}

}
