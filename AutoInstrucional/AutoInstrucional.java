import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class AutoInstrucional {
    private static int MAX_CONTATOS = 100;

    public static void main(String args[]) {

        String nomeC[] = new String[MAX_CONTATOS];
        String numeroC[] = new String[MAX_CONTATOS];
        String emailC[] = new String[MAX_CONTATOS];

        int acao;
        int cont = 0;

        Scanner leia = new Scanner(System.in);

        for (int i = 0; i < MAX_CONTATOS; i++) {

            do {

                System.out.println("** AGENDA TELEFONICA **");

                System.out.println("=======================");

                System.out.println("Digite o número da açãoo que você deseja realizar: ");
                System.out.println("1- Armazenar novo contato");
                System.out.println("2- Listar todos os contatos");
                System.out.println("3- Buscar contato por nome");
                System.out.println("4 Sair");

                acao = leia.nextInt();
                if (acao != 1 && acao != 2 && acao != 3 && acao != 4) {
                    System.out.println("digite um numero v�lido!!");
                }

            } while (acao != 1 && acao != 2 && acao != 3 && acao != 4);


            if (acao == 4) {
                escreveListaTelefonica(nomeC, numeroC, emailC);
                break;
            } else if (acao == 2) {
                listarTodosContatos(nomeC, numeroC, emailC);
            } else if (acao == 3) {
                buscarContato(nomeC, numeroC, emailC);

            } else if (acao == 1) {

                registro(nomeC, numeroC, emailC, i);

            }
        }
    }

    private static void escreveListaTelefonica(String[] nomeC, String[] numeroC, String[] emailC) {
        try {
            RandomAccessFile arqAg = new RandomAccessFile("produto.dat", "rw");
            arqAg.seek(arqAg.length());

            String listaTelefonica = "Nome\tTelefone\tEmail\n";
            for (int i = 0; i < numeroC.length; i++) {
                if (nomeC[i] == null || numeroC[i] == null || emailC[i] == null) {
                    continue;
                }
                listaTelefonica = listaTelefonica + "\t" + nomeC[i] + "\t" + numeroC[i] + "\t" + emailC[i] + "\n";
            }

            arqAg.writeUTF(listaTelefonica);

            arqAg.close();
            System.out.println("contato gravado com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro na gravação do registro - programa será finalizado");
            System.exit(0);
        }
    }

    private static void buscarContato(String[] nomeC, String[] numeroC, String[] emailC) {

        Scanner leia = new Scanner(System.in);
        boolean contatoExiste = false;
        System.out.println("**BUSCAR CONTATO**");
        System.out.println("Digite o nome que deseja buscar:");
        String contatoRequerido = leia.nextLine();
        for (int i = 0; i < MAX_CONTATOS; i++) {
            if (contatoRequerido.equalsIgnoreCase(nomeC[i])) {
                System.out.println("Nome\tNumero  Email");
                System.out.println(nomeC[i] + "\t" + numeroC[i] + "  " + emailC[i] + "\n");
                contatoExiste = true;
            }
        }
        if (!contatoExiste) {
            System.out.println("**CONTATO N�O ENCONTRADO**");
        }
    }

    private static void listarTodosContatos(String[] nomeC, String[] numeroC, String[] emailC) {
        System.out.println("Nome\tNumero  Email");
        for (int i = 0; i < nomeC.length; i++) {
            if (nomeC[i] == null || numeroC[i] == null || emailC[i] == null) {
                continue;
            }
            System.out.println(nomeC[i] + "\t" + numeroC[i] + "  " + emailC[i]);
        }
        System.out.println("\n");
    }

    private static void registro(String[] nomeC, String[] numeroC, String[] emailC, int index) {
        String field[] = getField();
        numeroC[index] = field[2];
        nomeC[index] = field[0];
        emailC[index] = field[1];
    }

    public static String[] getField() {
        Scanner leia = new Scanner(System.in);
        String fields[] = new String[3];
        System.out.println("Digite o nome que você deseja registrar");
        fields[0] = leia.nextLine();
        System.out.println("Digite agora o email que você deseja registrar");
        fields[1] = leia.nextLine();
        System.out.println("Digite agora o telefone que você deseja registrar");
        fields[2] = leia.nextLine();
        return fields;
    }


}
