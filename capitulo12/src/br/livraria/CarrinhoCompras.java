package br.livraria;

import br.livraria.produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private double total;
    private ArrayList<Produto> produtos;
    private int contador = 0;

    public CarrinhoCompras(Produto[] produtos) {
        this.produtos = new ArrayList<>();
    }

    public void add(Produto produto) {
        this.produtos.add(produto);
    }

    public void remove(int posicao){
       this.produtos.remove(posicao);
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<Produto> getProdutos() {
        return produtos;

    }

}
