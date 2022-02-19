package br.ufpb.dcx.aps.atividades.curso_alunos;

public class Aluno {
    
    private String nome;
    private String matricula;
    private Curso curso;

    public Aluno(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public Curso getCurso() {
        return this.curso;
    }

    public void setCurso(Curso novoCurso) {
        this.curso = novoCurso;
    }
}
