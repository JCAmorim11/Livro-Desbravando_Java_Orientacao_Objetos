package livraria;
import livraria.produtos.*;

import java.io.FileNotFoundException;

public class CarrinhoCompras {
    private double total;
    private Produto[] produtos = new Produto[10];
    private int contador = 0;

    public void add(Produto livro) {
        System.out.println("Adicionando: " + livro);
        this.produtos[contador] = livro;
        contador++;
        this.total += livro.getValue();
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void getProdutos() {
     /*   for(Produto produto : produtos) {
            if (produto != null){
                System.out.println(produto.getValue());
            }

        }*/

        /*
        Existem varios tipos de exceção
        as genericas vindas da classe Exception
        e as mais especificas derivadas dela como o ArrayIndexOutOfBoundsException
        existem exceções unchecked e as checkeds
        unchecked = O java permite que o codigo seja compilado sem comportamentos preparados para caso elas ocorram
        checked = O java não permite que o codigo seja compilado a menos que tenha um try/catch para a possibilidade da exceção, só depois
        dela estar explicitamente no codigo qu

         */
        for (int i = 0; i <= produtos.length; i++) {
            try {
                Produto produto = produtos[i];
                if (produto != null) {
                    System.out.println(produto.getValue());
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("indice nao existente: " + i);
            } catch (Exception e) {
                System.out.println("Exception: " + e);
                e.printStackTrace();
            }

            System.out.println("fui executado!");
        }




    }}
