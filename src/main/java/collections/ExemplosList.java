package collections;

import java.util.*;

public class ExemplosList {
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Jão Barbosda", 5.5, 7));
        alunos.add(new Aluno("Aline de Morais", 8.5, 10));
        alunos.add(new Aluno("Jurandir Nascimento", 2.5, 7));
        alunos.add(new Aluno("Camila Cavalcante", 8.5, 9.75));
        for (Aluno aluno : alunos) {
            System.out.println(aluno + " Passou direto ? " + (aluno.passouDireto() ? "Sim" : "Não"));
        }
        alunos.add(new Aluno("Tom Jobim", 3.5, 9.75));

        System.out.println();
        Double mediaTurma = 0d;
        for (Aluno aluno : alunos) {
            System.out.println(aluno + " Passou direto ? " + (aluno.passouDireto() ? "Sim" : "Não"));
            mediaTurma += aluno.media();
        }
        System.out.println("Média da turma " + (mediaTurma / alunos.size()));

        //alunos.clear();
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

        System.out.println("Lista de chamada");
        alunos.sort(new ListaChamada());
        System.out.println(alunos);

        System.out.println("Maior média da sala");
        alunos.sort(new ComparatorMaiorNota());
        System.out.println(alunos);
    }
}

class Aluno {
    String nome;
    double nota1;
    double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public boolean passouDireto() {
        return (nota1 + nota2) / 2 > 7;
    }

    public double media() {
        return (nota1 + nota2) / 2;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                '}';
    }
}

class ListaChamada implements Comparator<Aluno>{

    @Override
    public int compare(Aluno aluno1, Aluno aluno2) {
        return aluno1.nome.compareToIgnoreCase(aluno2.nome);
    }
}

class ComparatorMaiorNota implements Comparator<Aluno>{

    @Override
    public int compare(Aluno aluno1, Aluno aluno2) {
        return Double.compare(aluno2.media(),aluno1.media());
    }
}