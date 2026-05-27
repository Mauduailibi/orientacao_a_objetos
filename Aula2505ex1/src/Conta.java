public class Conta {
    protected String titular;
    protected double saldo;

    public Conta(String t) {
        this.titular = t;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
        System.out.println("Depósito concluído!");
    }

    public double getSaldo() {
        return this.saldo;
    }
}
