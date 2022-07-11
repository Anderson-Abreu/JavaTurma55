package VetorEMatriz;

import java.util.Scanner;

public class ExemploMatriz {

	public static void main(String[] args) {
		int matriz[][] = new int[3][4];
		int matriz1[][]= {{1,2,3},{6,7,8},{10,11,12}};
		
		Scanner ler = new Scanner(System.in);
		
		for(int x=0;x<3;x++)
			System.out.println(matriz1[x][x]);
		
		for(int linha=0;linha<3;linha++)
		{
			for(int coluna=0;coluna<4;coluna++)
			{
				System.out.print("\nDigite um valor: ");
				matriz[linha][coluna]=ler.nextInt();
			}
		}
		
		for(int linha=0;linha<3;linha++)
		{
			for(int coluna=0;coluna<4;coluna++)
			{
				System.out.print(matriz[linha][coluna]+"\t");
			}
			System.out.println();
		}
		
	}

}
