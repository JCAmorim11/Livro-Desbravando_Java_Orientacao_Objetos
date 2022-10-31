package br.livraria.teste;

import br.livraria.Autor;
import br.livraria.CarrinhoCompras;
import br.livraria.CompradorNome;
import br.livraria.produtos.*;

import br.livraria.*;
import br.livraria.produtos.*;

import java.util.*;

import static java.util.Comparator.comparing;

public class ApplicationStart {
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
        livro_Avinganca.setNome("Brabra Logica de altas coisas");
        livro_Avinganca.setDescricao("Crie seus primeiros codigos");
        livro_Avinganca.setValue(59.99);
        livro_Avinganca.setIsbn("978-5-0405-6657-0");
        // livro_Avinganca.showDetails();
        Revista revista = new Revista();
        revista.setName("Pravda");
        revista.setValue(17);

        Ebook ebook = new Ebook(outroAutor);
        ebook.setNome("Estetica e ontologia");
        ebook.setValue(35.5);



        Ebook vishe = new Ebook(outroAutor);
        ebook.setNome("Novidades Java 8");
        ebook.setValue(35.5);



        CarrinhoCompras carro = new CarrinhoCompras(new Produto[100]);
        carro.add(ebook);carro.add(ebook);carro.add(ebook);carro.add(ebook);carro.add(ebook);carro.add(ebook);carro.add(ebook);carro.add(ebook);carro.add(ebook);carro.add(ebook);
        carro.add(ebook);
        carro.add(fisico);
        carro.add(revista);
        carro.add(livro_Avinganca);

        List<Livro> livros = Arrays.asList(fisico,livro_Avinganca,ebook);

    /*    Collections.sort(livros, new CompradorNome());

       */

     /*
     *  exemplo classe anonima
     *
     *
        Collections.sort(livros, new Comparator<Livro>() {
            @Override
            public int compare(Livro o1, Livro o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });
    */

        //Expressao lambda

       /*
       *
       * exemplo 1 de lambda
       * livros.sort((Livro l1, Livro l2) ->{
          return l1.getNome().compareTo(l2.getNome());
        }) ;*/

        /*
        *  exemplo2 lambda
        livros.sort(
                (l1,l2) -> l1.getNome().compareTo(l2.getNome())
        );*/

        //Exemplo3 lambda
        //livros.sort(comparing(l -> l.getNome()));

        //Exemplo4
     //   livros.sort(comparing(Livro::getNome));
        /*enhaanced-for:
        for(Livro livro: livros){

            System.out.println(livro.getNome());
        }**/

        //For-Each
        livros.forEach(l -> System.out.println(l.getNome()));

        List<Livro> filtrados = new ArrayList<>();

        for(Livro livro: livros){
            if(livro.getNome().contains("Java")){
                filtrados.add(livro);
            }
        }
        System.out.println("------------------------------------------------");
        for(Livro livro: filtrados){
            System.out.println(livro.getNome());
        }


    }

}
