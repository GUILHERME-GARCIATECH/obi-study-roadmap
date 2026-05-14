public class Ex3 {
    public static void main(String[] args) {

        int n = 10;
        int f = n;

        for (int i = (n - 1); i >= 1; i--) {
            int a = f;
            f *= i;

            System.out.println(a + " x " + i + " = " + f);
        }

        System.out.println();

        f = n;
        for (int i = 1; i < n; i++){
            int a = f;
            f *= i;

            System.out.println(a + " x " + i + " = " + f);
        }
    }
}
