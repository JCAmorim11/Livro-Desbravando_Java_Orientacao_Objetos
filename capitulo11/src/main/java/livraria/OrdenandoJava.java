package livraria;

import livraria.produtos.Ebook;
import livraria.produtos.LivroFisico;
import livraria.produtos.Produto;
import livraria.produtos.Revista;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenandoJava {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Vladimir Lenny");
        autor.setEmail("vlad1917@pravda.com");
        autor.setCpf("24311919662");

        Autor autor2 = new Autor();
        autor.setNome("Vladimir Lenny");
        autor.setEmail("vlad1917@pravda.com");
        autor.setCpf("24311919662");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Java 8");
        fisico.setDescricao("Ensinando java 8");
        fisico.setValue(59.99);
        fisico.setIsbn("978-9-9610-1714-2");


        System.out.println("\n -------------------------------------------- \n");


        Autor outroAutor = new Autor();
        outroAutor.setNome("Jorge Lukacques");
        outroAutor.setEmail("outroJorgeLucas@gmail.com");
        outroAutor.setCpf("67343572792");

        Ebook livro_Avinganca = new Ebook(outroAutor);
        livro_Avinganca.setNome("Logica");
        livro_Avinganca.setDescricao("Crie seus primeiros codigos");
        livro_Avinganca.setValue(59.99);
        livro_Avinganca.setIsbn("978-5-0405-6657-0");
        // livro_Avinganca.showDetails();
        Revista revista = new Revista();
        revista.setName("Pravda");
        revista.setValue(17);

        List<Produto> produtos = Arrays.asList(fisico, livro_Avinganca);

        Collections.sort(produtos);

        for(Produto prod: produtos){
            System.out.println(prod.getValue());
        }


    }









}
