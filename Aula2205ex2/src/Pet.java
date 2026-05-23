public class Pet {
    private String nome;
    private int energia;

    public Pet(String nomeInicial) {
        this.nome = nomeInicial;
        this.energia = 100;
    }

    public void brincar() {
        if (this.energia >= 20) {
            this.energia = this.energia - 20;
            System.out.println("O pet brincou!");
        } else {
            System.out.println("O pet esta cansado pra brincar!");
        }
    }

    public void dormir() {
        this.energia = 100;
        System.out.println("O pet dormiu!");
    }
}