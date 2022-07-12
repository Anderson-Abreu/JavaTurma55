package VetorEMatriz;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int v[] = new int[5];
		int maior=0;
		
		Scanner ler = new Scanner(System.in);
		
		for(int x=0;x<5;x++)
		{
			System.out.print("\nDigite um valor: ");
			v[x]=ler.nextInt();
			if(v[x]>maior)
				maior=v[x];
		}
		System.out.println("\nO maior valor é: "+maior);

	}

}
