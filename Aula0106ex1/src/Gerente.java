public class Gerente extends Funcionario {

    public Gerente(String n, double sb) {
        super(n, sb);
    }

    @Override
    public double calcularSalario() {
        return this.salarioBase + 2000;
    }

}
