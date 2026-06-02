public class ContaInvestimento implements Tributavel {
    protected double saldo;

    public ContaInvestimento(double s) {
        this.saldo = s;
    }

    @Override
    public double calcularImposto() {
        return this.saldo * 0.005;
    }

}
