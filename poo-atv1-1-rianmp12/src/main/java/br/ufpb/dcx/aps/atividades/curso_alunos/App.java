package br.ufpb.dcx.aps.atividades.curso_alunos;

import javax.swing.JOptionPane;

public class App {

    public static void pesquisarAluno(Curso curso) {
        String pesqAlunoMatricula = JOptionPane.showInputDialog("Digite o número de matrícula do aluno:");
        try {
            JOptionPane.showMessageDialog(null, curso.getAluno(pesqAlunoMatricula).getNome());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Nenhum aluno encontrado.");
            e.printStackTrace();
        }
    }

    public static void cadastrarAluno(Curso curso) {
        String nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno:");
        String matriculaAluno = JOptionPane.showInputDialog("Digite o número de matrícula do aluno:");
        Aluno a1 = new Aluno(matriculaAluno);
        a1.setNome(nomeAluno);
        try {
            curso.matricularAluno(a1);
            JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Já possui um aluno cadastrado com essa matrícula.");
            e.printStackTrace();
            e.getMessage();
        }
    }
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Sistema Curso");
        Curso curso1 = new Curso(123, "SI / LCC");
        boolean acabou = false;
        while(!acabou) {
            int opcoes = Integer.parseInt(JOptionPane.showInputDialog("1.Matrícular aluno.\n2.Pesquisar aluno por matrícula.\n3.Sair."));
            switch(opcoes) {
                case 1:
                    cadastrarAluno(curso1);
                    break;
                case 2:
                    pesquisarAluno(curso1);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Sistema finalizado.");
                    acabou = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }
        }
    }
}