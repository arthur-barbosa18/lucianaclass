import java.text.*;
import java.util.*;
import java.lang.Math;

public class Main {

 public static void main(String[] argv) throws Exception {

  //ArrayList<User> arr_user = new ArrayList<User>();
  int n_linha = 2;
  int n_coluna = 2;
  Random gerador = new Random();
  String keep;
  Scanner scanner = new Scanner(System.in);
  float nota;
  float contAluno;
  float contNota;
  float somaNotaAluno;
  float[] mediasAlunos = new float[n_linha];
  float[][] matrixNotas = new float[n_linha][n_coluna];
  float soma = 0;
  float soma_total = 0;
  float mediaTurma;




  for (int linha = 0; linha < n_linha; linha++) {

    System.out.print("Digite as notas do aluno: " + (linha + 1));
    System.out.print("\n");
    soma = 0;
   for (int coluna = 0; coluna < n_coluna; coluna++) {
    //matrixNotas[linha][coluna] = gerador.nextFloat(); //como gerar numero aleatorio
    //System.out.println(matrixNotas[linha][coluna]); //imprimindo só para ver o resultado
    matrixNotas[linha][coluna] = scanner.nextFloat();
    soma = soma + matrixNotas[linha][coluna];
   }
   mediasAlunos[linha] =  soma/n_coluna;
   soma_total = soma_total + soma;
  }

  mediaTurma = soma_total/(n_linha * n_coluna);
  // Como imprimir bonitinho uma matrix
  // professor não mandou fazer

 /* for (int i = 0; i < n_linha; i++) {

   for (int j = 0; j < n_coluna; j++)

   {

    System.out.print(matrixNotas[i][j]);
    System.out.print('\t');
   }

   System.out.println("\n");

  }*/

   System.out.format("%s %40s %40s", "número do aluno", "média do aluno", "média da turma\n");

    for(int index=1; index<=n_linha;index++){
    System.out.format("%d %48f %40f\n", index, mediasAlunos[index-1], mediaTurma);

    }   
 }

}


