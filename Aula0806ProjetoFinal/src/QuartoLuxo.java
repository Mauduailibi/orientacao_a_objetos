public class QuartoLuxo extends Quarto {

    public QuartoLuxo(int n, double pb) {
        super(n, pb);
    }


    @Override
    public double calcularTotal(int diarias) {
        return this.precoBase * diarias * 1.2;
    }
    
}
