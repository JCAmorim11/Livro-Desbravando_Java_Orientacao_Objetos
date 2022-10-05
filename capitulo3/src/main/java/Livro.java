public class Livro {
    String nome;
    String descricao;
    double valor;
    String isbn;

    public void showDetails(){
        String mensagem="Mostrando detalhes do livros";
        System.out.println(mensagem);
        System.out.println(nome);
        System.out.println(descricao);
        System.out.println(valor);
        System.out.println(isbn);
        System.out.println("\n--------------\n");
    }

}
