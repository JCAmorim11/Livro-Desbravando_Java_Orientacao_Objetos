package livraria.teste;

import livraria.*;
import livraria.produtos.*;

import java.util.*;

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
        livro_Avinganca.setNome("Logica");
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


        CarrinhoCompras carro = new CarrinhoCompras(new Produto[100]);
        carro.add(ebook);carro.add(ebook);carro.add(ebook);carro.add(ebook);carro.add(ebook);carro.add(ebook);carro.add(ebook);carro.add(ebook);carro.add(ebook);carro.add(ebook);
        carro.add(ebook);
        carro.add(fisico);
       carro.add(revista);
       carro.add(livro_Avinganca);

   /*     ArrayList lista = new ArrayList();
        String valor = "Conhecendo arrays-lists";
        lista.add(valor);
        System.out.println(lista.contains(valor));
        lista.remove(valor);
        System.out.println(lista.contains(valor));


        lista.add(10);
        lista.add("nova string");
        lista.add(new Revista());
        int value =  (int) lista.get(0);*/

        List<Produto> produtos = new ArrayList<Produto>();
        produtos = carro.getProdutos();
     /*   for(Produto prod: produtos){
            System.out.println(prod);
        }*/
    //      Da erro
    //    produtos.add("affs, não sou um produto");

     /*   List<String> nomes = new ArrayList<>();
        nomes.add("martelo marvel");
        nomes.add("tsarita, kween do gelo");
        nomes.add("kusanali");
        nomes.add("yelan");
        nomes.add("ningguang");
        nomes.add("raiden ei");
        nomes.add("Hutao");
        nomes.add("yae miko");
        nomes.add("venti o bardo bebado");

        Collections.sort(nomes);
        System.out.println(nomes);*/

        // Collections.sort(produtos); --> Deu pau

   /*     HashSet<String> set = new HashSet<>();
        set.add("repetição em conjunto kkkkk");
        set.add("repetição em conjunto kkkkk");
        set.add("repetição em conjunto kkkkk");
        set.add("repetição em conjunto kkkkk");
        set.add("repetição em conjunto kkkkk");
        set.add("repetição em conjunto kkkkk");
        set.add("repetição em conjunto kkkkk");
        set.add("repetição em conjunto kkkkk");
        set.add("repetição em conjunto kkkkk");
        set.add("repetição em conjunto kkkkk");
        set.add("repetição em conjunto kkkkk");
        System.out.println(set.size());*/

     /*
     List<String> colecao = new List<String>();
     HashSet<String> colecao = new HashSet<String>();

        for(int i=0; i<100000; i++){
            colecao.add("item"+i);
        }

        long inicio = System.currentTimeMillis();

        for(int i=0; i<100000; i++){
            colecao.add("item"+i);
        }


        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;

        System.out.println("Demorou:"+tempo+" MS para executar");*/

        Map<String, Double> mapa = new HashMap<>();

        mapa.put("cab123",5.99);
        Double valor = mapa.get("cab123");

        System.out.println(valor);



    }

}
