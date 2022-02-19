package br.ufpb.dcx.aps.atividades.my1stTest;

import java.math.BigDecimal;

public class Produto {

    private String nome;
    private BigDecimal preco;
    private String descricao;

    public Produto() {
        this.nome = "";
        this.preco = new BigDecimal(0.0);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        double num = this.preco.doubleValue();
        return num;
    }

    public void setPreco(double valor) {
        this.preco = new BigDecimal(valor);
    }   
}