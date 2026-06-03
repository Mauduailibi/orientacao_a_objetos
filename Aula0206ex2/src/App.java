public class App {
    public static void main(String[] args) throws Exception {
        
        Aluno[] classe = new Aluno[4];

        classe[0] = new Aluno("Mauricio", 7.8, 9.2);
        classe[1] = new Aluno("Bruno", 8.0, 7.0);
        classe[2] = new Aluno("Carlos", 5.0, 6.5);
        classe[3] = new Aluno("Davi", 8.9, 3.7);

        double somaNotas = 0;

        for(int i = 0; i < classe.length; i++) {
            somaNotas += classe[i].getMedia();
        }

        System.out.println("Media da turma: " + somaNotas / classe.length);
    }
}
