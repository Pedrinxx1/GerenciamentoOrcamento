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
    
    public void exibirAnalisePercentual() {
        double totalGasto = calcularTotalDespesas();
        
        if (totalGasto == 0) {
            System.out.println("\nNenhuma despesa cadastrada para calcular percentuais.");
            return;
        }

        System.out.println("\n--- Análise Percentual de Gastos ---");
        
        // Usando ArrayList para guardar as categorias que já calculamos (atende ao requisito do PDF)
        ArrayList<String> categoriasProcessadas = new ArrayList<>();
        
        for (Despesa d : listaDespesas) {
            String categoriaAtual = d.getCategoria();
            
            // Se a categoria ainda não foi calculada, fazemos a soma dela
            if (!categoriasProcessadas.contains(categoriaAtual)) {
                double somaCategoria = 0;
                
                for (Despesa despesaInterna : listaDespesas) {
                    if (despesaInterna.getCategoria().equalsIgnoreCase(categoriaAtual)) {
                        somaCategoria += despesaInterna.getValor();
                    }
                }
                
                double percentual = (somaCategoria / totalGasto) * 100;
                System.out.printf("Categoria: %s | Total Gasto: R$ %.2f | Representa: %.2f%% dos gastos\n", 
                                  categoriaAtual, somaCategoria, percentual);
                
                categoriasProcessadas.add(categoriaAtual);
            }
        }
    }
}