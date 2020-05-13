import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista10 {

 public static void main(String[] args) {
  // TODO Auto-generated method stub

  Scanner leia = new Scanner(System.in);
  DecimalFormat porcentagem = new DecimalFormat("##%");

  int numeroCanal;
  int audiencia_total = 0;
  int audiencia = 0;
  int canalQuatro = 0;
  int canalCinco = 0;
  int canalSete = 0;
  int canalDoze = 0;
  int total_canal_Quatro = 0;
  int total_canal_Cinco = 0;
  int total_canal_Sete = 0;
  int total_canal_Doze = 0;
  float porCanalQuatro;
  float porCanalCinco;
  float porCanalSete;
  float porCanalDoze;
  String question_watch;

  for (int i = 0; i >= 0; i++) {

   System.out.println("para sair do programa digite numero do canal = 0");

   System.out.println("digite o numero do canal: ");
   numeroCanal = leia.nextInt();


     if (numeroCanal == 0) {
      break;
   }

   while (numeroCanal != 4 && numeroCanal != 5 && numeroCanal != 7 && numeroCanal != 12) {
    System.out.println("o numero do Canal deve ser 4,5,7,12");
    numeroCanal = leia.nextInt();
   }


   question_watch = String.format("Quantas pessoas assistiram ao canal %s?", numeroCanal);

   System.out.println(question_watch);
   audiencia = leia.nextInt();

   while (audiencia <= 0) {
    System.out.println(String.format("O número de pessoas assistindo ao canal %s deve ser maior que 0", numeroCanal));
    audiencia = leia.nextInt();
   }

   audiencia_total = audiencia_total + audiencia;

   if(numeroCanal == 4){
    //total_canal_Quatro = total_canal_Quatro + audiencia;
    total_canal_Quatro += audiencia;
   } else if(numeroCanal == 5){
      total_canal_Cinco += audiencia;
   } else if(numeroCanal == 7){
      total_canal_Sete += audiencia;
   } else if(numeroCanal == 12){
      total_canal_Doze += audiencia;
   }

  }

   System.out.println("total_canal_Quatro" + total_canal_Quatro);

   porCanalQuatro = (float) total_canal_Quatro / (float) audiencia_total;
   porCanalCinco =  (float) total_canal_Cinco / (float) audiencia_total;
   porCanalSete =  (float) total_canal_Sete / (float) audiencia_total;
   porCanalDoze =  (float) total_canal_Doze /(float) audiencia_total;

   System.out.println("o numero de pessoas assistindo é: " + audiencia_total);
   System.out.println("a porcentagem de pessoas assistindo ao canal 4 é: " + porcentagem.format(porCanalQuatro));
   System.out.println("a porcentagem de pessoas assistindo ao canal 5 é: " + porcentagem.format(porCanalCinco));
   System.out.println("a porcentagem de pessoas assistindo ao canal 7 é: " + porcentagem.format(porCanalSete));
   System.out.println("a porcentagem de pessoas assistindo ao canal 12 é: " + porcentagem.format(porCanalDoze));


  }

 }

 //https://codebeautify.org/javaviewer