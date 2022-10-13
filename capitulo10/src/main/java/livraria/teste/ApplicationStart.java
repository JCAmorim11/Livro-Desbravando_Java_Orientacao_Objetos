package livraria.teste;

import livraria.*;
import livraria.produtos.*;
import java.io.FileNotFoundException;
import java.util.Random;

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

        CarrinhoCompras carro = new CarrinhoCompras();
        carro.add(fisico);
        carro.add(livro_Avinganca);
        carro.add(revista);
        carro.add(ebook);
        carro.add(ebook);
        carro.add(ebook);
        carro.add(ebook);
        carro.add(ebook);
        carro.add(ebook);
        carro.add(ebook);

        Object[] produtos = carro.getProdutos();

        System.out.println("\n -------------------------------------------- \n");
   /*    for(Object object: produtos){
           try
           {
               Produto molde = (Produto) object;
               System.out.println(molde.getValue());
           }catch (Exception e){
                System.out.println("O objeto não implementa produto");
           }

       }*/

       // System.out.println(ebook.toString());

        if(autor == autor2){
            System.out.println("Igual");
        }
        else{
            System.out.println("Diferente");
        }

        /*if(autor.equals(autor2)){
            System.out.println("Igual");
        }
        else{
            System.out.println("Diferente");
        }*/

        System.out.println("São iguais: "+autor.equals(autor2));
        System.out.println(autor.getClass().getSimpleName());

        Integer inte = new Integer(10);
        int valor =  inte.intValue();
        System.out.println("\n--------------------------------------\n");

        boolean res = Boolean.parseBoolean("false");
        byte parseByte = Byte.parseByte("1" );
        short parseShort = Short.parseShort("10");
        int parseInt = Integer.parseInt("100");
        long parseLong = Long.parseLong("1000");
        float parseFloat = Float.parseFloat("10.1");
        double parseDouble = Double.parseDouble("100.2");
        System.out.println(valor+"\nboolean:"+res+"\nbyte:"+parseByte+"\nshort:"+parseShort+"\nint:"+parseInt+
                "\nlong:"+parseLong+"\nfloat"+parseFloat+"\ndouble:"+parseDouble);

        System.out.println("\n--------------------------------------");

        long round = Math.round(3.99);
        long max = Math.max(100, 10);
        int min = Math.min(100,10);
        int abs = Math.abs(-30);
        double sqrt = Math.sqrt(4);
        System.out.println("\nround:"+round+"\nmax:"+max+"\nmin:"+min+"\nabs:"+abs+
                "\nsqrt:"+sqrt);

        System.out.println("\n--------------------------------------");

        Random random = new Random();
        System.out.println(random.nextInt(10));
        System.out.println("\n--------------------------------------");

        String java = "java";
        String java2 = "java";
        System.out.println(java.equals(java2));
        System.out.println(java == java2);
        java.replace("v", "c");
        System.out.println(java);
        String novaString = java.replace("v","c");
        System.out.println(novaString);
        System.out.println("\n--------------------------------------");

        String replace = java.replace("v", "c");
        String upperCase = java.toUpperCase();
        String lowerCase = "JAVA".toLowerCase();
        char charAt = java.charAt(0);
        boolean endsWith = java.endsWith("a");
        boolean startsWith = java.startsWith("s");
        boolean equals = java.equalsIgnoreCase("JAVA");
        System.out.println("\nreplace:"+replace+"\nupper case:"+upperCase+"\nlower case:"+lowerCase+"\nchar at:"+charAt+
                "\nends with:"+endsWith+"\nstarts with:"+startsWith+"\nequals:"+equals);


    }



}
