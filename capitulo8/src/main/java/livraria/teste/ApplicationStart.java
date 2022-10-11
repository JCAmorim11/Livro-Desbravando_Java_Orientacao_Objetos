package livraria.teste;
import livraria.*;
import livraria.produtos.*;

public class ApplicationStart {
    public static void main(String[] args){

        Autor autor = new Autor();
        autor.setNome("Vladimir Lenny");
        autor.setEmail("vlad1917@pravda.com");
        autor.setCpf("24311919662");

        LivroFisico fisico= new LivroFisico(autor);
        fisico.setNome("Java 8");
        fisico.setDescricao("Ensinando java 8");
        fisico.setValor(59.99);
        fisico.setIsbn("978-9-9610-1714-2");

        if (fisico.desconto10()) {
            System.out.println("Valor do livro:"+fisico.getNome()+", com desconto: "+ fisico.getValor());
        }

        System.out.println("\n -------------------------------------------- \n");

        Revista livro = new Revista();
        livro.setValue(39.90);
        livro.setName("Cultura dos imperios e imperialismo");
        if(!livro.desconto(0.1)){
            System.out.println("O desconto nao podes ser a aplicado ao produto");
        }else {
            System.out.println("O valor do livro:"+livro.getName()+", com desconto é: "+livro.getValue());
        }


       fisico.showDetails();
/*

        Autor outroAutor = new Autor();
        outroAutor.setNome("Jorge Lukacques");
        outroAutor.setEmail("outroJorgeLucas@gmail.com");
        outroAutor.setCpf("67343572792");

        Ebook livro_Avinganca = new Ebook(outroAutor);
        livro_Avinganca.setNome("Logica");
        livro_Avinganca.setDescricao("Crie seus primeiros codigos");
        livro_Avinganca.setValor(59.99);
        livro_Avinganca.setIsbn("978-5-0405-6657-0");
       // livro_Avinganca.showDetails();


        if(!fisico.desconto(0.3)){
            System.out.println("O desconto nao podes ser maior que 30%");
        }else {
            System.out.println("O valor do livro com desconto é: "+fisico.getValor());
        }
        System.out.println("\n -------------------------------------------- \n");
        Ebook ebook = new Ebook(autor);
        ebook.setValor(30.91);
        ebook.setNome("Saiba o que fazer");
        ebook.showDetails();

        if(!ebook.desconto(0.3)){
            System.out.println("O desconto nao podes ser maior que 15%");
        }else {
            System.out.println("O valor do livro com desconto é: "+ebook.getValor());
        }*/


     /*
        Codigo para testar se livro ainda pode ser usado
        Livro novo = new Livro(autor);
        livro.setNome("vanguarda");
    */


    }
}
