public class App {
    public static void main(String[] args) throws Exception {
        
        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 2000.0;
        p1.qtdEstoque = 25;

        double precoTotalP1 = p1.preco * p1.qtdEstoque;
        System.out.println("Valor em estoque de P1: " + precoTotalP1);

        Produto p2 = new Produto();
        p2.nome = "Mouse";
        p2.preco = 150.0;
        p2.qtdEstoque = 50;

        double precoTotalP2 = p2.preco * p2.qtdEstoque;
        System.out.println("Valor em estoque de P2: " + precoTotalP2);

        p1.adicionarEstoque(15);
        System.out.println("QTD Estoque P1: " + p1.qtdEstoque);

        p1.adicionarEstoque(50);
        System.out.println("QTD Estoque P1: " + p1.qtdEstoque);

        p2.adicionarEstoque(10);
        System.out.println("QTD Estoque P2: " + p2.qtdEstoque);

        p2.editarPreco(180.0);
        System.out.println(p2.preco);
    }
}
