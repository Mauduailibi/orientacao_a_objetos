public class Conta {
    String titular;
    double saldo;

    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public void sacar(double valor) {
        if(this.saldo >= valor) {
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
