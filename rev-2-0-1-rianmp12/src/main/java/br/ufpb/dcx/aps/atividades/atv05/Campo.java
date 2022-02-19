package br.ufpb.dcx.aps.atividades.atv05;

public class Campo {

    private String nome;
    private String id;
    private String valor;

    public Campo(String id) {
        this.id = id;
        this.nome = "";
    }

    public Campo(String id, String nome) {
        this.nome = nome;
        this.id = id;
    }

    public String getId() {
        return  this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setValor(String novoValor) {
        this.valor = novoValor;
    }

    public boolean isPreenchido() {
        return this.valor != null;
    }

    public String getValor() {
        return this.valor;
    }

}
