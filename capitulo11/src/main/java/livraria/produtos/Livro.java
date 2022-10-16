package livraria.produtos;

import livraria.Autor;
import livraria.exceptions.AutorNuloExc;

public abstract class Livro implements Produto {

    private String nome;
    private String descricao;
    protected double value;
    private String isbn;
    private Autor autor;

    public Livro(Autor autor){
        if(autor == null){
            throw new AutorNuloExc("O autor do livro não pode ser nulo");
        }
        this.isbn = "000-00-00000-00-0";
        this.autor = autor;
    }
    /*
    *
    * Exemplo de Overload
    * */
    public void showDetails(){
        String mensagem="Mostrando detalhes do livros";
        System.out.println(mensagem);
        System.out.println("Nome livro: "+nome);
        System.out.println("Descrição: "+descricao);
        System.out.println("Preço: "+value);
        System.out.println("ISBN: "+isbn);
        if(temAutor()){
           autor.showDetails();
        }
        System.out.println("\n--------------\n");
    }

    @Override
    public String toString() {
        System.out.println("Nome: "+nome);
        System.out.println("Descrição: "+descricao);
        System.out.println("Valor: "+value);
        System.out.println("ISBN: "+isbn);

        if(this.temAutor()) autor.toString();

        return "\n ----- \n";

    }



    boolean temAutor(){
        boolean notNull = this.autor != null;
        return notNull;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double valor) {
        this.value = valor;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }



}
