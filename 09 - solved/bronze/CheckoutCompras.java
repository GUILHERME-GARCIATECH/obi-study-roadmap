/*
🛒 O Desafio: Sistema de Checkout de E-Commerce com Cupom
Você deve criar um programa que simule o carrinho de compras e o fechamento do pedido de uma loja online. O sistema deve calcular o valor final da compra aplicando regras de desconto e validando um cupom promocional.
Requisitos do Sistema:
Entrada de Dados (Scanner): Solicite o valor total da compra (positivo e maior que zero) e o cupom de desconto desejado.
Estrutura de Repetição: Se o valor da compra for menor ou igual a zero, o programa deve exibir uma mensagem de erro e solicitar o valor correto até que um número válido seja digitado.
Uso de Funções: Toda a lógica de cálculo do preço final e aplicação das regras deve acontecer dentro de uma função chamada calcularPrecoFinal, que recebe o valor da compra e o cupom (String), retornando o valor final a ser pago (double).
Estruturas Condicionais (As Regras do Checkout):
Validação do Cupom: O sistema aceita apenas o cupom "PROMO10" (ignorar maiúsculas/minúsculas). Se o cupom for válido, dá 10% de desconto sobre o valor da compra. Se o usuário digitar qualquer outra coisa, exiba a mensagem "Cupom inválido ou expirado" (mas o programa não deve travar por causa disso, apenas segue sem o desconto do cupom).
Desconto por Volume de Compra: Se o valor final (após checar o cupom) for maior ou igual a R$ 500,00, o cliente ganha Frete Grátis. Caso contrário, o frete fixo de R$ 20,00 deve ser somado ao total.
Brinde Especial: Se o valor final da compra (já com frete ou desconto) passar de R$ 1.000,00, exiba uma mensagem especial: "Parabéns! Você ganhou um brinde exclusivo!".
Saída: O programa principal (main) deve exibir o resumo final na tela: o valor original, se houve desconto do cupom, o valor do frete e o total a pagar.
*/
import java.util.Scanner;

public class CheckoutCompras {

    public record ResultadoCheckout(double valorFinal, boolean aplicouDesconto) {}

    public static void main(String[] args) {
        double valorOriginal;
        double valorFinal;
        boolean aplicouDesconto;
        double valorFrete = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("--SISTEMA DE CHECKOUT DE COMPRAS--");

            while (true) {
                System.out.print("\nInforme o valor total da compra: ");
                valorOriginal = scanner.nextDouble();

                if (valorOriginal <= 0) {
                    System.out.println("[ERRO] O valor precisa ser maior que zero!");
                    continue;
                }
                break;
            }
            scanner.nextLine();

            System.out.print("\nDigite o cupom de desconto (ou aperte Enter para nenhum): ");
            String cupom = scanner.nextLine();

            ResultadoCheckout resultado = calcularPrecoFinal(valorOriginal, cupom);
            valorFinal = resultado.valorFinal();
            aplicouDesconto = resultado.aplicouDesconto();

            if (valorFinal < 500) {
                valorFrete = 20.0;
            }

            valorFinal += valorFrete;
        }

        exibirResumo(valorOriginal, valorFinal, aplicouDesconto, valorFrete);
    }

    static ResultadoCheckout calcularPrecoFinal(double valor, String cupom) {
        double valorFinal;
        boolean aplicouCupom;

        if (cupom.trim().isEmpty()) {
            valorFinal = valor;
            aplicouCupom = false;
        } else if (cupom.equalsIgnoreCase("PROMO10")) {
            valorFinal = valor * 0.9;
            aplicouCupom = true;
        } else {
            System.out.println("\n[AVISO] Cupom inválido ou expirado.");
            valorFinal = valor;
            aplicouCupom = false;
        }
        return new ResultadoCheckout(valorFinal, aplicouCupom);
    }

    static void exibirResumo(double valorOriginal, double valorFinal, boolean desconto, double valorFrete) {
        System.out.println("\n-- RESUMO DO PEDIDO --");

        System.out.printf("VALOR ORIGINAL: R$ %.2f%n", valorOriginal);

        if (desconto) {
            double totalDesconto = valorOriginal * 0.1;
            System.out.printf("VALOR DESCONTO (PROMO10): R$ %.2f%n", totalDesconto);
        } else {
            System.out.println("CUPOM APLICADO: Nenhum");
        }

        if (valorFrete == 0) {
            System.out.println("VALOR DO FRETE: Grátis");
        } else {
            System.out.printf("VALOR DO FRETE: R$ %.2f%n", valorFrete);
        }

        System.out.printf("VALOR FINAL DA COMPRA: R$ %.2f%n", valorFinal);

        if (valorFinal > 1000) {
            System.out.println("\n🎁 Parabéns! Você ganhou um brinde exclusivo!");
        }
    }
}
