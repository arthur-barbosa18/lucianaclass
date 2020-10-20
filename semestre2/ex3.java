import java.text.*;
import java.util.*;

public class ex3 {

    public static void main(String[] argv) throws Exception {
        String word = "";
        String wordInitial = "";
        boolean caseSensitive = false;
        boolean ignoringWhiteSpaces = false;

        System.out.println("Digite a frase para testar se é palíndromo!");
        Scanner leia = new Scanner(System.in);
         word = leia.nextLine();
        wordInitial = word;
        System.out.println("Digite true se for considerar case sensitive e false para não considerar");
        caseSensitive = Boolean.parseBoolean(leia.nextLine());

        System.out.println("Digite true se for ignorar os espaços da frase e false se for para considerá-los");
        ignoringWhiteSpaces = Boolean.parseBoolean(leia.nextLine());

        if (word.isEmpty()) {
            System.out.println("Entre com uma palavra para ser verifica se é palíndromo!");
            System.exit(1);
        }

        if(!caseSensitive) word = word.toLowerCase();
        if(ignoringWhiteSpaces) word = word.trim().replaceAll("\\s+", "");

        int wordLength =  word.length();
        int maxComparisons = wordLength/2;
        boolean isPalindrome = true;

        for(int index=0; index< wordLength; index++){
            if(maxComparisons == index){
                break;
            }
            if(word.charAt(index) != word.charAt(wordLength-1-index))
            {
                System.out.println("A frase '" + wordInitial + "' não é palíndromo");
                System.exit(0);
            }
        }

        System.out.println("A frase '" + wordInitial + "' é palíndromo ");

    }
}

