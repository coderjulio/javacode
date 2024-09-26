package pessoa_3_4;

public class Pessoa {
    public Pessoa(String nome) {
        this.nome = nome;
    }

    private String nome;
    private int idade;
    private String profissao;

    public Pessoa(String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    public Pessoa() {
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", profissao='" + profissao + '\'' +
                '}';
    }
}
