public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private String cor;

    public Carro(String modelo, String marca, int ano, String cor) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modeloNovo) {
        this.modelo = modeloNovo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marcaNova) {
        this.marca = marcaNova;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int anoNovo) {
        this.ano = anoNovo;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String corNova) {
        this.cor = corNova;
    }
}
