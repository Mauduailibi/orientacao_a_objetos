public class Televisao implements DispositivoInteligente {
    
    @Override
    public void ligar() {
        System.out.println("Iniciando sistema Android TV");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando TV...");
    }
    
}
