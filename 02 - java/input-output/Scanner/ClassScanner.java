import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClassScanner {
    public static void main(String[] args) {
        // O try-with-resources gerencia o console. Ele NUNCA fecha antes da hora.
        try (Scanner scannerConsole = new Scanner(System.in)) {

            // 1. Ler dados estruturados do Console
            lerDoConsole(scannerConsole);

            System.out.println("\n--- Agora lendo o arquivo --- \n");

            // 2. Ler a lista de compras do Arquivo
            File arquivo = new File("dados.txt");
            try (Scanner scannerArquivo = new Scanner(arquivo)) {
                lerDoArquivo(scannerArquivo);
            } catch (FileNotFoundException e) {
                System.out.println("Erro: O arquivo dados.txt nao foi encontrado.");
            }

            System.out.println("\n--- Voltando ao Console --- \n");

            // 3. O console continua funcionando normalmente aqui!
            System.out.println("Digite algo para encerrar:");
            String fim = scannerConsole.nextLine();

        } // O System.in fecha AUTOMATICAMENTE apenas aqui, no fim do programa.
    }

    // Processa a entrada do teclado (Int, String, Double)
    static void lerDoConsole(Scanner scanner) {
        System.out.println("Entre com um inteiro (Ex: Idade): ");
        int n1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Entre com um texto (Ex: Nome): ");
        String str = scanner.nextLine();

        System.out.println("Entre com um double (Ex: Salario): ");
        double salario = Double.parseDouble(scanner.nextLine());

        System.out.println("Dados do console lidos com sucesso!");
    }

    // Processa o arquivo dados.txt linha por linha até o fim
    static void lerDoArquivo(Scanner scanner) {
        System.out.println("Conteudo do Arquivo:");

        // hasNextLine() verifica se ainda existem linhas no arquivo dados.txt
        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            System.out.println("- " + linha);
        }
    }
}
