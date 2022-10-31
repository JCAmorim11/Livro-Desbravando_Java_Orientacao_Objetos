package br.livraria.produtos;

import br.livraria.Autor;

public class LivroFisico extends Livro implements Promocional {

    public LivroFisico(Autor autor){
        super(autor);
    }

    public LivroFisico() {
        super(null);
    }

    public double getTaxaImpressao(){
        return this.getValue() *0.05;
    }

    @Override
    public boolean desconto(double discount){
        if(discount > 0.3){
            return false;
        }
        System.out.println("livro com desconto!");
        discount = getValue() * discount;
        setValue(getValue() - discount);
        return true;
    }

    @Override
    public boolean desconto10() {
        return Promocional.super.desconto10();
    }

    @Override
    public double getValue() {
        return this.value;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
