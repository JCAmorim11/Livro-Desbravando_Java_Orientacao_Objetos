package br.livraria.produtos;

import br.livraria.Autor;

public class MiniLivro extends Livro {

    public MiniLivro(Autor autor) {
        super(autor);
    }

    @Override
    public double getValue() {
        return this.value;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}