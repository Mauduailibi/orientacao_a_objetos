public class App {
    public static void main(String[] args) throws Exception {
        
        Funcionario f1 = new Funcionario("Abner", 2000);

        double bonus;

        bonus = f1.calcularBonus();
        System.out.println("Bonus funcionario: " + bonus);

        Gerente f2 = new Gerente("Bruno", 5000);

        bonus = f2.calcularBonus();
        System.out.println("Bonus gerente: " + bonus);

    }
}
