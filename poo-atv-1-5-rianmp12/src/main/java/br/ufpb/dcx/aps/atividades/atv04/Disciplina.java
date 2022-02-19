package br.ufpb.dcx.aps.atividades.atv04;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Disciplina {

    private String nome;
    private Curso curso;
    private String codigo;
    private Map<Integer,Turma> turmas = new HashMap<>();


    public Disciplina(Curso curso, String codigo, String nome) {
        this.curso = curso;
        this.codigo = codigo;
        this.nome = nome;
    }

    public Disciplina(String codigo) {
        this.codigo = codigo;
        this.nome = "";
    }

    public Turma getTurma(int numero) {
        if(numero <= 0) {
            throw new IllegalArgumentException("código inválido:"+numero);
        } else if(turmas.get(numero) == null) {
            throw new RuntimeException("Não existe turma com código:"+numero);
        }
        return turmas.get(numero);
    }

    public Map<Integer,Turma> getTurmas() {
        return this.turmas;
    }

    public Turma criarTurma() {
        Turma t1 = new Turma(turmas.size()+1,this);
        turmas.put(t1.getCodigo(), t1);
        return t1;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public Curso getCurso() {
        return this.curso;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        Disciplina disc = (Disciplina) o;
        return codigo == disc.codigo;
    }
}
