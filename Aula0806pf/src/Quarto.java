public abstract class Quarto implements Financeiro {
    protected int numero;
    protected double precoBase;
    protected boolean ocupado;

    public Quarto(int numero, double precoBase) {
        this.numero = numero;
        this.precoBase = precoBase;
        this.ocupado = false;
    }

    public int getNumero() { 
        return numero;
    }

    public boolean isOcupado() { 
        return ocupado; 
    }

    public void setOcupado(boolean ocupado) { 
        this.ocupado = ocupado;
    }
}