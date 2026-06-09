import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner(System.in);
        Quarto[] quartos = new Quarto[5];

        quartos[0] = new QuartoSimples(101, 100);
        quartos[1] = new QuartoSimples(102, 100);
        quartos[2] = new QuartoSimples(103, 100);
        quartos[3] = new QuartoLuxo(201, 250);
        quartos[4] = new QuartoLuxo(202, 250);

        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Hospedagem> hospedagens = new ArrayList<>();

        int opcao = 0;

        do {

            System.out.println("=== Mapa de Quartos ===");

            for(Quarto q : quartos) {
                if(q.getIsOcupado()) {
                    System.out.println(q.getNumero() + " - [OCUPADO]");
                } else {
                    System.out.println(q.getNumero() + " - [LIVRE]");
                }
            }

            System.out.println("======================");

            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Check-in");
            System.out.println("3 - Check-out");
            System.out.println("4 - Balanço de caixa");
            System.out.println("5 - Sair");

            System.out.println("Digite uma opção:");
            opcao = teclado.nextInt();
            teclado.nextLine();

            switch(opcao) {
                case 1:
                    System.out.println("Digite o nome do cliente: ");
                    String nome = teclado.nextLine();

                    System.out.println("Digite o CPF do cliente: ");
                    String cpf = teclado.nextLine();

                    clientes.add(new Cliente(nome, cpf));
                    break;
                case 2:
                    
                    for(int i = 0; i < clientes.size(); i++) {
                        System.out.println(i + " - " + clientes.get(i).getNome());
                    }

                    System.out.println("Digite o indice do cliente:");
                    int cid = teclado.nextInt();

                    System.out.println("Digite o numero do quarto:");
                    int nQuarto = teclado.nextInt();

                    System.out.println("Digite o numero de diárias:");
                    int nDiarias = teclado.nextInt();

                    for(Quarto q : quartos) {
                        if(!q.getIsOcupado() && q.getNumero() == nQuarto) {
                            q.setIsOcupado(true);
                            hospedagens.add(new Hospedagem(q, clientes.get(cid), nDiarias));
                            System.out.println("Hospedagem criada com sucesso!");
                            break;
                        } 
                    }
                    break;

                case 3:

                    System.out.println("Digite o numero do quarto para checkout:");
                    int nOut = teclado.nextInt();

                    for(Hospedagem h : hospedagens) {
                        if (h.getQuarto().getNumero() == nOut && h.getIsAtiva()) {

                            double total = h.getQuarto().calcularTotal(h.getDiarias());
                            System.out.println("Total a pagar: R$" + total);
                            h.getQuarto().setIsOcupado(false);
                            h.setIsAtiva(false);
                            h.setValorTotal(total);
                            System.out.println("Checkout realizado");
                            break;
                        }
                    }
                    break;

                case 4:

                    double totalCaixa = 0.0;

                    for(Hospedagem h : hospedagens) {
                        if(!h.getIsAtiva()) {
                            totalCaixa += h.getValorTotal();
                        }
                    }

                    System.out.println("Balanço total: R$" + totalCaixa);
                    break;

                case 5:
                    System.out.println("Fechando o programa...");
                    break;
                default:
                    System.out.println("Operação inválida!");
            }

        } while (opcao != 5);
    }
}
