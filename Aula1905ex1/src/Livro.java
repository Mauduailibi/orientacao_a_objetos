public class Livro {
    String titulo;
    String autor;
    boolean disponivel;

    public void ler() {
        System.out.println("Lendo o livro...");
    }

    public void emprestar() {
        if (this.disponivel == true) {
            this.disponivel = false;
            System.out.println("Emprestimo realizado.");
        } else {
            System.out.println("Livro indisponível.");
        }
    }

    public void devolver() {
        this.disponivel = true;
        System.out.println("Livro devolvido.");
    }
}
