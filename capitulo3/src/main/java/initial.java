public class initial {
    public static void main(String[] args){
        Livro livro = new Livro();
        livro.nome="Java 8";
        livro.descricao="Ensinando java 8";
        livro.valor=59.99;
        livro.isbn="978-9-9610-1714-2";

        livro.showDetails();
        Livro livro_Avinganca = new Livro();
        livro_Avinganca.nome = "Logica";
        livro_Avinganca.descricao="Crie seus primeiros codigos";
        livro_Avinganca.valor=59.99;
        livro_Avinganca.isbn="978-5-0405-6657-0";

        livro_Avinganca.showDetails();







    }
}
