import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista11 {

 public static void main(String[] args) {
  // TODO Auto-generated method stub

  Scanner leia = new Scanner(System.in);
  DecimalFormat real = new DecimalFormat("R$ #,##0.00");

  int numeroResidencia;
  float kwtConsumido = 0;
  float valorASerPago = 0;
  float valorPagoLiquido = 0;
  int casasComDesconto = 0;
  int casasTotal = 0;
  float kwtMenor = 999999999;
  int casasSemDesconto = 0;
  float porcentagemCasa;
  int casaMenorConsumo = 0;

  do {

   casasTotal++;

   System.out.println("digite o numero da sua residência (digite numero = 0 para terminar): ");
   numeroResidencia = leia.nextInt();

   if (numeroResidencia == 0) {

    break;
   }

   if (numeroResidencia < 0) {

    System.out.println("O NUMERO DEVE SER MAIOR QUE ZERO!! ");
   }

   do {
    System.out.println("digite a quantidade de kwt consumida: ");
    kwtConsumido = leia.nextFloat();

    if (kwtConsumido < 0) {
     System.out.println("O NUMERO DE KWT CONSUMIDOS DEVE SER MAIOR QUE ZERO! ");
    }
   } while (kwtConsumido < 0);

   if (kwtConsumido < kwtMenor) {
    kwtConsumido = kwtMenor;
    numeroResidencia = casaMenorConsumo;

   }

   valorASerPago = kwtConsumido * (float) 0.30;

   if (valorASerPago <= 100) {

    valorPagoLiquido = valorASerPago * 85 / 100;
    casasComDesconto++;
   } else if (valorASerPago > 100) {
    valorPagoLiquido = valorASerPago;
    casasSemDesconto++;
   }


   casasTotal++;

   System.out.println("a quantidade de KWT consumida foi: " + kwtConsumido);
   System.out.println("o valor bruto a ser pago é: " + real.format(valorASerPago));
   System.out.println("o valor líquido a ser pago é: " + real.format(valorPagoLiquido));


  } while (true);

  porcentagemCasa = 100 * casasSemDesconto / casasTotal;
  System.out.println("o numero da residencia com menor consumo é: " + casaMenorConsumo);
  System.out.println("a porcentagem de casas que consomem mais de R$100 é: " + porcentagemCasa);



 }

}