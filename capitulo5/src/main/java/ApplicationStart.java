public class ApplicationStart {
    public static void main(String[] args){

        Autor autor = new Autor();
        autor.setNome("Vladimir Lenny");
        autor.setEmail("vlad1917@pravda.com");
        autor.setCpf("24311919662");

        Livro livro = new Livro(autor);
        livro.setNome("Java 8");
        livro.setDescricao("Ensinando java 8");
        livro.setValor(59.99);
        livro.setIsbn("978-9-9610-1714-2");
        livro.showDetails();


        Autor outroAutor = new Autor();
        outroAutor.setNome("Jorge Lukacques");
        outroAutor.setEmail("outroJorgeLucas@gmail.com");
        outroAutor.setCpf("67343572792");

        Livro livro_Avinganca = new Livro(outroAutor);
        livro_Avinganca.setNome("Logica");
        livro_Avinganca.setDescricao("Crie seus primeiros codigos");
        livro_Avinganca.setValor(59.99);
        livro_Avinganca.setIsbn("978-5-0405-6657-0");
        livro_Avinganca.showDetails();

    }
}
