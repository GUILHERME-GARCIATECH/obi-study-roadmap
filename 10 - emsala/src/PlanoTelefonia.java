import java.util.Scanner;

public class PlanoTelefonia {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("--CALCULAR DEBITO COM A OPERADORA--");

            System.out.println("Informe a quantidade de minutos");
            byte min = scanner.nextByte();

            System.out.println("Informe o valor do plano basico da operadora (100 minutos)");
            float plan = scanner.nextFloat();

            float deb = plan;

            if (min > 100) {
                deb += 2 * (min-100);
            }

            System.out.println("DEBITO TOTAL: " + deb);
        }
    }
}
