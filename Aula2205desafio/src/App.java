public class App {
    public static void main(String[] args) throws Exception {
        
        MaquinaDeCafe mc = new MaquinaDeCafe();

        mc.fazerCafe();

        mc.recarregar(10);

        mc.fazerCafe();

    }
}
