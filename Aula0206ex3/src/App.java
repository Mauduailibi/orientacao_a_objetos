import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
    
        ArrayList<String> produtos = new ArrayList<>();

        produtos.add("Notebook"); // posição 0
        produtos.add("TV"); // posição 1
        produtos.add("Controle remoto"); // posição 2

        for(String item : produtos) {
            System.out.println(item);
        }

        produtos.remove(1);

        for(String item : produtos) {
            System.out.println(item);
        }

        System.out.println(produtos.size());

    }
}
