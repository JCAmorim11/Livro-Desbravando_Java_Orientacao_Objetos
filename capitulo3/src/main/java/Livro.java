public class Livro {
    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;

    public void showDetails(){
        String mensagem="Mostrando detalhes do livros";
        System.out.println(mensagem);
        System.out.println("Nome livro: "+nome);
        System.out.println("Descrição: "+descricao);
        System.out.println("Preço: "+valor);
        System.out.println("ISBN: "+isbn);
        if(temAutor()){
           autor.showDetails();
        }
        System.out.println("\n--------------\n");
    }

    public double desconto(double discount){
        return this.valor -= this.valor * discount;
    }

    boolean temAutor(){
        boolean notNull = this.autor != null;
        return notNull;
    }

}
