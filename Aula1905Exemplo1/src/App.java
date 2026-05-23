public class App {
    public static void main(String[] args) throws Exception {

        Carro c1 = new Carro("Civic", "Honda", 2020, "Branco");

        System.out.println("Carro 1: " + c1.getMarca());

        c1.setMarca("Ford");
        c1.setAno(2021);

        System.out.println("Carro 1: " + c1.getMarca());
        System.out.println(c1.getAno());
    }
}
