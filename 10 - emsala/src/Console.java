import java.util.Scanner;

public class Console {
    private static Scanner leitor = new Scanner(System.in);

    public static String readString() {
        return leitor.nextLine();
    }

    public static int readInt() {
        int valor = leitor.nextInt();
        leitor.nextLine(); // limpa o buffer
        return valor;
    }

    public static double readDouble() {
        double valor = leitor.nextDouble();
        leitor.nextLine(); // limpa o buffer
        return valor;
    }
}
