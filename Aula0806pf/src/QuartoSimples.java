public class QuartoSimples extends Quarto {
    public QuartoSimples(int numero, double precoBase) { 
        super(numero, precoBase); 
    }

    @Override
    public double calcularTotal(int dias) { 
        return this.precoBase * dias;
    }
}