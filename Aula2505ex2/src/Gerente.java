public class Gerente extends Funcionario {

    public Gerente(String n, double s) {
        super(n, s);
    }

    @Override
    public double calcularBonus() {
        return this.salario * 0.2;
    }

}
