public class Livro {
    private String nome;
    private String descricao;
    protected double valor;
    private String isbn;
    private Autor autor;

    /*
    *
    * Exemplo de Overload
    * */
    public Livro(){
        this.isbn = "000-00-00000-00-0";
    }

    public Livro(Autor autor){
        this();
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
        System.out.println("Preço: "+valor);
        System.out.println("ISBN: "+isbn);
        if(temAutor()){
           autor.showDetails();
        }
        System.out.println("\n--------------\n");
    }

    public boolean desconto(double discount){
        if(discount > 0.3){
            return false;
        }
        System.out.println("livro com desconto!");
        this.valor -= this.valor * discount;
        return true;
    }

    boolean temAutor(){
        boolean notNull = this.autor != null;
        return notNull;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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
