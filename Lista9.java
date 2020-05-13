import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista9 {

 public static void main(String[] args) {
  // TODO Auto-generated method stub

  Scanner leia = new Scanner(System.in);
  DecimalFormat real = new DecimalFormat("R$ #,##0.00");

  int h;
  int codigoFunc;
  int horasExtras;
  int horasFalt;
  int grat = 0;
  int max_value = 0;
  int numeroFuncionarios = 0;
  int gratTotal = 0;
  int mediaGrat;
  int gratMaior = 0;
  int maiorH = 0;
  int funcionario_maior_h=0;


for(int numeroFuncionarios=0; numeroFuncionarios<100; numeroFuncionarios++){

   System.out.println("calcule o H do seu funcionário (digite código do funcionário = 0 para finalizar)");

   System.out.println("digite o código do seu funcionário: ");
   codigoFunc = leia.nextInt();

   //numeroFuncionarios++;
   if (codigoFunc == 0) {

    break;
   }

   do {
    System.out.println("digite o numero de horas extras feitas pelo funcionário: ");
    horasExtras = leia.nextInt();

    if (horasExtras <= -1) {
     System.out.println("O NUMERO DE HORAS DEVE SER UM NUMERO POSITIVO");
    }
   } while (horasExtras <= -1);


   do {

    System.out.println("digite o numero de horas faltadas pelo funcionário: ");
    horasFalt = leia.nextInt();

    if (horasFalt <= -1) {
     System.out.println("O NUMERO DE HORAS DEVE SER UM NUMERO POSITIVO");
    }


   } while (horasFalt <= -1);



   h = (horasExtras - (horasFalt * 2 / 3));


   if (h < 600) {
    grat = 100;//tava 600, modifiquei para 100, como está no PDF
   } else if (h >= 600 && h <= 1200) {

    grat = 200;
   } else if (h >= 1201 && h <= 1499) {

    grat = 300;

   } else if (h >= 1500 && h <= 1800) {

    grat = 300;
    gratMaior++;
   } else if (h >= 1801 && h <= 2400) {

    grat = 400;
    gratMaior++;
   } else if (h > 2400) {

    grat = 500;
    gratMaior++;
   }

   gratTotal = gratTotal + grat;


   System.out.println("o código do funcionário é: " + " " + codigoFunc);
   System.out.println("o fator H do funcionário é: " + " " + h);
   System.out.println("a gratificação do funcionário é: " + " " + real.format(grat));
   System.out.println("===================================================================");

   if (h > max_value) {
    max_value = h;
    funcionario_maior_h = codigoFunc;
    //maiorH = h;
   }

   //numeroFuncionarios++;
}

  mediaGrat = gratTotal / numeroFuncionarios;

  String message_funcionario_do_ano = String.format("O fator H de maior valor foi: %s cujo código é %s", max_value, funcionario_maior_h);
  System.out.println(message_funcionario_do_ano);
  //System.out.println( " cujo codigo é: " + funcionario_maior_h);
  System.out.println("o média de gratificação dos funcionários foi: " + mediaGrat);
  System.out.println("o numero de funcionários com fator H maior que 1500 é: " + gratMaior);


 }

}