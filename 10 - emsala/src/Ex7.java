public class Ex7 {
    public static void main(String[] args) {
        double nota = 0, soma = 0;
        int c = 0;

        System.out.println("--- Calcular média aluno (digite -1 para sair) ---");

        while (true){
            System.out.printf("Informe a %dª nota: ", c + 1);
            nota = Console.readDouble();
            if (nota == -1) break;

            if (nota > 0){
                soma += nota;
                c++;
            }else{
                System.out.println("Insira uma nota valida!");
            }
        }

        if (c > 0){
            calcularMedia(soma, c);
        }else {
            System.out.println("Nenhuma nota foi inserida!");
        }


    }
    static void calcularMedia(double soma, int c){
        double media = soma/c;
        System.out.println("A sua média é: " + media);
    }
}
