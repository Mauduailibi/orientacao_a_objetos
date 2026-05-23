public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria conta1 = new ContaBancaria("Mauricio");

        double saldo = conta1.getSaldo();
        System.out.println("Saldo atual: " + saldo);

        conta1.depositar(200.0);
        saldo = conta1.getSaldo();
        System.out.println("Saldo atual: " + saldo);

        conta1.sacar(500);
        saldo = conta1.getSaldo();
        System.out.println("Saldo atual: " + saldo);

        conta1.sacar(50.0);
        saldo = conta1.getSaldo();
        System.out.println("Saldo atual: " + saldo);
    }
}
