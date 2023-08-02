import jdk.internal.jimage.ImageStrings;

import java.util.Scanner;

public class selecionarBebidas {
    private void selecionarBebida() {
        boolean sair = false;
        while (!sair) {
            System.out.println("Selecione a bebida: ");
            System.out.println("1. Refrigerante - R$ 8,00");
            System.out.println("2. Suco - R$ 6,00");

            try {
                Scanner scanner = null;
                int opcao = Integer.parseInt(scanner.nextLine());

                if (opcao == 1 || opcao == 2) {
                    System.out.println("Quantidade: ");
                    int quantidade = Integer.parseInt(scanner.nextLine());
                    Item item;
                    int codigoAtual = 0;
                    int codigo = 0;
                    String nome = null;
                    double preco = 0;
                    if (opcao == 1) {
                        item = new Item(codigoAtual++, "Refrigerante", 8.00, quantidade, codigo, nome, preco);
                    } else {
                        item = new Item(codigoAtual++, "Suco", 6.00, quantidade, codigo, nome, preco);
                    }
                    ImageStrings carrinho;
                    carrinho = null;
                    carrinho.add(String.valueOf(item));
                    mostrarCarrinho();
                    gerenciarCarrinho();
                    sair = true;
                } else {
                    System.out.println("Opção inválida, tente novamente");
                }
            } catch (NumberFormatException e) {
                System.out.println("Formato inválido, para escolher o item, você deve informar o número dele");
            }
        }
    }

    private void mostrarCarrinho() {
    }

    private void gerenciarCarrinho() {
        boolean sair = false;
        while (!sair) {
            System.out.println("Deseja incluir mais itens, editar um item, remover item ou finalizar o pedido? ");
            System.out.println("1. Incluir mais itens");
            System.out.println("2. Editar um item");
            System.out.println("3. Remover item");
            System.out.println("4. Finalizar pedido");

            try {
                Scanner scanner = null;
                int opcao = Integer.parseInt(scanner.nextLine());

                switch (opcao) {
                    case 1:
                        mostrarMenuInicial();
                        sair = true;
                        break;
                    case 2:
                        editarItemCarrinho();
                        break;
                    case 3:
                        removerItemCarrinho();
                        break;
                    case 4:
                        finalizarPedido();
                        sair = true;
                        break;
                    default:
                        System.out.println("Opção inválida, tente novamente");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Formato inválido, para escolher o item, você deve informar o número dele");
            }
        }
    }

    private void removerItemCarrinho() {

    }

    private void editarItemCarrinho() {

    }

    private void mostrarMenuInicial() {
    }

    private void finalizarPedido() {
    }
}