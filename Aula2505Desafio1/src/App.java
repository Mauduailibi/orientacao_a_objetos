public class App {
    public static void main(String[] args) throws Exception {

        String nomeAnimal;

        Animal a1 = new Animal("Horacio", 10);

        a1.dormir();
        nomeAnimal = a1.getNome();
        System.out.println(nomeAnimal);

        Cachorro a2 = new Cachorro("Thor", 2);

        a2.dormir();
        a2.latir();
        nomeAnimal = a2.getNome();
        System.out.println(nomeAnimal);

        Gato a3 = new Gato("Manteguinha", 8);

        a3.dormir();
        a3.miar();
        nomeAnimal = a3.getNome();
        System.out.println(nomeAnimal);
    }
}
