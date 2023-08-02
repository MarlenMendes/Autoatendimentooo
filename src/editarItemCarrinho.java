import jdk.internal.loader.AbstractClassLoaderValue;

import java.util.Scanner;

public class editarItemCarrinho<AbstractClassLoaderValue> {
    private Scanner scanner;

    private void editarItemCarrinho() {
        System.out.println("Informe o código do produto que deseja editar: ");
        Scanner scanner = null;
        int codigo = Integer.parseInt(scanner.nextLine());
        Item item = buscarItemPorCodigo(codigo);

        if (item != null) {
            System.out.println("Nova quantidade: ");
            int quantidade = Integer.parseInt(scanner.nextLine());
            item.setQuantidade(quantidade);
            mostrarCarrinho ( );
        } else {
            System.out.println("Produto não encontrado");
        }
    }

    private Item buscarItemPorCodigo(int codigo) {
        Item[] carrinho = new Item[0];
        for (Item item : carrinho) {
            if (item.getCodigo() == codigo) {
                return item;
            }
        }
        return null;
    }

    private void removerItemCarrinho() {
        System.out.println("Informe o código do produto que deseja remover: ");
        Scanner scanner = null;
        int codigo = Integer.parseInt(scanner.nextLine());
        Item item = buscarItemPorCodigo(codigo);

        if (item != null) {
            AbstractClassLoaderValue carrinho = null;
            carrinho( );
            mostrarCarrinho();
        } else {
            System.out.println("Produto não encontrado");
        }
    }

    private void carrinho() {

    }

    private void finalizarPedido() {
        mostrarCarrinho();
        System.out.println("Selecione a forma de pagamento:");
        System.out.println("1. Cartão de Crédito");
        System.out.println("2. Cartão de Débito");
        System.out.println("3. Vale Refeição");
        System.out.println("4. Dinheiro");

        int opcao = Integer.parseInt(buscarItemPorCodigo ().nextLine());

        switch (opcao) {
            case 1:
            case 2:
            case 3:
                System.out.println("Compra finalizada com sucesso! Boa refeição");
                break;
            case 4:
                pagarComDinheiro();
                break;
            default:
                System.out.println("Opção inválida, tente novamente");
                finalizarPedido();
                break;
        }
    }

    private Scanner buscarItemPorCodigo() {
        return null;
    }

    private void mostrarCarrinho() {

    }

    private void pagarComDinheiro() {
        System.out.println("Informe o valor em dinheiro: ");
        double valorPago = Double.parseDouble(scanner.nextLine());

        double totalPedido = totalCarrinho();
        if (valorPago < totalPedido) {
            System.out.println("Valor insuficiente, tente novamente");
            pagarComDinheiro();
        } else {
            double troco = valorPago - totalPedido;
            System.out.println("Troco: R$" + troco);
            System.out.println("Compra finalizada com sucesso! Boa refeição");
        }
    }

    private double totalCarrinho() {
        double total = 0;
        Item[] carrinho = new Item[0];
        for (Item item : carrinho) {
            total += item.getQuantidade() * item.getPreco();
        }
        return total;
    }
}