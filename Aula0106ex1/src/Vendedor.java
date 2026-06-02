public class Vendedor extends Funcionario {

    public Vendedor(String n, double sb) {
        super(n, sb);
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase + 500;
    }
}
