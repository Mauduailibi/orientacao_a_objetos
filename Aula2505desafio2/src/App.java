public class App {
    public static void main(String[] args) throws Exception {
        Produto p1 = new Produto("Livro", 100);
        ProdutoFisico p2 = new ProdutoFisico("TV", 2000);
        ProdutoDigital p3 = new ProdutoDigital("ebook", 30);

        System.out.println("P1: R$" + p1.calcularPrecoFinal());
        System.out.println("P2: R$" + p2.calcularPrecoFinal());
        System.out.println("P3: R$" + p3.calcularPrecoFinal());
    }
}
