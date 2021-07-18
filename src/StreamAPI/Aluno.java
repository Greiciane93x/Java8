package StreamAPI;

public class Aluno {
    private String nome;
    private Long idade;

    public Aluno(String nome, Long idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Long getIdade() {
        return idade;
    }
}
