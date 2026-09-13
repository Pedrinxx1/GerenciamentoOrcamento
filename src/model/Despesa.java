package model;

public class Despesa {
    
    private String descricao;
    private double valor;
    private String categoria;

    // Construtor
    public Despesa(String descricao, double valor, String categoria) {
        this.descricao = descricao;
        this.valor = valor;
        this.categoria = categoria;
    }

    // Getters e Setters (Encapsulamento)
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // Método para formatar a impressão no console
    @Override
    public String toString() {
        return String.format("Categoria: %-12s | Descrição: %-15s | Valor: R$ %.2f", categoria, descricao, valor);
    }
}