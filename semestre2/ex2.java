import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner leia = new Scanner(System.in);

        int qntd;

        System.out.println("digite a cadeia de caracteres: ");
        String resultante = "";
        String frase = leia.nextLine();
        System.out.println(frase);
        System.out.println(frase.length());

        System.out.println("=============================================================\n");
        System.out.println(frase.toLowerCase());
        for (int index = 0; index < frase.length(); index++) {
            String bla = String.valueOf(frase.charAt(index));
            resultante = resultante + bla.toLowerCase();
        }
    }

}
