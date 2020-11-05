import java.text.*;
import java.util.*;
import java.lang.Math;


public class Main {

/*    public float calculaIMC(float altura, float peso, int[] v10){
        float imc = (peso/(altura*altura));
        altura = altura*4;
        v10[0] = 2;
        return imc;
    }
*/

    public static float calculaSalario(int nPecas){
        if(nPecas >= 1 && nPecas <=200){
            return (float) 2.0*nPecas;
        }
        if(nPecas >=201 && nPecas <= 400){
            return (float) 2.3*nPecas;
        }
        else{
            return (float) 2.5*nPecas;
        }
    }

    public static boolean validateCodEmpregado(String codEmpregado, String nomeEmpregado) {
        if (codEmpregado.length() != 5) {
            System.out.println("O codigo do empregado tem mais que 5 caracteres");
            return false;
        }
        if (codEmpregado.charAt(0) != nomeEmpregado.charAt(0) || codEmpregado.charAt(1) != nomeEmpregado.charAt(1)) {
            System.out.println("As duas primeiras posições código não são iguais ao nome do empregado");

            return false;
        }
        if (!(codEmpregado.substring(2).chars().allMatch(Character::isDigit))) {
            System.out.println("as 3 últimas não são dígitos");
            return false;
        }
        return true;
    }

    public static boolean validateNomeEmpregado(String nomeEmpregado) {
        if (nomeEmpregado.length() < 2) {
            return false;
        }
        return true;
    }

    public static boolean validateNPecas(int nPecas){
        return nPecas >= 1;
    }


//non-static method validateNomeEmpregado(String) cannot be referenced from a static context

    public static void main(String[] argv) throws Exception {

        Scanner leia = new Scanner(System.in);
        String nomeEmpregado;
        String codEmpregado;
        int nPeca;
        boolean testei = false;
        String [] nomesDosEmpregados = new String[100];
        float [] salarios = new float[100];
        float somaTotalSalario = 0;
        String flag = "sim";
        int count = 0;
        float salario;
        while (true) {

            System.out.println("Digite o nome do empregado\n");
            do {
                if (testei) {
                    System.out.println("Digite o nome do empregado DE NOVO, ele deve ter mais de 2 caracteres\n");
                }
                nomeEmpregado = leia.nextLine();
                testei = true;
            } while (!validateNomeEmpregado(nomeEmpregado));
            testei = false;


            System.out.println("Digite o código do empregado\n");
            do {
                if (testei) {
                    System.out.println("\n Que pena, você errou!\nDigite o codigo do empregado de novo");
                }
                codEmpregado = leia.nextLine();
                testei = true;
            } while (!validateCodEmpregado(codEmpregado, nomeEmpregado));

            System.out.println("Digite o numero de peças fabricas em um determinado mês\n");
            testei=false;
             do {
                if (testei) {
                    System.out.println("\n Que pena, você errou!\nDigite o Quantiadade de peças > 1");
                }
                nPeca = Integer.parseInt(leia.nextLine());
                testei = true;
            } while (!validateNPecas(nPeca));

            salario = calculaSalario(nPeca);
            nomesDosEmpregados[count] = nomeEmpregado;
            salarios[count] = salario;
            somaTotalSalario = somaTotalSalario + salario;
            count = count + 1;
            System.out.println("Digite não para sair do sistema\n");
            flag = leia.nextLine();
            if(flag.equalsIgnoreCase("nao")){
                break;
            }

        }

        float media = somaTotalSalario/salarios.length;

           System.out.format("%s %40s %40s", "Nome", "Salário", "média de Salários\n");
           for( int index=1; index<=count;index++){
    System.out.format("%s %40f %30f\n",nomesDosEmpregados[index-1], salarios[index-1], media);
    }   


    }
}

