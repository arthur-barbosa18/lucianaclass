import java.text.DecimalFormat;
import java.util.Scanner;

public class Lista10 {

 public static void main(String[] args) {
  // TODO Auto-generated method stub

  Scanner leia = new Scanner(System.in);
  DecimalFormat porcentagem = new DecimalFormat("##%");

  int numeroCanal;
  int numeroPessoas = 0;
  int canalQuatro = 0;
  int canalCinco = 0;
  int canalSete = 0;
  int canalDoze = 0;
  int porCanalQuatro;
  int porCanalCinco;
  int porCanalSete;
  int porCanalDoze;

  do {

   System.out.println("para sair do programa digite numero do canal = 0");


   System.out.println("digite o numero do canal: ");
   numeroCanal = leia.nextInt();

   numeroPessoas++;

   if (numeroCanal == 0) {
    break;
   }

   do {


    if (numeroCanal < 0) {
     System.out.println("o numero do Canal deve ser maior que zero");
    } else if (numeroCanal != 4 && numeroCanal != 5 && numeroCanal != 7 && numeroCanal != 12) {

     System.out.println("o numero do Canal deve ser 4,5,7,12");
    } else if (numeroCanal == 4) {

     System.out.println("seu canal é o 4");
     canalQuatro++;
    } else if (numeroCanal == 5) {

     System.out.println("seu canal é o 5");
     canalCinco++;
    } else if (numeroCanal == 7) {

     System.out.println("seu canal é o 7");
     canalSete++;
    } else if (numeroCanal == 12) {

     System.out.println("seu canal é o 12");
     canalDoze++;

    }


   } while (numeroCanal < 0);

   numeroPessoas++;

  } while (true);



  porCanalQuatro = canalQuatro * 100 / numeroPessoas;
  porCanalCinco = canalCinco * 100 / numeroPessoas;
  porCanalSete = canalSete * 100 / numeroPessoas;
  porCanalDoze = canalDoze * 100 / numeroPessoas;

  System.out.println("o numero de pessoas assistindo é: " + numeroPessoas);
  System.out.println("a porcentagem de pessoas assistindo ao canal 4 é: " + porcentagem.format(porCanalQuatro));
  System.out.println("a porcentagem de pessoas assistindo ao canal 5 é: " + porcentagem.format(porCanalCinco));
  System.out.println("a porcentagem de pessoas assistindo ao canal 7 é: " + porcentagem.format(porCanalSete));
  System.out.println("a porcentagem de pessoas assistindo ao canal 12 é: " + porcentagem.format(porCanalDoze));













 }

}

//https://codebeautify.org/javaviewer