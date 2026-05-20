import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClassScanner {
    public static void main(String[] args) {
        //Uso do try para abrir e fechar o Scanner de maneira correta e segura.
        try (Scanner scannerConsole = new Scanner(System.in)) {

            lerDoConsole(scannerConsole);

            System.out.println("\n--- Agora lendo o arquivo --- \n");

            File arquivo = new File("02 - java/input-output/Scanner/dados.txt");

            try (Scanner scannerArquivo = new Scanner(arquivo)) {
                lerDoArquivo(scannerArquivo);
            } catch (FileNotFoundException e) {
                System.out.println("Erro: O arquivo dados.txt nao foi encontrado.");
            }

            System.out.println("\n--- Voltando ao Console --- \n");

            System.out.println("Digite algo para encerrar:");
            String fim = scannerConsole.nextLine();

        } //Scanner fecha aqui!!
    }

    static void lerDoConsole(Scanner scanner) {
        System.out.println("Entre com um inteiro (Ex: Idade): ");
        int n1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Entre com um texto (Ex: Nome): ");
        String str = scanner.nextLine();

        System.out.println("Entre com um double (Ex: Salario): ");
        double salario = Double.parseDouble(scanner.nextLine());

        System.out.println("Dados do console lidos com sucesso!");
    }

    static void lerDoArquivo(Scanner scanner) {
        System.out.println("Conteudo do Arquivo:");

        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            System.out.println("- " + linha);
        }
    }
}
