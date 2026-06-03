public class Aluno {
    private String nome;
    private double prova1;
    private double prova2;

    public Aluno(String n, double p1, double p2) {
        this.nome = n;
        this.prova1 = p1;
        this.prova2 = p2;
    }

    public double getMedia() {
        return (this.prova1 + this.prova2) / 2;
    }
}
