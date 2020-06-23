import java.util.Scanner;

public class exProf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Scanner leia = new Scanner(System.in);
		
		//int teste [][] = new int [2][2];
		int linha = 3;
		int coluna= 2;
	
  int matrix_transpose[][] = new int[coluna][linha];
		int[][] matriz = {
			      { 1, 2, },
			      { 5, 6,  },
			      { 9843, 432 }
		};

/*		for (int i=0;i<linha;i++) { // linha
			
			for (int j=0; j<coluna; j++) { //coluna
				
				System.out.println("informe o " + " " + (j+1) + " " + "numero da" + " " + (i+1) + " " + "linha: " );
				teste [i][j] = leia.nextInt();
				
				
				
			}
			
		}*/

		/*for (int i=0;i<linha;i++) {
			for (int j=0; j<coluna; j++) {
				
				System.out.println(teste[i][j]);
				
				
			}
		} */
	
  //

	for (int i = 0; i < linha; i++) {

   for (int j = 0; j < coluna; j++)

   {

    System.out.print(matriz[i][j]);
    System.out.print('\t');
   }

   System.out.println("\n");

  }
		
				System.out.println("==============================================================\n");

	for (int i=0;i<linha;i++) {
			for (int j=0; j<coluna; j++) {
				matrix_transpose[j][i] = matriz[i][j];
				
			}
		}



	for (int i = 0; i < coluna; i++) {

   for (int j = 0; j < linha; j++)

   {

    System.out.print(matrix_transpose[i][j]);
    System.out.print('\t');
   }

   System.out.println("\n");

  }
		


	}

}