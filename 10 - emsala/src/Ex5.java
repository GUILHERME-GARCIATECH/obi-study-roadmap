import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int x = scanner.nextInt();

        scanner.close();

        if (x == 0) {
            System.out.println("ERROR: O numero não pode ser = 0!");
            return;
        }
        if (x < 0 && (x%2) != 0) {
            System.out.println("ERROR: O numero não pode ser um negativo impar!");
            return;
        }

        switch (x % 2){
            case 0:
                while(x < 1000){
                    x += 5;
                    if (x <= 1000) System.out.println(x);
                }
                break;
            default:
                while(x < 1000){
                    x *= 2;
                    if (x <= 1000) System.out.println(x);
                }
                break;
        }

    }
}
