package VetorEMatriz;

import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		int vetor[] = new int[6];
		int vetor1[]= {1,2,3,4,5,6};
		
		int soma=0, cont=0;
		
		Scanner ler = new Scanner(System.in);
		
	//	System.out.println(vetor1[0]);
		//System.out.println(vetor1[4]);
		
		vetor1[3]=10;

		for(int indice=0;indice<6;indice++)
		{
			System.out.print(vetor1[indice]+"\t");
		}
		System.out.println();
		
		
		for(int indice=0;indice<6;indice++)
		{
			System.out.print("\nDigite uma idade: ");
			vetor[indice]=ler.nextInt();
			soma=soma+vetor[indice];
			cont++;
		}
		
		System.out.println("\nAs idades informadas foram:");
		
		for(int indice=0;indice<6;indice++)
		{
			System.out.print(vetor[indice]+"\t");
		}
		System.out.print("\nA média das idades é: "+soma/cont);
	}

}
