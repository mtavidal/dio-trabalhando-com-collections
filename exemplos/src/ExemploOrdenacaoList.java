import java.util.*;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {

        List<Gato> gatos = new ArrayList<Gato>(){{
           add(new Gato("Jon", 18, "preto"));
           add(new Gato("Simba", 6, "tigrado"));
           add(new Gato("Jon", 12, "amarelo"));
        }};

        System.out.println(gatos);
        Collections.shuffle(gatos);
        System.out.println(gatos);
        Collections.sort(gatos);
        System.out.println(gatos);

    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}
