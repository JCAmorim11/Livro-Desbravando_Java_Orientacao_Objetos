package livraria;
import livraria.produtos.*;

public class CarrinhoCompras {
    private double total;
    private Object[] produtos = new Produto[10];
    private int contador = 0;

    public void add(Object object) {
        System.out.println("Adicionando: " + object);
        this.produtos[contador] = object;
        contador++;
        Produto molde = (Produto) object;
        this.total += molde.getValue();
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
