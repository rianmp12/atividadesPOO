package br.ufpb.dcx.aps.atividades.atv04;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Curso {
    
    private String nome;
    private Map<Disciplina,Disciplina> disciplina = new HashMap<>(); 
    private Map<Aluno,Aluno> alunos = new HashMap<>();
    
    public Curso(String nome) {
        this.nome = nome;
    }

    public Curso() {
        this("");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }


    public Disciplina criarDisciplina(String codigo, String nome) {
        Disciplina novaDisciplina = new Disciplina(this, codigo, nome);
        if(disciplina.get(novaDisciplina) == null) {
            disciplina.put(novaDisciplina, novaDisciplina);
            return novaDisciplina;
        } else {
            throw new RuntimeException("Já existe uma disiciplina com esse código "+codigo);
        }
    }

    public Collection<Aluno>getAlunosMatriculados() {
        return this.alunos.values();
    }

    public Aluno getAlunoMatriculado(String matricula) {
        Aluno alunoPesq = new Aluno(matricula);
        if(alunos.get(alunoPesq) != null) {
            return alunos.get(alunoPesq);
        }
        throw new RuntimeException("Não existe aluno com essa matricula "+matricula);
    }

    public boolean alunoMatriculado(String matricula) {
        Aluno alunoPesq = new Aluno(matricula);
        if(alunos.get(alunoPesq) != null) {
            return true;
        }
        return false;
    }

    public Disciplina getDisciplina(String codigo) {
        Disciplina pesqDisciplina = new Disciplina(codigo);
        if(disciplina.get(pesqDisciplina) != null) {
            return disciplina.get(pesqDisciplina);
        }
        throw new RuntimeException("Não existe disciplina com código:"+codigo);
    }

    public void matricular(Aluno aluno) {
        if(aluno == null) {
            throw new IllegalArgumentException("aluno inválido:"+aluno);
        }
        if(alunos.get(aluno) != null) {
            throw new RuntimeException("aluno já matriculado:"+aluno.getMatricula());
        }
        this.alunos.put(aluno, aluno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || this.getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return nome.equals(curso.nome);
    }
}
