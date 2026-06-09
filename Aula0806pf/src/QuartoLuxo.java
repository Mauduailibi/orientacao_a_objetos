public class QuartoLuxo extends Quarto {
    public QuartoLuxo(int numero, double precoBase) { 
        super(numero, precoBase); 
    }

    @Override
    public double calcularTotal(int dias) { 
        return (this.precoBase * dias) * 1.20; 
    }
}
