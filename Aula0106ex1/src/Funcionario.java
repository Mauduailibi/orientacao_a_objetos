public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String n, double sb) {
        this.nome = n;
        this.salarioBase = sb;
    }

    public abstract double calcularSalario();
}