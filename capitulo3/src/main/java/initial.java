public class initial {
    public static void main(String[] args){
        Livro livro = new Livro();
        livro.nome="Java 8";
        livro.descricao="Ensinando java 8";
        livro.valor=59.99;
        livro.isbn="978-9-9610-1714-2";
        
        Autor autor = new Autor();
        autor.nome = "Vladimir Lenny";
        autor.email = "vlad1917@pravda.com";
        autor.cpf = "24311919662";         
        livro.autor = autor;

        
        livro.showDetails();
        Livro livro_Avinganca = new Livro();
        livro_Avinganca.nome = "Logica";
        livro_Avinganca.descricao="Crie seus primeiros codigos";
        livro_Avinganca.valor=59.99;
        livro_Avinganca.isbn="978-5-0405-6657-0";
        
        Autor outroAutor = new Autor();
        outroAutor.nome = "Jorge Lukacques";
        outroAutor.email = "outroJorgeLucas@gmail.com";
        outroAutor.cpf = "67343572792";

        livro_Avinganca.autor = outroAutor;
        System.out.println(livro_Avinganca.autor.nome);
        livro_Avinganca.showDetails();

        livro_Avinganca.autor.nome = "George Lukacques";
        System.out.println(livro_Avinganca.autor.nome);

        System.out.println("Valor atual: "+livro.valor);
       // livro.valor -= livro.valor * 0.1;
        System.out.println("Valor com desconto: "+livro.desconto(0.1));

        Livro livro1 = new Livro();
        Livro livro2 = new Livro();
        Livro livro3 = new Livro();
        Livro livro4 = new Livro();
        Livro livro5 = new Livro();







    }
}
