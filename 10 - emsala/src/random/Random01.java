package random;

import java.util.Random;

public class Random01 {

        public static void main(String[] args) {
            int[][] matriz = new int[3][3];
            Random random = new Random();

            for (int i = 0; i < matriz.length; i++){
                for (int j = 0; j < matriz[i].length; j++){
                    matriz[i][j] = random.nextInt(10);
                }
        }
    }
}
