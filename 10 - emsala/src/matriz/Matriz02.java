package matriz;

import java.util.Random;

public class Matriz02 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        Random random = new Random();



        int maior7 = Integer.MIN_VALUE;
        int menor7 = Integer.MAX_VALUE;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = random.nextInt(10);


            }
        }

        int maior5 = Integer.MIN_VALUE;
        int menor5 = Integer.MAX_VALUE;

        for (int j = 0; j < matriz[4].length; j++) {
            if (matriz[4][j] > maior5){
                maior5 = matriz[4][j];
            }
            if (matriz[4][j] < menor5){
                menor5 = matriz[4][j];
            }
        }

        for (int i = 0; i < matriz.length; i++){
            if (matriz[i][6] > maior7){
                maior7 = matriz[i][6];
            }
            if (matriz[i][6] < menor7){
                menor7 = matriz[i][6];
            }
        }

        System.out.println("----------- Matriz Gerada -----------");
        for (int[] linha : matriz) {
            for (int num : linha) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
        System.out.println("\n------------- Linha 05 -------------");
        System.out.println("Maior número: " + maior5);
        System.out.println("Menor número: " + menor5);

        System.out.println("\n------------ Coluna 07 -------------");
        System.out.println("Maior número: " + maior7);
        System.out.println("Menor número: " + menor7);
    }
}
