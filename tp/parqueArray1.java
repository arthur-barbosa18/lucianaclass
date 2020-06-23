import java.text.DecimalFormat;
import java.util.Scanner;

public class parqueArray1 {

/*
Escrever uma plataforma para a rede de parques de divers�o Reino M�gico, onde os visitantes possam comprar ingresso para os parques.
Nela, eles dever�o escrever o nome do comprador, a quantidade de ingressos para cada parque eles desejam comprar, e, 
no final, se desejam comprar o FastPass (que d� acesso � fila priorit�ria em todas as atra��es). Os parques s�o: 

1: Reino M�gico 
2: Safari Encantado 
3: Ilha da Aventura 
4: Est�dios de Hollywood 

O pre�o de cada ingresso � R$80, enquanto o adicional do FastPass � R$30. Como resultado intermedi�rio, 
deve-se imprimir o nome do comprador, a quantidade de ingressos que foi comprada para cada parque, a 
quantidade de FastPass, bem como o total da compra. Como resultado final deve-se imprimir o total arrecadado, 
qual o maior n�mero de venda de ingressos para um �nico parque, e a quantidade de FastPass vendida. 
Tamb�m dever� ser impresso um relat�rio final com os resultados intermedi�rios.

*N�o se pode receber valores negativos
** Para sair do programa o usu�rio deve digitar �sair� no nome
* o n�mero m�ximos de vendas por dia � 2000.
*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner (System.in);
		DecimalFormat real = new DecimalFormat("R$ #,##0.00");
		
		int fastPass [] = new int [2000];
		int safari[]= new int [2000];
		int reino[] = new int [2000];
		int ilha[] = new int [2000];
		int holly[] = new int [2000];
		String nome[]=new String[2000];
		int	maior = 0;
		int indexMaior = 0;
		int totalSafari=0;
		int totalReino=0;
		int totalIlha=0;
		int totalHolly=0;
		int totalFastPass=0;
		float totalAPagar [] = new float [2000];
		float totalArrecadado=0;
		int contador;
		
		for (contador=0;contador<2000;contador++) {
				System.out.println("===COMPRE SEUS INGRESSOS PARA A REDE REINO M�GICO===\n");
				System.out.println("digite seu nome(digite sair para sair: )");
				leia.nextLine().strip();
				nome[contador] = leia.nextLine().strip();

				System.out.println("                                                      ");

				if (nome[contador].equalsIgnoreCase("sair")) {
					break;
				}

				System.out.println("quantos ingressos deseja para o parque Safari Encantado?");
				safari[contador]=leia.nextInt();

				do {
				//!Integer.class.isInstance(safari[contador]) 

				if(safari[contador]<0) {
					System.out.println("digite um n�mero positivo por favor");
				}
				
				else if (safari[contador]>0) {
					totalSafari += safari[contador];
				}
				
				}while (safari[contador]<0);
				
				
				do {
					System.out.println("quantos ingressos deseja para o parque Reino M�gico?");
					reino[contador]=leia.nextInt();
					
					if(reino[contador]<0) {
						System.out.println("digite um n�mero positivo por favor");
					}
					
					else if(reino[contador]>0) {
						totalReino+=reino[contador];
					}
					
				}while (reino[contador]<0);
				
				do {
					System.out.println("quantos ingressos deseja para o parque Ilha da Aventura?");
					ilha[contador]=leia.nextInt();
					
					if(ilha[contador]<0) {
						System.out.println("digite um n�mero positivo por favor");
					}
					
					else if(ilha[contador]>0) {
						totalIlha += ilha [contador];
					}
					
				}while (ilha[contador]<0);
				
				do {
					System.out.println("quantos ingressos deseja para o parque Est�dios de Hollywood?");
					holly[contador]=leia.nextInt();
					
					if(holly[contador]<0) {
						System.out.println("digite um n�mero positivo por favor");
					}
					else if(holly[contador]>0) {
						totalHolly += holly[contador];
					}
					
					
				}while (holly[contador]<0);
				
				do {
					
					System.out.println("quantos fast pass deseja comprar?");
					fastPass[contador]=leia.nextInt();
					
					if (fastPass[contador]<0) {
						System.out.println("digite um n�mero positivo por favor");
					}
					
					else if(fastPass[contador]>0) {
						totalFastPass += fastPass[contador];
					}
					
				}while(fastPass[contador]<0);
				
				totalAPagar [contador]= (ilha[contador]*80) + (safari[contador]*80) + (holly[contador]*80) + (reino[contador]*80) + (fastPass[contador]*30);
				
				totalArrecadado += totalAPagar [contador];
				System.out.println("==============================================================");
				System.out.println(nome[contador]);
				System.out.println("total a pagar: " + real.format(totalAPagar[contador]));
				System.out.println("a quantidade de ingressos vendidas para o Safari Encantado foi: " + safari[contador]);
				System.out.println("a quantidade de ingressos vendidas para o Reino M�gico foi: " + reino[contador]);
				System.out.println("a quantidade de ingressos vendidas para a Ilha da Aventura foi: " + ilha[contador]);
				System.out.println("a quantidade de ingressos vendidas para o Est�dios de Hollywood foi: " + holly[contador]);
				System.out.println("a quantidade de FastPass vendida foi: " + fastPass[contador]);
				System.out.println("==============================================================\n");
			}
			
			System.out.println("==========================  TOTAL  ====================================\n");
			System.out.println("Safari Encantado: " + totalSafari);
			System.out.println("Reino M�gico: " + totalReino);
			System.out.println("Ilha Aventura: " + totalIlha);
			System.out.println("Hollywood: " + totalHolly);
			System.out.println("FastPass: " + totalFastPass);

			System.out.println("total arrecadado: " + totalArrecadado);
			int totalParques[] = {totalSafari, totalReino, totalIlha, totalHolly, totalFastPass};
			for(int count=0; count<4; count++){
				if(totalParques[count] > maior){
					maior = totalParques[count];
					indexMaior = count; //a toa, in�til
				}
			}			
			System.out.println("O maior n�mero de ingressos vendidos a um �nico parque foi igual a \n" + maior);
			System.out.println("\n");
			
			
			for(int i=0; i<(contador); i++) {
				
				System.out.println("==============================================================\n");
				System.out.println("nome do passageiro: " + nome[i]);
				System.out.println("total a pagar: " + real.format(totalAPagar[i]));
				System.out.println("a quantidade de ingressos vendidas para o Safari Encantado foi: " + safari[i]);
				System.out.println("a quantidade de ingressos vendidas para o Reino M�gico foi: " + reino[i]);
				System.out.println("a quantidade de ingressos vendidas para a Ilha da Aventura foi: " + ilha[i]);
				System.out.println("a quantidade de ingressos vendidas para o Est�dios de Hollywood foi: " + holly[i]);
				System.out.println("a quantidade de FastPass vendida foi: " + fastPass[i]);
				System.out.println("==============================================================\n");
			}
			System.out.println("==========================  FIM  ====================================\n");
			
		
	   
			
	
		
	}

}
