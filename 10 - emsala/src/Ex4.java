public class Ex4 {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 2;

        for (int i = 0; i < 15; i++){
            int f = n1 + n2;

            System.out.print(f + ", ");

            n1 = n2; n2 = f;
        }
    }
}
