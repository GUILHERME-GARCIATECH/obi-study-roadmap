
/*ENUNCIADO
1 - 🏋️ O Desafio: Validador de Senhas Corporativas

Você deve criar um programa que simule o sistema de cadastro de senhas de uma empresa de segurança. O programa deve receber a senha do usuário e validar se ela cumpre todos os requisitos de segurança.
Requisitos do Sistema:
Estrutura Sequencial e Scanner: Solicite o nome do usuário e a senha desejada via console.
Estrutura de Repetição: Se a senha for inválida, o programa deve exibir os erros e solicitar uma nova senha. O ciclo só para quando a senha for 100% válida.
Uso de Funções: Toda a validação da senha deve acontecer dentro de uma função específica chamada validarSenha, que retorna um valor booleano (true se for válida, false se for inválida).
Estruturas Condicionais (As Regras da Senha):
Ter pelo menos 8 caracteres.
Conter pelo menos uma letra maiúscula.
Conter pelo menos uma letra minúscula.
Conter pelo menos um número.
Não pode conter o nome do usuário (ignorando letras maiúsculas/minúsculas)*/
import java.util.Scanner;

public class ValidadorDeSenhas {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("--SISTEMA DE AUTENTICAÇÃO POR SENHA");

            System.out.print("\nINFORME SEU USUARIO: ");
            String user = scanner.nextLine();

            while(true){
                System.out.print("\nINSIRA A SENHA: ");
                String password = scanner.nextLine();

                boolean senha = validarSenha(user, password);

                if(senha){
                    System.out.println("SENHA REGISTRADA COM SUCESSO!");
                    break;
                }
            }
        }
    }

    static boolean validarSenha(String user, String password){
        boolean valida = true;

        if (password.length() < 8){
            System.out.println("-A SENHA PRECISA TER MAIS DE 8 CARACTERES-");
            valida = false;
        }

        if (password.toLowerCase().contains(user.toLowerCase())){
            System.out.println("-A SENHA NÃO PODE CONTER O SEU USUARIO-");
            valida = false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasNumber = false;

        for (char c: password.toCharArray()){
            if (Character.isUpperCase(c)) hasUpperCase = true;
            if (Character.isLowerCase(c)) hasLowerCase = true;
            if (Character.isDigit(c)) hasNumber = true;

            if (hasUpperCase && hasLowerCase && hasNumber) {
                break;
            }
        }

        if (!hasUpperCase) {
            System.out.println("-A SENHA TEM QUE TER PELO MENOS UMA LETRA MAIUSCULA-");
            valida = false;
        }
        if (!hasLowerCase) {
            System.out.println("-A SENHA TEM QUE TER PELO MENOS UMA LETRA MINUSCULA-");
            valida = false;
        }
        if (!hasNumber) {
            System.out.println("-A SENHA TEM QUE TER PELO MENOS UM NUMERO-");
            valida = false;
        }

        return valida;
    }
}
