package lista4;

import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner leia = new Scanner(System.in);
		
		
		float matriz[][] = new float [3][3];
		int linha = 3;
		int coluna = 3;
		float soma;
		float produto;
		float positivos=0;
		float maior = 0;
		float menor = 100000000;
		
		for (int i=0; i<linha; i++) {
			for (int c=0; c<coluna; c++) {
				System.out.println("informe o " + " " + (c+1) + " " + "numero da" + " " + (i+1) + " " + "linha: " );
				matriz[i][c] = leia.nextFloat();
				
				if (matriz[i][c]>maior) {
					maior = matriz[i][c];
				}
				
				else if (matriz[i][c]<menor) {
					menor = matriz [i][c];
				}
				
				else if (matriz[i][c]>0) {
					positivos++;
				}
			}
		}
		
		soma =  matriz[0][0]  + matriz[0][1] + matriz[1][1] + matriz[2][2] + matriz[1][2] + matriz[2][0] + matriz[0][2] + matriz[1][0] + matriz[2][1];
		
		produto =  matriz[0][0]  * matriz[0][1] * matriz[1][1] * matriz[2][2] * matriz[1][2] * matriz[2][0] * matriz[0][2] * matriz[1][0] * matriz[2][1];
		
	    System.out.println("=======================================================");
		System.out.println("a soma é: " + soma);
		System.out.println("o produto é: " + produto);
		System.out.println("o MAIOR valor na matriz é: " + maior);
		System.out.println("o MENOR valor na matriz é: " + menor);
		System.out.println("a quantidade de numeros positivos é: " + positivos);
		
		
	}

}
