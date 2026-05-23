public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String nomeTitular) {
        this.titular = nomeTitular;
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valorDepositado) {
        this.saldo = this.saldo + valorDepositado;
        System.out.println("Deposito realizado!");
    }

    public void sacar(double valorSacado) {
        if (this.saldo >= valorSacado) {
            this.saldo = this.saldo - valorSacado;
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
