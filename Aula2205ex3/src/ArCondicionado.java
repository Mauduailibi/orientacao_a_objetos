public class ArCondicionado {
    private String marca;
    private int temperatura;
    private boolean status;

    public ArCondicionado(String marca) {
        this.marca = marca;
        this.temperatura = 24;
        this.status = false;
    }

    public void ligar() {
        this.status = true;
    }

    public void desligar() {
        this.status = false;
    }

    public void aumentarTemperatura() {
        if(this.status == true) {
            
            if(this.temperatura < 30) {
                this.temperatura++;
                System.out.println("Temperatura aumentada.");
            } else {
                System.out.println("Temperatura máxima!");
            }

        } else {
            System.out.println("O ar está desligado!");
        }
    }

    public void diminuirTemperatura() {
        if(this.status == true) {
            
            if(this.temperatura > 16) {
                this.temperatura--;
                System.out.println("Temperatura diminuida.");
            } else {
                System.out.println("Temperatura mínima!");
            }

        } else {
            System.out.println("O ar está desligado!");
        }
    }
}
