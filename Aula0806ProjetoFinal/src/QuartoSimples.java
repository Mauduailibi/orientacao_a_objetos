public class QuartoSimples extends Quarto {

    public QuartoSimples(int n, double pb) {
        super(n, pb);
    }

    @Override
    public double calcularTotal(int diarias) {
        return this.precoBase * diarias;
    }

}
