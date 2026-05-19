public class Produto {
    String nome;
    double preco;
    int qtdEstoque;

    public void adicionarEstoque(int quantidade) {
        this.qtdEstoque = this.qtdEstoque + quantidade;

        System.out.println("Estoque atualizado!");
    }

    public void editarPreco(double precoNovo) {
        this.preco = precoNovo;

        System.out.println("Preço alterado!");
    }
}
