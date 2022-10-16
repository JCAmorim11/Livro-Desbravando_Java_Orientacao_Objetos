package livraria.produtos;

import livraria.Editora;

public class Revista implements Produto, Promocional {
    private String name;
    private String description;
    private double value;
    private Editora editora;

    public boolean desconto(double discount){
        if (discount > 0.1){
            return false;
        }
        discount = getValue() * discount;
        setValue(getValue() - discount);
        return true;
    }

    @Override
    public boolean desconto10() {
        return Promocional.super.desconto10();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int compareTo(Produto outro) {
        return 0;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
