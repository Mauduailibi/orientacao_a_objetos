public class PagamentoBoleto extends Pagamento {

    public PagamentoBoleto(double v){
        super(v);
    }

    @Override
    public void processarPagamento() {
        System.out.println("Gerando código de barras para o valor R$" + this.valor);
    }
}
