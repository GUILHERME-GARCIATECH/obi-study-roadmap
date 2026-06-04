package matriz;

import java.util.Random;

public class Matriz01 {

        public static void main(String[] args) {
            int[][] matriz = new int[3][3];
            Random random = new Random();

            int menor = Integer.MAX_VALUE;
            int maior = Integer.MIN_VALUE;

            for (int i = 0; i < matriz.length; i++){
                for (int j = 0; j < matriz[i].length; j++){
                    matriz[i][j] = random.nextInt(10);

                    if (matriz[i][j] > maior){
                        maior = matriz[i][j];
                    }
                    if (matriz[i][j] < menor){
                        menor = matriz[i][j];
                    }
                }
            }

            System.out.println("--- Matriz Gerada ---");
            for (int[] linha : matriz) {
                for (int num : linha) {
                    System.out.print(num + "\t");
                }
                System.out.println();
            }
            System.out.println("\n---------------------");
            System.out.println("Maior número encontrado: " + maior);
            System.out.println("Menor número encontrado: " + menor);
    }
}
