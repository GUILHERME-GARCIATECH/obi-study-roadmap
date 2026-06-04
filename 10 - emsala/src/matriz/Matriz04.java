package matriz;

import java.util.Scanner;

public class Matriz04 {
    public static void main(String[] args) {
        String[][] planner = new String[30][24];
        try(Scanner scanner = new Scanner(System.in)){
            while(true) {
                System.out.println("----- Agenda Pessoal -----");
                System.out.println("\nSelecione a opção desejada: ");
                System.out.println("1 - Inserir compromisso");
                System.out.println("2 - Consultar compromisso");
                System.out.println("3 - Fechar agenda");
                System.out.print("\nInsira a opção desejada: ");

                while (!scanner.hasNextByte()){
                    System.out.println("Erro: Entrada inválida! Digite um número entre 1 e 3.");
                    scanner.next();
                    System.out.print("\nInsira a opção desejada: ");
                }

                byte input = scanner.nextByte();
                scanner.nextLine();

                if (input == 1){
                    insertAppointment(planner, scanner);
                    System.out.println("Pressione ENTER para continuar...");
                    scanner.nextLine();
                }
                else if (input == 2){
                    consultAppointment(planner, scanner);
                    System.out.println("Pressione ENTER para continuar...");
                    scanner.nextLine();
                }
                else if (input == 3){
                    System.out.println("Saindo...");
                    return;
                }else {
                    System.out.println("Opção invalida! Tente novamente\n");
                }
            }
        }
    }
    static void insertAppointment(String[][] planner, Scanner scanner){
        System.out.println("-- Inserir compromisso --");
        System.out.print("Informe o dia (0-30): ");
        byte day = scanner.nextByte();

        System.out.print("Informe a hora (0-24): ");
        byte hour = scanner.nextByte();

        scanner.nextLine();

        System.out.print("\nInforme qual compromisso você quer agendar: ");

        planner[day][hour] = scanner.nextLine();
    }
    static void consultAppointment(String[][] planner, Scanner scanner){
        System.out.println("-- Consultar compromisso --");
        System.out.print("Informe o dia (0-30): ");
        byte day = scanner.nextByte();

        System.out.print("Informe a hora (0-24): ");
        byte hour = scanner.nextByte();

        scanner.nextLine();
        System.out.println(planner[day][hour]);
    }
}
