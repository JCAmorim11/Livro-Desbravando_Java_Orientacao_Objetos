package br.livraria;

import br.livraria.produtos.Livro;
import java.util.Comparator;

public class CompradorNome implements Comparator<Livro> {

    @Override
    public int compare(Livro l1, Livro l2) {
        return l1.getNome().compareTo(l2.getNome());
    }
}
