public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String n, String cpf) {
        this.nome = n;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }
}