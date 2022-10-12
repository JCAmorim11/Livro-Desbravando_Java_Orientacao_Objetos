package livraria.produtos;

import livraria.Autor;

public class MiniLivro extends Livro {

    public MiniLivro(Autor autor) {
        super(autor);
    }

    @Override
    public double getValue() {
        return this.value;
    }

}