package matriz;

import java.util.Scanner;

public class Matriz04 {
    public static void main(String[] args) {
        String[][] agenda = new String[30][24];
        try(Scanner planner = new Scanner(System.in)){
            while(true) {
                System.out.println("----- Agenda Pessoal -----");
                System.out.println("\nSelecione a opção desejada: ");
                System.out.println("1 - Inserir compromisso");
                System.out.println("2 - Consultar compromisso");
                System.out.println("3 - Fechar agenda");
                System.out.print("\nInsira a opção desejada: ");

                byte input = planner.nextByte();
                if (input == 1){
                    insertAppointment(agenda, planner);
                    System.out.println("Pressione ENTER para continuar...");
                    planner.nextLine();
                }
                if (input == 2){
                    consultAppointment(agenda, planner);
                    System.out.println("Pressione ENTER para continuar...");
                    planner.nextLine();
                }
                if (input == 3){
                    return;
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
