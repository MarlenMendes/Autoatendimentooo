import java.util.Scanner;

public class FastFoodApp {
    private final Carrinho carrinho;
    private final Scanner scanner;

    public FastFoodApp() {
        this.carrinho = new Carrinho();
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenuPrincipal() {
        System.out.println("Escolha uma opção:");
        System.out.println("1. Lanche");
        System.out.println("2. Bebida");
        System.out.println("0. Finalizar pedido");
    }

    public void exibirMenuLanche() {
        System.out.println("Escolha um lanche:");
        System.out.println("1. X-burger - R$ 10,00");
        System.out.println("2. X-salada - R$ 12,00");
        System.out.println("0. Voltar");
    }

    public void exibirMenuBebida() {
        System.out.println("Escolha uma bebida:");
        System.out.println("1. Refrigerante - R$ 8,00");
        System.out.println("2. Suco - R$ 6,00");
        System.out.println("0. Voltar");
    }

    public void iniciar() {
        int opcao;
        do {
            exibirMenuPrincipal();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    processarLanches();
                    break;
                case 2:
                    processarBebidas();
                    break;
                case 0:
                    finalizarPedido();
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
            }

        } while (opcao != 0);
    }

    private void processarLanches() {
        int opcao;
        do {
            exibirMenuLanche();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarItemAoCarrinho("X-burger", 10.00);
                    break;
                case 2:
                    adicionarItemAoCarrinho("X-salada", 12.00);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida, tente novamente");
            }

        } while (opcao != 0);
    }

    private void processarBebidas() {
        int opcao;
        do {
            exibirMenuBebida();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    adicionarItemAoCarrinho("Refrigerante", 8.00);
                    break;
                case 2:
                    adicionarItemAoCarrinho("Suco", 6.00);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida, tente novamente");
            }

        } while (opcao != 0);
    }

    private void adicionarItemAoCarrinho(String nome, double preco) {
        System.out.println("Digite a quantidade:");
        int quantidade = scanner.nextInt();
        Item item = new Item(nome, preco, quantidade);
        carrinho.adicionarItem(item);
        System.out.println("Item adicionado ao carrinho");
    }

    private void finalizarPedido() {
        // Implementação da lógica de finalização do pedido
    }

    public static void main(String[] args) {
        FastFoodApp app = new FastFoodApp();
        app.iniciar();
    }
}
