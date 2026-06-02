public abstract class Pagamento {
    protected double valor;

    public Pagamento(double v) {
        this.valor = v;
    }

    public abstract void processarPagamento();
}
