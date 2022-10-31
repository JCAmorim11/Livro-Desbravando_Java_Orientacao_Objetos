package br.livraria.produtos;

import br.livraria.Autor;

public class Ebook extends Livro implements Promocional {

    private String watermark;

    public Ebook(Autor autor){
        super(autor);
    }

    public String getWatermark() {
        return watermark;
    }

    public void setWatermark(String watermark) {
        this.watermark = watermark;
    }

    @Override
    public boolean desconto(double discount){
        if(discount > 0.15){
            return false;
        }
        System.out.println("ebook com desconto!");
        discount = getValue() * discount;
        setValue(getValue() - discount);
        return true;
    }

    @Override
    public boolean desconto10() {
        return Promocional.super.desconto10();
    }

    public String toString(){
        return "sou um ebook S2";
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
