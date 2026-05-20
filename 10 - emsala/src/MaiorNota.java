import java.util.Arrays;
import java.util.Scanner;

public class MaiorNota {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("--COMPARADORA DE NOTAS--");

            System.out.print("\nQuantos notas você vai informar?\n");
            byte numNotas = scanner.nextByte();

            if (numNotas > 0) {
                float[] notas = coletarNotas(numNotas, scanner);

                System.out.println("Notas informadas: " + Arrays.toString(notas));

                float notaMaior = verificarMaiorNota(notas);

                System.out.println("MAIOR NOTA: " + notaMaior);
            }else {
                System.out.println("\nPrecisa informar uma ou mais notas!");
                return;
            }
        }
    }

    static float[] coletarNotas(byte numNotas, Scanner scanner) {
        float[] notas = new float[numNotas];

        for (byte i = 0; i < numNotas;) {
            System.out.print("\nInforme a " + (i + 1) + "ª nota (0 a 100): ");
            float nota = scanner.nextFloat();

            if (nota >= 0 && nota <= 100) {
                notas[i] = nota;
                i++;
            } else {
                System.out.println("ERRO: Informe uma nota válida entre 0 e 100.");
            }
        }

        return notas;
    }

    static float verificarMaiorNota(float[] notas){
        float maiorNota = 0;

        for (float nota : notas) {
            if (nota > maiorNota) {
                maiorNota = nota;
            }
        }

        return maiorNota;
    }
}
