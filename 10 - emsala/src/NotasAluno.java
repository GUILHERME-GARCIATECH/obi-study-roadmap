import java.util.Scanner;

public class NotasAluno {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){

            System.out.print("\nQuantas notas você quer informar?");
            byte numNotas = scanner.nextByte();

            if (numNotas > 0){
                float media = receberNotas(numNotas, scanner);
                System.out.println("A media do aluno foi: " + media);

                boolean aprovado = verificarAprovacao(media);

                if (aprovado) {
                    System.out.println("ALUNO APROVADO!");
                }else {
                    System.out.println("ALUNO REPROVADO");
                }

            }else {
                System.out.println("\nPrecisa informar uma ou mais notas!");
                return;
            }
        }

    }

    static float receberNotas(byte numNotas, Scanner scanner) {
        float soma = 0;

        for (byte i = 0; i < numNotas; i ++){
            System.out.print("\nInforme a " + (i+1) + "ª nota: ");
            float nota = scanner.nextFloat();
            soma += nota;
        }

        return calcularMedia(soma, numNotas);
    }

    static float calcularMedia(float soma, float numNotas){
        return soma/numNotas;
    }

    static boolean verificarAprovacao(float media){
        boolean aprovacao;

        aprovacao = media > 60;
        return aprovacao;
    }
}
