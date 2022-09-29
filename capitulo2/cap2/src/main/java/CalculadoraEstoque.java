
public class CalculadoraEstoque {
    public static void main(String[] args){
        double livroJava20000;
        double livroTDD;

        livroJava20000 = 59.99;
        livroTDD = 23;
        double soma = livroJava20000 + livroTDD;

        System.out.println("O total em estoque é: "+soma);

        TiposPrimitivos tipos = new TiposPrimitivos();
        tipos.func1();


        //(Erro: int mais double é impossível)
        // int soma2 = 30 + livroTDD;
        // (Erro: int nao pode ter como atribuiçao um double)
        // int inteiro = livroTDD

        int inteiro = (int) livroTDD;
        int inteiro2 = (int) livroJava20000;


        if( soma < 150){
            System.out.println("Seu estoque está muito baixo!");
        } else if( soma >= 200000){
            System.out.println("Seu estoque está muito alto!");
        } else {
            System.out.println(" Seu estoque está bom!");
        }

        //toda pergunta logica retorna um boolean, por isso a expressão abaixo é valida
        boolean res = soma < 150;
        System.out.println(res);

        double soma2 =0;
        int contador =0;
        while(contador<35){
            double valorLivro = 59.90;
            soma2 += valorLivro;
            contador++;
        }
        System.out.println(soma2);


        if( soma2 < 150){
            System.out.println("Seu estoque está muito baixo!");
        } else if( soma2 >= 2000){
            System.out.println("Seu estoque está muito alto!");
        } else {
            System.out.println(" Seu estoque está bom!");
        }
        double soma3=0;
        for(int i=0;i<36;i++){
            soma3+=59.99;
        }

        System.out.println(soma3);


        if( soma3 < 150){
            System.out.println("Seu estoque está muito baixo!");
        } else if( soma3 >= 2000){
            System.out.println("Seu estoque está muito alto!");
        } else {
            System.out.println(" Seu estoque está bom!");
        }


    }

}
