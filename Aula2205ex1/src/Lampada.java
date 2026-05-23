public class Lampada {
    private boolean ligada;
    private String cor;

    public Lampada(String corInicial) {
        this.cor = corInicial;
        this.ligada = false;
    }

    public void ligar() {
        this.ligada = true;
    }

    public void desligar() {
        this.ligada = false;
    }

    public void imprimirStatus() {
        if (this.ligada == true) {
            System.out.println("LIGADA!");
        } else {
            System.out.println("DESLIGADA!");
        }

        System.out.println("COR: " + this.cor);
    }
}
