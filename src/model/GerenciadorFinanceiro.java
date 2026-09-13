package model;

import java.util.ArrayList;

public class GerenciadorFinanceiro {
    
    private double rendaMensal;
    private ArrayList<Despesa> listaDespesas;

    // Construtor para inicializar a lista vazia
    public GerenciadorFinanceiro() {
        this.listaDespesas = new ArrayList<>();
    }

    public void definirRenda(double valor) {
        this.rendaMensal = valor;
    }

    public void adicionarDespesa(Despesa despesa) {
        this.listaDespesas.add(despesa);
    }

    public void listarDespesas() {
        System.out.println("\n--- Lista de Despesas ---");
        for (Despesa despesa : listaDespesas) {
            System.out.println(despesa.toString());
        }
    }

    public double calcularTotalDespesas() {
        double total = 0;
        for (Despesa despesa : listaDespesas) {
            total += despesa.getValor();
        }
        return total;
    }

    public double calcularSaldoFinal() {
        return this.rendaMensal - calcularTotalDespesas();
    }
    
    public double getRendaMensal() {
        return this.rendaMensal;
    }
}