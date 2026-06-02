public class App {
    public static void main(String[] args) throws Exception {
        
        PagamentoBoleto pb = new PagamentoBoleto(500.0);
        PagamentoCartao pc = new PagamentoCartao(150.0);

        pb.processarPagamento();
        pc.processarPagamento();
    }
}
