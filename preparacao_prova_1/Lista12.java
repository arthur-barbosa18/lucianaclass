import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista12 {

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
  String ruaMenorConsumo = "";
  int qntdRuas;
  String nomeDaRua;

  System.out.println("digite quantas ruas serão pesquisadas!");
  qntdRuas = leia.nextInt();

  for(int item=0; item<qntdRuas;item++){
     leia.nextLine();
     System.out.println("digite o nome da Rua (digite nome da rua = Fim para terminar): ");
     nomeDaRua = leia.nextLine();

     if(nomeDaRua.equalsIgnoreCase("fim")){
        break;
     }

    do {

     System.out.println("digite o numero da sua residência ");
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
      leia.nextLine();

      if (kwtConsumido < 0) {
       System.out.println("O NUMERO DE KWT CONSUMIDOS DEVE SER MAIOR QUE ZERO! ");
      }
     } while (kwtConsumido < 0);

     if (kwtConsumido < kwtMenor) {
      kwtMenor = kwtConsumido;
      casaMenorConsumo = numeroResidencia;
      ruaMenorConsumo = nomeDaRua;
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
     System.out.println("o valor bruto a ser pago é: " + real.format(valorASerPago));
     System.out.println("o valor líquido a ser pago é: " + real.format(valorPagoLiquido));

     casasTotal++;

    } while (true);

    if(casasTotal != 0 ){
      porcentagemCasa = 100 * casasSemDesconto / casasTotal;
    }
    else{
      porcentagemCasa = 0;
    }

    System.out.println(String.format("a porcentagem de casas situadas na rua %s que consomem mais de R$100 é %s: ", nomeDaRua, porcentagemCasa));
   }
   System.out.println(String.format("A residência situada em %s, nº: %s tem o menor consumo de energia elétrica", ruaMenorConsumo, casaMenorConsumo));
  }
}