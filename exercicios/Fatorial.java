import java.text.DecimalFormat;
import java.util.Scanner;

public class Fatorial {

 public static void main(String[] args) {
  // TODO Auto-generated method stub

  Scanner leia = new Scanner(System.in);
  int resultado;
  int numero;
  do {
        
        System.out.print("digite o número que deseja obter o fatorial: ");
        numero = leia.nextInt();

        
        if (numero<0) { 
          System.out.print("digite um numero que seja inteiro!\n");
          
        }
          
        
      } while (numero<0); //verificar o tipo se é inteiro, menor que 0 não verifica se é inteiro

    resultado =  numero;
    if (numero == 0) resultado++;
    while (numero > 1) resultado *= --numero;


    System.out.print("\nO resultado do fatorial é " + resultado);


  }

 }

 //https://codebeautify.org/javaviewer