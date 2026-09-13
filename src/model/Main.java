package model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner para ler o que o usuário digita no console
        Scanner scanner = new Scanner(System.in);
        GerenciadorFinanceiro gerenciador = new GerenciadorFinanceiro();
        int opcao = 0;

        System.out.println("Bem-vindo ao Gerenciador de Orçamento Pessoal!");

        // Loop contínuo até o usuário escolher a opção 5 (Sair)
        do {
            try {
                System.out.println("\n--- MENU PRINCIPAL ---");
                System.out.println("1. Definir Renda Mensal");
                System.out.println("2. Cadastrar Despesa");
                System.out.println("3. Listar Despesas e Resumo Financeiro");
                System.out.println("4. Exibir Análise Percentual");
                System.out.println("5. Sair");
                System.out.print("Escolha uma opção: ");
                
                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer do teclado

                switch (opcao) {
                    case 1:
                        System.out.print("Informe o valor da renda mensal (Use vírgula para centavos): R$ ");
                        double renda = scanner.nextDouble();
                        if (renda < 0) {
                            System.out.println("Erro: A renda não pode ser um valor negativo.");
                        } else {
                            gerenciador.definirRenda(renda);
                            System.out.println("Renda definida com sucesso!");
                        }
                        break;
                    case 2:
                        System.out.print("Digite a descrição da despesa (ex: Conta de Luz): ");
                        String descricao = scanner.nextLine();
                        System.out.print("Digite a categoria (ex: Moradia, Alimentacao, Lazer): ");
                        String categoria = scanner.nextLine();
                        System.out.print("Digite o valor da despesa: R$ ");
                        double valor = scanner.nextDouble();
                        
                        if (valor < 0) {
                            System.out.println("Erro: O valor da despesa não pode ser negativo.");
                        } else {
                            Despesa novaDespesa = new Despesa(descricao, valor, categoria);
                            gerenciador.adicionarDespesa(novaDespesa);
                            System.out.println("Despesa cadastrada com sucesso!");
                        }
                        break;
                    case 3:
                        gerenciador.listarDespesas();
                        System.out.printf("\n--- Resumo Financeiro ---\n");
                        System.out.printf("Renda Mensal: R$ %.2f\n", gerenciador.getRendaMensal());
                        System.out.printf("Total de Despesas: R$ %.2f\n", gerenciador.calcularTotalDespesas());
                        System.out.printf("Saldo Final: R$ %.2f\n", gerenciador.calcularSaldoFinal());
                        break;
                    case 4:
                        gerenciador.exibirAnalisePercentual();
                        break;
                    case 5:
                        System.out.println("Encerrando o sistema. Até logo!");
                        break;
                    default:
                        System.out.println("Opção inválida! Escolha um número de 1 a 5.");
                }
            } catch (InputMismatchException e) {
                // Impede que o sistema quebre se o usuário digitar letras no lugar de números
                System.out.println("Erro de entrada: Por favor, digite apenas números válidos.");
                scanner.nextLine(); // Limpa a entrada incorreta do usuário
            }
        } while (opcao != 5);

        scanner.close();
    }
}