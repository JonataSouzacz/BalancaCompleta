package org.example.classes;

public class Produto {

    private int codigo;
    private String descricao;
    private int tipo;
    private double valor;

    public Produto(int codigo, String descricao, int tipo, double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}
