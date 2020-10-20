import java.util.Scanner;
import java.util.Arrays;

public class ex4 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner leia = new Scanner(System.in);

        int qntd;

        System.out.println("digite quantas pessoas deseja saber o nome: ");
        qntd = leia.nextInt();

        leia.nextLine();

        String nome[] = new String[qntd];
        int idade[] = new int[qntd];
        float salario[] = new float[qntd];

        for (int x = 0; x < qntd; x++) {
            System.out.println("digite o " + " " + x + " nome: ");
            nome[x] = leia.nextLine();
            System.out.println("digite o " + " " + x + " salario: ");
            salario[x] = leia.nextFloat();
            System.out.println("digite o " + " " + x + " idade: ");
            idade[x] = leia.nextInt();
            leia.nextLine();


/*            for (int i = 0; i < (qntd); i++) {
                System.out.println("nome: " + nome[i]);
                System.out.println("salario: " + salario[i]);
                System.out.println("idade: " + idade[i]);
            }*/
        }
        Arrays.sort(nome);
        Arrays.sort(salario);
        Arrays.sort(idade);
//		 String sorted = new String(Arrays.sort(nome));
        System.out.println(Arrays.toString(nome));
        System.out.println(Arrays.toString(salario));
        System.out.println(Arrays.toString(idade));

    }

}