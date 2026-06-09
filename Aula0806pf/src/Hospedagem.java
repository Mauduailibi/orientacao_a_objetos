public class Hospedagem {
    private Cliente cliente;
    private Quarto quarto;
    private int dias;
    private boolean ativa;
    private double valorTotalFinal;

    public Hospedagem(Cliente cliente, Quarto quarto, int dias) {
        this.cliente = cliente;
        this.quarto = quarto;
        this.dias = dias;
        this.ativa = true;
        this.valorTotalFinal = 0.0;
    }

    public Cliente getCliente() { 
        return cliente; 
    }

    public Quarto getQuarto() { 
        return quarto; 
    }

    public int getDias() { 
        return dias; 
    }

    public boolean isAtiva() { 
        return ativa; 
    }

    public void setAtiva(boolean ativa) { 
        this.ativa = ativa; 
    }

    public double getValorTotalFinal() { 
        return valorTotalFinal; 
    }

    public void setValorTotalFinal(double valor) { 
        this.valorTotalFinal = valor; 
    }
}