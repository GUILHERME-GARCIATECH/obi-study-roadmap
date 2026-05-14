import java.util.Objects;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Validador de Data ---");

        System.out.print("Insira o dia: ");
        byte dia = scanner.nextByte();

        scanner.nextLine();

        System.out.print("Insira o mês por extenso: ");
        String mes = scanner.nextLine().toLowerCase().trim();

        System.out.print("Insira o ano: ");
        int ano = scanner.nextInt();

        boolean dataValida = true;

        if (ano < 0 || ano > 2026) {
            System.out.println("ERROR: Ano inválido (deve ser entre 0 e 2026).");
            dataValida = false;
        }

        if (mes.equals("abril") || mes.equals("junho") || mes.equals("setembro") || mes.equals("novembro")) {
            if (dia < 1 || dia > 30) {
                System.out.println("ERROR: " + mes + " deve ter entre 1 e 30 dias.");
                dataValida = false;
            }
        } else if (mes.equals("fevereiro")) {
            if (dia < 1 || dia > 28) {
                System.out.println("ERROR: Fevereiro tem apenas 28 dias.");
                dataValida = false;
            }
        } else if (mes.equals("janeiro") || mes.equals("março") || mes.equals("maio") || mes.equals("julho") ||
                mes.equals("agosto") || mes.equals("outubro") || mes.equals("dezembro")) {
            if (dia < 1 || dia > 31) {
                System.out.println("ERROR: " + mes + " deve ter entre 1 e 31 dias.");
                dataValida = false;
            }
        } else {
            System.out.println("ERROR: Mês inválido.");
            dataValida = false;
        }

        if (dataValida) {
            System.out.println("\nSua data é válida: " + dia + " de " + mes + " de " + ano);
        } else {
            System.out.println("\nSua data é inválida!");
        }

        scanner.close();
    }
}
