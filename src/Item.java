public class Item {
    private static int contador = 0;
    private final int codigo;
    private final String nome;
    private final double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade) {
        this.codigo = ++contador;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Item(int i, String refrigerante, double v, int quantidade, int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    // Getter e Setter
    public int getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public double calcularTotal() { return preco * quantidade; }

    @Override
    public String toString() {
        return "Codigo: " + codigo + ", Nome: " + nome + ", Preco: " + preco + ", Quantidade: " + quantidade;
    }
}
