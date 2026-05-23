public class App {
    public static void main(String[] args) throws Exception {
        Lampada lampada = new Lampada("Azul");

        lampada.ligar();
        lampada.imprimirStatus();

        lampada.desligar();
        lampada.imprimirStatus();

        lampada.imprimirStatus();
    }
}
