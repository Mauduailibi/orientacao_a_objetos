public class App {
    public static void main(String[] args) throws Exception {
        
        Vendedor v1 = new Vendedor("Mauricio", 2000.0);
        Vendedor v2  = new Vendedor("Almir", 1700.0);
        Gerente g1 = new Gerente("Bruno", 4000.0);
        
        System.out.println("Salario v1: " + v1.calcularSalario());
        System.out.println("Salario v2: " + v2.calcularSalario());
        System.out.println("Salario g1: " + g1.calcularSalario());
    }
}
