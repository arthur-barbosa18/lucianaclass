import java.util.Scanner;

public class Lista7Tentativa2 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

Scanner leia = new Scanner (System.in); 
    
    float peso=0;
    float altura=0;
    float imc=0;
    float alunosObsesos=0;
    float alunosAbaixoPeso=0; 
    float maiorIMC=0;
    float percentualAlunos=0; 
    int numeroAlunos = 1; 
    float somaIMC=0;
    float mediaIMC=0;
    String nomeDoAluno;
    
  
    
    do { 
      System.out.println("digite alutura = 0 para sair do programa");
      System.out.print("digite o nome do aluno: ");
      nomeDoAluno = leia.next();
      
    numeroAlunos++; 
      
    do { 

      System.out.print("digite a altura do aluno: ");
      altura = leia.nextFloat();
      
      
    if (altura<0 || altura > 3) { 
      System.out.print("altura inválida ");
      
    }
    
    
    } while (altura < 0 || altura > 3); 
    if (altura == 0) {
    break;
    }
    
    do { 
      System.out.print("digite o peso do aluno: ");
      peso = leia.nextFloat();
      
      if (peso < 0) { 
        System.out.print("peso inválido");
      } 
             
    } while (peso < 0);
    
        imc = peso/(altura*altura); 
        somaIMC++;
        
        if (imc <= 18.4) { 
        System.out.println(nomeDoAluno + " " + "esta abaixo do peso");
        alunosAbaixoPeso ++;
      } else if (imc >= 18.5 && imc <= 24.9) {
        System.out.println(nomeDoAluno + "" + "esta com o peso normal"); 
      } else if (imc >= 25 && imc <= 29.9) {
        System.out.println(nomeDoAluno + " " + "esta com sobrepeso");     
      } else { 
        System.out.println(nomeDoAluno + " " + "esta com obesidade");
        alunosObsesos ++;
      }
        
        if (imc > maiorIMC) {
            maiorIMC = imc;
      }
        numeroAlunos++;
         
              
    } while (true);
  
    
    percentualAlunos = (alunosObsesos*100)/numeroAlunos;
    mediaIMC = somaIMC/numeroAlunos;
        
     System.out.println("o maior IMC é " + " " + maiorIMC);
     System.out.println("o numero de alunos abaixo do peso é" + " " + alunosAbaixoPeso); 
     System.out.println("a porcentagem de alunos obesos é" + " " + percentualAlunos);
     System.out.println("a média do IMC é" + " " + mediaIMC);
    
         
      
  }



  }