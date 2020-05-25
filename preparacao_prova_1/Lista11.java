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


   System.out.println("digite o numero da sua resid�ncia (digite numero = 0 para terminar): ");
   numeroResidencia = leia.nextInt();

   if (numeroResidencia == 0) {
    break;
   }

   if (numeroResidencia < 0) {

    System.out.println("O NUMERO DEVE SER MAIOR QUE ZERO!! ");
    continue;
   }

   do {
    System.out.println("digite a quantidade de kwt consumida: ");
    kwtConsumido = leia.nextFloat();
    if (kwtConsumido < 0) {
     System.out.println("O NUMERO DE KWT CONSUMIDOS DEVE SER MAIOR QUE ZERO! ");
    }
   } while (kwtConsumido < 0);

   if (kwtConsumido < kwtMenor) {
    kwtMenor = kwtConsumido;
	casaMenorConsumo = numeroResidencia;
   }

   valorASerPago = kwtConsumido * (float) 0.30;

   if (valorASerPago <= 100) {

    valorPagoLiquido = valorASerPago * 85 / 100;
    casasComDesconto++;
   } else if (valorASerPago > 100) {
    valorPagoLiquido = valorASerPago;
    casasSemDesconto++;
   }



   System.out.println("a quantidade de KWT consumida foi: " + kwtConsumido);
   System.out.println("o valor bruto a ser pago �: " + real.format(valorASerPago));
   System.out.println("o valor l�quido a ser pago �: " + real.format(valorPagoLiquido));

   casasTotal++;

  } while (true);

  if(casasTotal != 0 ){
  	porcentagemCasa = 100 * casasSemDesconto / casasTotal;
  }
  else{
  	porcentagemCasa = 0;
  }
  System.out.println("o numero da residencia com menor consumo �: " + casaMenorConsumo);
  System.out.println("a porcentagem de casas que consomem mais de R$100 �: " + porcentagemCasa + "%");

 }

}