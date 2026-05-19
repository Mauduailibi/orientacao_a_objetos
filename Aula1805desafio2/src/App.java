public class App {
    public static void main(String[] args) throws Exception {
        
        Conta conta1 = new Conta();

        conta1.titular = "Mauricio";
        conta1.saldo = 0.0;

        conta1.depositar(100);
        conta1.sacar(150);
        conta1.sacar(50);

        System.out.println("Saldo atual: " + conta1.saldo);
    }
}
