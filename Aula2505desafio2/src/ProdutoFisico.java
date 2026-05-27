public class ProdutoFisico extends Produto {

    public ProdutoFisico(String n, double pb) {
        super(n, pb);
    }

    @Override
    public double calcularPrecoFinal() {
        double imposto = this.precoBase * 0.1;
        double frete = 50.0;
        return this.precoBase + imposto + frete;
    }

}
