// Passo 4 - Criar a classe filha (subclasse) Caminhao
// Passo 5 - Herdar Veiculo
public class Caminhao extends Veiculo {

    // Passo 6 - Criar atributos exclusivos
    protected double capacidadeDeCarga;

    // Passo 7 - Criar construtor com os parâmetros
    public Caminhao(String p, int a, double c) {
        // Passo 8 - Repassar pra classe mãe
        super(p, a);
        // Passo 9 - Definir o valor dos meus atributos
        this.capacidadeDeCarga = c;
    }

}
