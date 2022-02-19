package br.ufpb.dcx.aps.atividades.curso_alunos;

import java.util.ArrayList;
import java.util.List;

public class Curso {

     private String nome;
     private String descricao;
     private int codigoCurso;
     private List<Aluno> alunos = new ArrayList<>();

     public Curso(int codigo, String nome) {
         this.codigoCurso = codigo;
         this.nome = nome;
     }

     public void matricularAluno(Aluno aluno) throws Exception {
         for (Aluno a : this.alunos) {
             if(a.getMatricula().equals(aluno.getMatricula())) {
                 throw new Exception("Aluno já cadastrado.");
             }
         }
         aluno.setCurso(this);
         alunos.add(aluno);
     }

     public int getCodigo() {
         return this.codigoCurso;
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

    public Aluno getAluno(String matricula) throws Exception {
        for (Aluno aluno : this.alunos) {
            if(aluno.getMatricula().equals(matricula)) {
                return aluno;
            }
        }
        throw new Exception("Está matrícula não está cadastrada.");
    }
}