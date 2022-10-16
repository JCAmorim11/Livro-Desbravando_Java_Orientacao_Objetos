package livraria;

public class CarrinhoCompras {
    private double total;
    private Produto[] produtos;
    private int contador = 0;

    public CarrinhoCompras(Produto[] produtos) {
        this.produtos = produtos;
    }

    public void add(Produto produto) {
        System.out.println("Adicionando: " + produto);this.produtos[contador] = produto;
        contador++;
        this.total += produto.getValue();
    }

    public void remove(int posicao){
       this.produtos[posicao] = null;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Object[] getProdutos() {
        return this.produtos;

    }

}
