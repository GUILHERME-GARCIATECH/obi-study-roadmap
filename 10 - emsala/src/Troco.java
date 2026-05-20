import java.util.Scanner;

public class Troco {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("--CALCULADORA DE TROCO--");

            System.out.print("\nVALOR DO PRODUTO: ");
            float valor = scanner.nextFloat();

            System.out.print("\nQUANTIDADE: ");
            float quant = scanner.nextFloat();

            System.out.print("\nDINHEIRO EM MÃOS: ");
            float valorEmMaos = scanner.nextFloat();

            float dif = valorEmMaos - (valor * quant);

            if (dif > 0) {
                System.out.println("TROCO: " + dif);
            }else {
                System.out.println("FALTA: " + (dif*(-1)));
            }
        }
    }
}
