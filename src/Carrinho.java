import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private final List<Item> itens;

    public Carrinho() { this.itens = new ArrayList<>(); }

    public void adicionarItem(Item item) { this.itens.add(item); }

    // Métodos para atualizar e remover um item do carrinho
    public void atualizarItem(int codigo, int quantidade) {
        for (Item item : itens) {
            if (item.getCodigo() == codigo) {
                item.setQuantidade(quantidade);
                break;
            }
        }
    }

    public void removerItem(int codigo) {
        itens.removeIf(item -> item.getCodigo() == codigo);
    }

    public double calcularTotalCarrinho() {
        double total = 0;
        for (Item item : itens) {
            total += item.calcularTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Item item : itens) {
            str.append(item.toString()).append("\n");
        }
        return str.toString();
    }
}
