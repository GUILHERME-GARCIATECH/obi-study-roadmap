package matriz;

import java.util.Scanner;

public class Matriz03 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int cP = 0;
        int cI = 0;

        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("--- Preenchendo a Matriz ---");
            for (int i = 0; i < matriz.length; i++){
                for (int j = 0; j < matriz[i].length; j ++){
                    System.out.printf("Valor do indice (%d, %d): ", i, j);
                    matriz[i][j] = scanner.nextInt();
                    if (matriz[i][j] % 2 == 0){
                        cP++;
                    }else {
                        cI++;
                    }
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
        System.out.println("Quantidade numeros pares: " + cP);
        System.out.println("Quantidade numeros impares: " + cI);
    }
}
