public class ProdutoDigital extends Produto {

    public ProdutoDigital(String n, double pb) {
        super(n, pb);
    }

    @Override
    public double calcularPrecoFinal() {
        return this.precoBase;
    }

}
