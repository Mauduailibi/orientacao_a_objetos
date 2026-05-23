public class App {
    public static void main(String[] args) throws Exception {
        
        ArCondicionado ac = new ArCondicionado("LG");

        ac.aumentarTemperatura();

        ac.ligar();

        ac.aumentarTemperatura();
        ac.diminuirTemperatura();

        ac.desligar();

    }
}
