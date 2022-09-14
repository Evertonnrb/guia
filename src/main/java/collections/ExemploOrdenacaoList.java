package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        List<Gato> gatos = new ArrayList<>();
        gatos.add(new Gato("Simba","Amarelo",12));
        gatos.add(new Gato("Ze","Preto",8));
        gatos.add(new Gato("Bill","Branco",2));

        System.out.println("Ordem de inserção");
        System.out.println(gatos);

        System.out.println("Ordem aleatória");
        Collections.shuffle(gatos);
        System.out.println(gatos);

        System.out.println("Ordem natural (interface compartor)");
        Collections.sort(gatos);
        System.out.println(gatos);

        System.out.println("Comparando por idade");
        gatos.sort(new ComparatorIdade());
        System.out.println(gatos);

        System.out.println("Comparando por Cor");
        gatos.sort(new ComparatorCor());
        System.out.println(gatos);

        System.out.println("Comparando por Nome");
        gatos.sort(new ComparatorNome());
        System.out.println(gatos);
    }
}
class Gato implements Comparable<Gato>{
    String nome;
    String cor;
    int idade;

    public Gato(String nome, String cor, int idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.nome.compareToIgnoreCase(gato.nome);
    }
}
class ComparatorIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato gato, Gato gato2) {
        return Integer.compare(gato.idade, gato2.idade);
    }
}

class ComparatorCor implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.cor.compareToIgnoreCase(g2.cor);
    }
}

class ComparatorNome implements Comparator<Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.nome.compareToIgnoreCase(g2.nome);
    }
}